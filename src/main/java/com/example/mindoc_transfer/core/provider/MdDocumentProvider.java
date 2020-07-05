package com.example.mindoc_transfer.core.provider;

import com.example.mindoc_transfer.core.bean.MindocDocuments;

/**
 * @author moubin.mo
 * @date: 2020/7/4 17:54
 */

public interface MdDocumentProvider {

	MindocDocuments findDocumentByParentIdAndBookId(Integer bookId, Long defaultParentId);

}
