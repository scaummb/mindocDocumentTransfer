package com.example.mindoc_transfer.core.provider;

import com.everhomes.util.DateHelper;
import com.example.mindoc_transfer.core.bean.HelpCenterDocument;
import com.example.mindoc_transfer.core.constants.business.HelpCenterStatus;
import com.example.mindoc_transfer.db.pojo.tables.daos.OpcHelpCenterFilesStructuresDao;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

/**
 * @author moubin.mo
 * @date: 2020/7/4 18:10
 */
@Component
public class HelpCenterDocumentProviderImpl implements HelpCenterDocumentProvider {

	@Autowired
	private DbProvider dbProvider;

	@Autowired
	private DSLContext dslContext;

	@Override
	public HelpCenterDocument createSingleDocument(HelpCenterDocument document) {
		document.setCreatorUid(1L);
		document.setCreateTime(new Timestamp(DateHelper.currentGMTTime().getTime()));
		document.setUpdateTime(new Timestamp(DateHelper.currentGMTTime().getTime()));
		document.setStatus(HelpCenterStatus.VALID.getCode());
		OpcHelpCenterFilesStructuresDao dao = new OpcHelpCenterFilesStructuresDao(dslContext.configuration());
		dao.insert(document);
		return document;
	}

}
