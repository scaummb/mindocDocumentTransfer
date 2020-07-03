package com.example.mindoc_transfer.core.provider;

import com.example.mindoc_transfer.core.bean.MindocBooks;
import com.example.mindoc_transfer.core.constants.TransferConstants;
import com.example.mindoc_transfer.db.pojo.tables.records.MdBooksRecord;
import org.jooq.DSLContext;
import org.jooq.SelectQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author moubin.mo
 * @date: 2020/7/3 10:16
 */
@Component
public class MdBookeProviderImpl implements MdBookProvider{
	@Autowired
	private DSLContext dslContext;

	@Override
	public List<MindocBooks> listBooksByIds(List<Integer> ids) {
		SelectQuery<MdBooksRecord> query = dslContext.selectQuery(TransferConstants.MD_BOOKS);
		query.addConditions(TransferConstants.MD_BOOKS.BOOK_ID.in(ids));
		return query.fetchInto(MindocBooks.class);
	}
}
