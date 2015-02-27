package com.cuit.commons;

import java.io.Serializable;

/**
 * 服务返回实体对象
 * @author guokan
 *
 */
public class Response<T> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 状态码
	 */
	private int code;
	/**
	 * 信息
	 */
	private String message;
	/**
	 * 返回的内容
	 */
	private T content;
	/**
	 * 返回时间
	 */
	private long time;
	
	
	public Response() {
		super();
		this.time = System.currentTimeMillis();
	}
	
	
	public Response(int code, String message, T content) {
		super();
		this.code = code;
		this.message = message;
		this.content = content;
		this.time = System.currentTimeMillis();
	}
	


	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getContent() {
		return content;
	}
	public void setContent(T content) {
		this.content = content;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	

}
