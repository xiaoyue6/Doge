package com.cuit.DogeMusicDataService.model.vo;

/**
 * 好友列表显示的好友信息
 * */
public class FriendVo {
	private String account;
	private String sex;
	private Integer age;
	public FriendVo()
	{
		
	}
	public FriendVo(String account, String sex, int age) {
		super();
		this.account = account;
		this.sex = sex;
		this.setAge(age);
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
}
