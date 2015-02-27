package com.cuit.DogeMusicDataService.service.impl;

import java.lang.reflect.Type;

import com.cuit.commons.Response;
import com.cuit.commons.StatusCode;
import com.cuit.DogeMusicDataService.service.IBaseService;
import com.google.gson.Gson;

public class BaseServiceImpl implements IBaseService {

	private static Gson gson = new Gson();

	/**
	 * 返回成功
	 * 
	 * @param content
	 *            返回内容
	 * @return
	 */
	public String toSuccess(Object content) {
		Response<Object> responseObject = new Response<Object>(
				StatusCode.SUCCESS, null, content);
		return gson.toJson(responseObject);
	}

	/**
	 * 返回成功
	 * 
	 * @return
	 */
	public String toSuccess() {
		Response<Object> responseObject = new Response<Object>(
				StatusCode.SUCCESS, null, null);
		return gson.toJson(responseObject);
	}

	/**
	 * 成功
	 * 
	 * @param content
	 *            内容
	 * @param message
	 *            返回信息
	 * @return
	 */
	public String toSuccess(Object content, String message) {
		Response<Object> responseObject = new Response<Object>(
				StatusCode.SUCCESS, message, content);
		return gson.toJson(responseObject);
	}

	/**
	 * 失败
	 * 
	 * @return
	 */
	public String toFailure() {
		return gson.toJson(new Response<Object>(StatusCode.ERROR, null, null));
	}

	/**
	 * 失败
	 * 
	 * @param message
	 *            失败消息
	 * @return
	 */
	public String toFailure(String message) {
		return gson
				.toJson(new Response<Object>(StatusCode.ERROR, message, null));
	}

	/**
	 * 失败
	 * 
	 * @param code
	 *            失败状态码(状态码来自com.better517na.commons.StatusCode或者程序自定义状态码)
	 * @param message
	 *            失败消息
	 * @return
	 */
	public String toFailure(int code, String message) {
		return gson.toJson(new Response<Object>(code, message, null));
	}

	/**
	 * 通用返回
	 * 
	 * @param code
	 *            状态码
	 * @param message
	 *            信息
	 * @param content
	 *            内容
	 * @return
	 */
	public String toJson(int code, String message, Object content) {
		return gson.toJson(new Response<Object>(code, message, content));
	}

	@Override
	public Response<Object> toObject(String json,Type type) {
		return gson.fromJson(json, type);
	}

	@Override
	public <T> T toObject(String json, Class<T> cla) {
		return gson.fromJson(json, cla);
	}

	
	
}
