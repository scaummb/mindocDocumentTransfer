package com.example.mindoc_transfer.core.provider;

import com.everhomes.tachikoma.commons.util.bean.ConvertHelper;
import com.example.mindoc_transfer.core.bean.MindocBooks;
import com.example.mindoc_transfer.core.constants.TransferConstants;
import com.example.mindoc_transfer.db.pojo.tables.daos.MdBooksDao;
import com.example.mindoc_transfer.db.pojo.tables.pojos.MdBooks;
import com.example.mindoc_transfer.db.pojo.tables.records.MdBooksRecord;
import org.jooq.DSLContext;
import org.jooq.SelectQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
	public List<MindocBooks> listBooksByIds(List<Integer> ids) {
		List<MindocBooks> list = new ArrayList<>(ids.size());
		MdBooksDao dao = new MdBooksDao(dbProvider.getDbConfiguration());

		if (!CollectionUtils.isEmpty(ids)){
			for (Integer id : ids) {
				List<MdBooks> mdBooks = dao.fetchByBookId(id);
				if (!CollectionUtils.isEmpty(mdBooks)){
					list.add(ConvertHelper.convert(mdBooks.get(0), MindocBooks.class));
				}
			}
			return list;
		}
		return Collections.emptyList();
	}

	@Override
	public MindocBooks findBookById(int id) {
		SelectQuery<MdBooksRecord> query = dslContext.selectQuery(TransferConstants.MD_BOOKS);
		query.addConditions(TransferConstants.MD_BOOKS.BOOK_ID.eq(id));
		return ConvertHelper.convert(query.fetchOne(), MindocBooks.class);
	}
}
