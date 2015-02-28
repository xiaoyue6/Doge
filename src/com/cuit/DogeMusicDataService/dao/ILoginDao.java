package com.cuit.DogeMusicDataService.dao;

import com.cuit.DogeMusicDataService.model.vo.LoginVo;
import com.cuit.DogeMusicDataService.model.vo.UserFriendVo;
import com.cuit.DogeMusicDataService.model.vo.UserMsgVo;

/**
 * 登录相关接口 
 * */
public interface ILoginDao {
	/**
	 * 用户登录
	 * */
	public UserMsgVo queryByUserIdAndPsw(LoginVo vo);
	/**
	 * 用户注册
	 * */
	public boolean registry(UserMsgVo vo);
	
}
