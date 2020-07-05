package com.example.mindoc_transfer.core.provider;

import com.example.mindoc_transfer.core.bean.MindocDocuments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author moubin.mo
 * @date: 2020/7/4 17:55
 */
@Component
public class MdDocumentProviderImpl implements MdDocumentProvider {

	@Autowired
	private DbProvider dbProvider;

	@Override
	public MindocDocuments findDocumentByParentIdAndBookId(Integer bookId, Long defaultParentId) {
		return null;
	}

}
