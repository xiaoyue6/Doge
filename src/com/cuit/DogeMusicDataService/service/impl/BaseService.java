package com.cuit.DogeMusicDataService.service.impl;

import com.google.gson.Gson;

/***
 * 格式转换
 * ***/
public class BaseService
{
	private Gson gson = new Gson();

	/***
	 * 对象转换成json字符串
	 * 
	 * @param obj
	 *            需要转换的对象
	 * @return json字符串
	 * ***/
	public String toJson(Object obj)
	{
		return gson.toJson(obj);
	}

	/***
	 * json字符串转换成对象
	 * 
	 * @param objString
	 *            需要转换的字符串
	 * @param classOfT
	 *            转换成对象的目标类型
	 * @return classOfT模板类对应的对象
	 * ***/
	public <T> T toObject(String objString, Class<T> classOfT)
	{
		return gson.fromJson(objString, classOfT);
	}

}
