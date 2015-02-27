package com.cuit.DogeMusicDataService.model.bo;

public class UserFriendBo {
	/**
	 * 主键
	 * */
	private String userFriendId;
	/**
	 * 用户ID
	 * */
	private String userId;
	/**
	 * 好友ID
	 * */
	private String friendId;
	/**
	 * 是否删除
	 * */
	private Integer isDelect;
	/**
	 * 插入的表名，按用户Id分表
	 * */
	private String tableName;
	public UserFriendBo(String userFriendId, String userId, String friendId,
			Integer isDelect, String tableName) {
		super();
		this.userFriendId = userFriendId;
		this.userId = userId;
		this.friendId = friendId;
		this.isDelect = isDelect;
		this.tableName = tableName;
	}
	public String getUserFriendId() {
		return userFriendId;
	}
	public void setUserFriendId(String userFriendId) {
		this.userFriendId = userFriendId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFriendId() {
		return friendId;
	}
	public void setFriendId(String friendId) {
		this.friendId = friendId;
	}
	public Integer getIsDelect() {
		return isDelect;
	}
	public void setIsDelect(Integer isDelect) {
		this.isDelect = isDelect;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	
	
}
