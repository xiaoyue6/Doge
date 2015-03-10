package com.cuit.DogeMusicDataService.service;

import com.cuit.DogeMusicDataService.model.vo.LoginVo;
import com.cuit.DogeMusicDataService.model.vo.UserMsgVo;

public interface ILoginService {
	/**
	 * 登录接口
	 * @param vo
	 * @return
	 */
	public String login(String vo);
	/**
	 * 注册接口
	 * @param vo
	 * @return
	 */
	public String register(String vo);
	/**
	 * 用户基础信息更新接口
	 * @param vo
	 * @return
	 */
	public String updateBasicMsg(String vo);
	
}
