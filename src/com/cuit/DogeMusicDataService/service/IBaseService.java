package com.cuit.DogeMusicDataService.service;

import java.lang.reflect.Type;

import com.cuit.commons.Response;

public interface IBaseService {
	String toSuccess();
	
	String toSuccess(Object content);

	String toSuccess(Object content, String message);

	String toFailure();

	String toFailure(String message);

	String toFailure(int code, String message);

	String toJson(int code, String message, Object content);

	Response<Object> toObject(String json, Type type);

	<T> T toObject(String json, Class<T> cla);
}
