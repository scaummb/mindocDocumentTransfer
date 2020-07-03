package com.example.mindoc_transfer.core.provider;

import org.jooq.ContextTransactionalRunnable;
import org.jooq.DSLContext;
import org.jooq.TransactionalRunnable;

/**
 * @author moubin.mo
 * @date: 2020/7/3 11:51
 */

public class TxProviderImpl implements TxProvider {

	private final DSLContext dslContext;

	public TxProviderImpl(DSLContext dslContext) {
		this.dslContext = dslContext;
	}

	public void transaction(ContextTransactionalRunnable callable) {
		this.dslContext.transaction((x) -> {
			callable.run();
		});
	}

	@Override
	public void transaction(TransactionalRunnable runnable) {
		this.dslContext.transaction((x) -> {
			this.dslContext.transaction(runnable);
		});
	}

}
