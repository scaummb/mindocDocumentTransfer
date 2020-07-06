package com.example.mindoc_transfer.core.provider;

import com.example.mindoc_transfer.core.bean.HelpCenterAttachments;

import java.util.List;

/**
 * @author moubin.mo
 * @date: 2020/7/4 18:26
 */

public interface HelpCenterAttachmentProvider {

	void batchCreateAttachments(List<HelpCenterAttachments> helpCenterAttachments);

}
