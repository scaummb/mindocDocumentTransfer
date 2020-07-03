package com.example.mindoc_transfer.core.constants;

import com.example.mindoc_transfer.db.pojo.Tables;
import com.example.mindoc_transfer.db.pojo.tables.MdBooks;

/**
 * <ul>
 * <li>PICTURE_FILTER_REGEX: 图片过滤正则</li>
 * </ul>
 */
public class TransferConstants {
	public static final String PICTURE_FILTER_REGEX = "\\!\\[\\]\\(.*\\)";

	public static final MdBooks MD_BOOKS = Tables.MD_BOOKS;
}
