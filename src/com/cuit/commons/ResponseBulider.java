package com.cuit.commons;

import com.google.gson.Gson;

public class ResponseBulider{

	private static Gson gson = new Gson();
	
	/**
	 * 返回成功
	 * 
	 * @return
	 */
	public String success() {
		Response<Object> responseObject = new Response<Object>(
				StatusCode.SUCCESS, null, null);
		return gson.toJson(responseObject);
	}
	
	/**
	 * 返回成功
	 * @param content 返回内容
	 * @return
	 */
	public static String success(Object content){
		Response<Object> responseObject = new Response<Object>(StatusCode.SUCCESS,null,content);
		return gson.toJson(responseObject);
	}
	
	/**
	 * 成功
	 * @param content 内容
	 * @param message 返回信息
	 * @return
	 */
	public static String success(Object content,String message){
		Response<Object> responseObject = new Response<Object>(StatusCode.SUCCESS,message,content);
		return gson.toJson(responseObject);
	}
	
	/**
	 * 失败
	 * @return
	 */
	public static String error(){
		return gson.toJson(new Response<Object>(StatusCode.ERROR,null,null));
	}
	
	/**
	 * 失败
	 * @param message 失败消息
	 * @return
	 */
	public static String error(String message){
		return gson.toJson(new Response<Object>(StatusCode.ERROR,message,null));
	}
	
	/**
	 * 失败
	 * @param code 失败状态码(状态码来自com.better517na.commons.StatusCode或者程序自定义状态码)
	 * @param message 失败消息
	 * @return
	 */
	public static String error(int code,String message){
		return gson.toJson(new Response<Object>(code,message,null));
	}
	
	/**
	 * 通用返回
	 * @param code 状态码
	 * @param message 信息
	 * @param content 内容
	 * @return
	 */
	public static String bulider(int code,String message,Object content)
	{
		return gson.toJson(new Response<Object>(code, message, content));
	}
	
//	public static void main(String[] args) {
//		List<User> list = new ArrayList<User>();
//		list.add(new User("calvin"));
//		Page<User> page = new Page<User>(list,0,10,1);
//		String json = bulider(200, "", page);
//		System.out.println(json);
//		Response<Page<User>> object = gson.fromJson(json, new TypeToken<Response<Page<User>>>(){}.getType());
//		System.out.println(object.getContent().getList().get(0).getName());
//	}
	
}
//Response<List<User>> fromJson = gson.fromJson(bulider, new TypeToken<Response<List<User>>>(){}.getType());

//class User implements Serializable{
//	private String name;
//
//	public User(String string) {
//		this.name = string;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	
//}
