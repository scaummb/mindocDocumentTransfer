package com.example.mindoc_transfer.core.provider;

import org.jooq.ContextTransactionalRunnable;
import org.jooq.TransactionalRunnable;

/**
 * @author moubin.mo
 * @date: 2020/7/3 11:50
 */

public interface TxProvider {

	void transaction(ContextTransactionalRunnable callable);

	void transaction(TransactionalRunnable transactional);
}
