package com.example.mindoc_transfer.core.provider;

import com.example.mindoc_transfer.core.bean.HelpCenterDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author moubin.mo
 * @date: 2020/7/4 18:10
 */
@Component
public class HelpCenterDocumentProviderImpl implements HelpCenterDocumentProvider {

	@Autowired
	private DbProvider dbProvider;

	@Override
	public HelpCenterDocument createSingleDocument(HelpCenterDocument document) {
		return null;
	}

}
