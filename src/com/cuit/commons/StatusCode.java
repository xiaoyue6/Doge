package com.cuit.commons;

/**
 * 状态码
 * @author guokan
 *
 */
public interface StatusCode {
	/**
	 * 成功
	 */
	int SUCCESS = 1;
	/**
	 * 请求错误
	 */
	int BAD_REQUEST = 2;
	/**
	 * 没有找到相关服务
	 */
	int NOT_FOUND_SERVICE = 3;
	/**
	 * 程序错误
	 */
	int ERROR = 4;
	/**
	 * 缺失参数
	 */
	int PARAMETER_IS_NULL = 5;
	/**
	 * 参数错误
	 */
	int PARAMETER_ERROR = 6;
	/**
	 * 参数类型错误
	 */
	int PARAMETER_TYPE_ERROR = 7;
	
	
}
