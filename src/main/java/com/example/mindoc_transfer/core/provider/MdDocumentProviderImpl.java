package com.example.mindoc_transfer.core.provider;

import com.everhomes.tachikoma.commons.util.bean.ConvertHelper;
import com.example.mindoc_transfer.core.bean.MindocDocuments;
import com.example.mindoc_transfer.core.constants.TransferConstants;
import com.example.mindoc_transfer.db.pojo.tables.records.MdDocumentsRecord;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.jooq.SelectQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author moubin.mo
 * @date: 2020/7/4 17:55
 */
@Component
public class MdDocumentProviderImpl implements MdDocumentProvider {

	@Autowired
	private DbProvider dbProvider;

	@Autowired
	private DSLContext dslContext;

	@Override
	public List<MindocDocuments> listDocumentsByParentIdAndBookId(Integer bookId, Integer parentId) {
		SelectQuery<MdDocumentsRecord> query = dslContext.selectQuery(TransferConstants.MD_DOCUMENTS);
		query.addConditions(TransferConstants.MD_DOCUMENTS.BOOK_ID.eq(bookId));
		query.addConditions(TransferConstants.MD_DOCUMENTS.PARENT_ID.eq(parentId));
		Result<MdDocumentsRecord> records = query.fetch();
		if (!CollectionUtils.isEmpty(records)){
			return records.stream().map(r->ConvertHelper.convert(r,MindocDocuments.class)).collect(Collectors.toList());
		}
		return null;
	}

	@Override
	public List<MindocDocuments> listDocumentByBookId(Integer bookId) {
		SelectQuery<MdDocumentsRecord> query = dslContext.selectQuery(TransferConstants.MD_DOCUMENTS);
		query.addConditions(TransferConstants.MD_DOCUMENTS.BOOK_ID.eq(bookId));
		Result<MdDocumentsRecord> records = query.fetch();
		if (!CollectionUtils.isEmpty(records)){
			return records.stream().map(r->ConvertHelper.convert(r,MindocDocuments.class)).collect(Collectors.toList());
		}
		return Collections.emptyList();
	}

}
