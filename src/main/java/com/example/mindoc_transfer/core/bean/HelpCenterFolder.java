package com.example.mindoc_transfer.core.bean;


import com.everhomes.util.StringHelper;
import com.example.mindoc_transfer.db.pojo.tables.pojos.OpcHelpCenterFoldersStructures;

/**
 * @author moubin.mo
 * @date: 2020/3/31 20:17
 */

public class HelpCenterFolder extends OpcHelpCenterFoldersStructures {
	private static final long serialVersionUID = 6063521537596868405L;
	@Override
	public String toString() {
		return StringHelper.toJsonString(this);
	}
}
