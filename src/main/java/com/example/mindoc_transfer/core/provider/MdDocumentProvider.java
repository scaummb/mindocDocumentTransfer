package com.example.mindoc_transfer.core.provider;

import com.example.mindoc_transfer.core.bean.MindocDocuments;

import java.util.List;

/**
 * @author moubin.mo
 * @date: 2020/7/4 17:54
 */

public interface MdDocumentProvider {

	List<MindocDocuments> listDocumentByParentIdAndBookId(Integer bookId, Integer defaultParentId);

	List<MindocDocuments> listDocumentByBookId(Integer bookId);

}
