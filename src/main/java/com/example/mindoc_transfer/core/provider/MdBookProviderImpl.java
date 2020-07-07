package com.example.mindoc_transfer.core.provider;

import com.everhomes.tachikoma.commons.util.bean.ConvertHelper;
import com.example.mindoc_transfer.core.bean.MindocBooks;
import com.example.mindoc_transfer.core.constants.TransferConstants;
import com.example.mindoc_transfer.db.pojo.tables.records.MdBooksRecord;
import org.jooq.DSLContext;
import org.jooq.SelectQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author moubin.mo
 * @date: 2020/7/3 10:16
 */
@Component
public class MdBookProviderImpl implements MdBookProvider{

	@Autowired
	private DbProvider dbProvider;

	@Autowired
	private DSLContext dslContext;

	@Override
	public MindocBooks findBookById(int id) {
		SelectQuery<MdBooksRecord> query = dslContext.selectQuery(TransferConstants.MD_BOOKS);
		query.addConditions(TransferConstants.MD_BOOKS.BOOK_ID.eq(id));
		return ConvertHelper.convert(query.fetchOne(), MindocBooks.class);
	}
}
