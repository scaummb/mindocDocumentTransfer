package com.example.mindoc_transfer.core.provider;

import com.example.mindoc_transfer.core.bean.MindocBooks;

/**
 * @author moubin.mo
 * @date: 2020/7/3 10:16
 */

public interface MdBookProvider {

	MindocBooks findBookById(int id);

}
