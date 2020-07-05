package com.example.mindoc_transfer.core.constants.business;

/**
 * @author moubin.mo
 * @date: 2020/7/5 17:48
 */

public interface ErrorCodes {
	String SCOPE_GENERAL = "general";
	int SUCCESS = 200;
	int SUCCESS_MORE_DATA = 201;
	int ERROR_GENERAL_EXCEPTION = 500;
	int ERROR_LOCK_FAILED = 501;
	int ERROR_SQL_EXCEPTION = 502;
	int ERROR_UNSUPPORTED_USAGE = 503;
	int ERROR_CLASS_NOT_FOUND = 504;
	int ERROR_ACCESS_DENIED = 505;
	int ERROR_INVALID_PARAMETER = 506;
	int ERROR_OUT_OF_STORAGE = 507;
	int ERROR_UNSPOORTED_HIGHER_VERSION_FEATURE = 508;
	int ERROR_UNSPOORTED_HIGHER_VERSION_OBJECT = 509;
	int ERROR_RPC_EXCEPTION = 510;
}
