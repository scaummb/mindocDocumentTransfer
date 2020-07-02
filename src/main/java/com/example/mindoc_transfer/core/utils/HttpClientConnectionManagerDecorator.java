package com.example.mindoc_transfer.core.utils;

import org.apache.http.HttpClientConnection;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.conn.ConnectionRequest;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.protocol.HttpContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class HttpClientConnectionManagerDecorator implements HttpClientConnectionManager {

    private static final Logger LOGGER = LoggerFactory.getLogger(HttpClientConnectionManagerDecorator.class);
    private Map<HttpClientConnection, String> routeInfoMap = new HashMap<>();
    private Map<HttpClientConnection, Long> startTimeMap = new HashMap<>();

    private final HttpClientConnectionManager manager;

    public HttpClientConnectionManagerDecorator(HttpClientConnectionManager manager) {
        this.manager = manager;
    }

    @Override
    public ConnectionRequest requestConnection(HttpRoute route, Object state) {
        return new ConnectionRequestProxy(manager.requestConnection(route, state), route);
    }

    @Override
    public void releaseConnection(HttpClientConnection conn, Object newState, long validDuration, TimeUnit timeUnit) {
        if (LOGGER.isDebugEnabled()) {
            Long timeCost = startTimeMap.get(conn) == null ? 0 : System.currentTimeMillis() - startTimeMap.get(conn);
            LOGGER.debug("HttpClient request excuted {} ms long,the route info = {}", timeCost, routeInfoMap.get(conn));
        }
        routeInfoMap.remove(conn);
        startTimeMap.remove(conn);
        manager.releaseConnection(conn, newState, validDuration, timeUnit);
    }

    @Override
    public void connect(HttpClientConnection conn, HttpRoute route, int connectTimeout, HttpContext context) throws IOException {
        manager.connect(conn, route, connectTimeout, context);
    }

    @Override
    public void upgrade(HttpClientConnection conn, HttpRoute route, HttpContext context) throws IOException {
        manager.upgrade(conn, route, context);
    }

    @Override
    public void routeComplete(HttpClientConnection conn, HttpRoute route, HttpContext context) throws IOException {
        manager.routeComplete(conn, route, context);
    }

    @Override
    public void closeIdleConnections(long idletime, TimeUnit tunit) {
        manager.closeIdleConnections(idletime, tunit);
    }

    @Override
    public void closeExpiredConnections() {
        manager.closeExpiredConnections();
    }

    @Override
    public void shutdown() {
        manager.shutdown();
    }

    public class ConnectionRequestProxy implements ConnectionRequest {
        private final ConnectionRequest connectionRequest;
        private final HttpRoute route;

        public ConnectionRequestProxy(ConnectionRequest connectionRequest, HttpRoute route) {
            this.connectionRequest = connectionRequest;
            this.route = route;
        }

        @Override
        public HttpClientConnection get(long timeout, TimeUnit tunit) throws InterruptedException, ExecutionException, ConnectionPoolTimeoutException {
            HttpClientConnection clientConnection = connectionRequest.get(timeout, tunit);
            routeInfoMap.put(clientConnection, this.route.toString());
            startTimeMap.put(clientConnection, System.currentTimeMillis());
            return clientConnection;
        }

        @Override
        public boolean cancel() {
            return connectionRequest.cancel();
        }


    }

}
