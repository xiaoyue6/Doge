package com.cuit.DogeMusicDataService.model.bo;

public class LoginBo {
	private String account;
	private String password;
	private String tableName;
	public LoginBo(String account, String password, String tableName) {
		super();
		this.account = account;
		this.password = password;
		this.tableName = tableName;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	
}
