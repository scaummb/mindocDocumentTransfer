package com.example.mindoc_transfer.core.provider;

import com.example.mindoc_transfer.core.bean.HelpCenterAttachments;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author moubin.mo
 * @date: 2020/7/4 18:27
 */
@Component
public class HelpCenterAttachmentProviderImpl implements HelpCenterAttachmentProvider {

	@Autowired
	private DSLContext dslContext;


	@Override
	public void batchCreateAttachments(List<HelpCenterAttachments> helpCenterAttachments) {

	}
}
