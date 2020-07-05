package com.example.mindoc_transfer.core.provider;


import com.example.mindoc_transfer.core.bean.HelpCenterFolder;

/**
 * @author moubin.mo
 * @date: 2020/4/1 14:31
 */

public interface HelpCenterFolderProvider {

	Long createFolder(String parentPath, HelpCenterFolder folder);

}
