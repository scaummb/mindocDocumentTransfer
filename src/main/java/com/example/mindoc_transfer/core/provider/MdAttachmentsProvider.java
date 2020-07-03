package com.example.mindoc_transfer.core.provider;

import com.example.mindoc_transfer.core.bean.HelpCenterAttachments;

import java.util.List;

/**
 * @author moubin.mo
 * @date: 2020/7/3 14:42
 */

public interface MdAttachmentsProvider {

	List<HelpCenterAttachments> listAttachmentsByBookId(Integer bookId);

}
