package com.cuit.DogeMusicDataService.model.vo;

public class UserMsgVo {
	
	private String account;
	private String passWord;
	private Integer age;
	private String sex;
	private String nation;
	private String email;
	private Integer userLevel;
	public UserMsgVo()
	{
		
	}
	public UserMsgVo(String account, Integer age, String sex, String nation,
			String email, Integer userLevel) {
		super();
		this.account = account;
		this.age = age;
		this.sex = sex;
		this.nation = nation;
		this.email = email;
		this.userLevel = userLevel;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getUserLevel() {
		return userLevel;
	}
	public void setUserLevel(Integer userLevel) {
		this.userLevel = userLevel;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
}
