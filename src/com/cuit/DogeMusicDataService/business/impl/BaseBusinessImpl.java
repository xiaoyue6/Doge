package com.cuit.DogeMusicDataService.business.impl;

import java.lang.reflect.Type;

import com.cuit.commons.Response;
import com.cuit.DogeMusicDataService.business.IBaseBusiness;
import com.google.gson.Gson;

public class BaseBusinessImpl implements IBaseBusiness{
	private static Gson gson = new Gson();
	public String toJson(Object content) {
		return gson.toJson(content);
	}
	public <T> T toObject(String json, Class<T> cla) {
		return gson.fromJson(json, cla);
	}
	public Response<Object> toObject(String json,Type type) {
		return gson.fromJson(json, type);
	}
}
