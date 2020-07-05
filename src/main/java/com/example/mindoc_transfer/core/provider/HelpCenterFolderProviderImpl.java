package com.example.mindoc_transfer.core.provider;

import com.everhomes.util.DateHelper;
import com.example.mindoc_transfer.core.bean.HelpCenterFolder;
import com.example.mindoc_transfer.core.constants.business.HelpCenterStatus;
import com.example.mindoc_transfer.db.pojo.tables.daos.OpcHelpCenterFoldersStructuresDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

/**
 * @author moubin.mo
 * @date: 2020/7/4 18:11
 */
@Component
public class HelpCenterFolderProviderImpl implements HelpCenterFolderProvider {
	private volatile static Long folderId = 1L;

	@Autowired
	private DbProvider dbProvider;

	@Override
	public Long createFolder(String parentPath, HelpCenterFolder folder) {
		Long folderId = getFolderId();
		folder.setId(folderId);
		folder.setCreateTime(new Timestamp(DateHelper.currentGMTTime().getTime()));
		folder.setCreatorUid(1L);
		folder.setUpdateTime(new Timestamp(DateHelper.currentGMTTime().getTime()));
		folder.setUpdatorUid(1L);
		folder.setStatus(HelpCenterStatus.VALID.getCode());
		folder.setPath(parentPath.concat("/").concat(folderId.toString()));
		OpcHelpCenterFoldersStructuresDao dao = new OpcHelpCenterFoldersStructuresDao(dbProvider.getDbConfiguration());
		dao.insert(folder);
		return folderId;
	}

	private final synchronized Long getFolderId(){
		return folderId++;
	}
}
