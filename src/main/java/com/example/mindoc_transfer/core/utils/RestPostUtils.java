package com.example.mindoc_transfer.core.utils;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.Map;

/**
 * @author moubin.mo
 * @date: 2020/4/16 14:59
 */

public class RestPostUtils {

	private static final Logger LOGGER = LoggerFactory.getLogger(RestPostUtils.class);

	/**
	 * <p>统一请求OPC</p>
	 * @param url
	 * @param params
	 * @param responseObjClass
	 * @return Object
	 */
	public static Object doPostRequestToOPC(String url, Map<String,String> params, Class<?> responseObjClass){
		String response = null;
		try {
			response = HttpUtils.post(url, params, 600, false);
		} catch (Exception e) {
			LOGGER.error("Core requests to opc exception! url = {}, params ={}, {}", url, params, e);
		}

		if (!StringUtils.isEmpty(response)) {
			return parseResponseToPojo(response, responseObjClass);
		}
		return response;
	}

	/**
	 * <p>根据传入类转换为JavaObject</p>
	 * @param response
	 * @param objectClassName
	 * @return Object
	 */
	public static Object parseResponseToPojo(String response, Class<?> objectClassName) {
		Map<String ,Object> jsonmap =  JSONObject.parseObject(response);
		if (!CollectionUtils.isEmpty(jsonmap)){
			JSONObject responseJsonObject = (JSONObject) jsonmap.get("response");
			try {
				return JSONObject.toJavaObject(responseJsonObject, objectClassName);
			} catch (Exception e){
				System.out.println(e);
			}
		}
		return null;
	}
}
