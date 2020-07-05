package com.example.mindoc_transfer.core.provider;

import com.example.mindoc_transfer.core.bean.MindocAttachments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author moubin.mo
 * @date: 2020/7/3 14:42
 */
@Component
public class MdAttachmentsProviderImpl implements MdAttachmentsProvider{

	@Autowired
	private DbProvider dbProvider;

	@Override
	public List<MindocAttachments> listAttachmentsByBookId(Integer bookId) {

		return null;
	}

}
