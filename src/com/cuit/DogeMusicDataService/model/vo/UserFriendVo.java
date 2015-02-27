package com.cuit.DogeMusicDataService.model.vo;

/**
 * 用户好友关系表
 * */
public class UserFriendVo {
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
	public UserFriendVo(String userFriendId, String userId, String friendId,
			Integer isDelect) {
		super();
		this.userFriendId = userFriendId;
		this.userId = userId;
		this.friendId = friendId;
		this.isDelect = isDelect;
	}
	public UserFriendVo()
	{
		
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
	
	
}
