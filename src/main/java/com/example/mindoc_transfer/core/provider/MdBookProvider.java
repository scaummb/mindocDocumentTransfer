package com.example.mindoc_transfer.core.provider;

import com.example.mindoc_transfer.core.bean.MindocBooks;

import java.util.List;

/**
 * @author moubin.mo
 * @date: 2020/7/3 10:16
 */

public interface MdBookProvider {

	List<MindocBooks> listBooksByIds(List<Integer> ids);

	MindocBooks findBookById(int id);

}
