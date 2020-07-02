package com.example.mindoc_transfer.core.bean;


import com.everhomes.util.StringHelper;
import com.example.mindoc_transfer.db.pojo.tables.pojos.OpcHelpCenterFilesStructures;

/**
 * @author moubin.mo
 * @date: 2020/3/31 20:31
 */

public class HelpCenterDocument extends OpcHelpCenterFilesStructures {
	private static final long serialVersionUID = 5793343879428525245L;
	@Override
	public String toString() {
		return StringHelper.toJsonString(this);
	}
}
