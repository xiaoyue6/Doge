package com.cuit.DogeMusicDataService.business;

import com.cuit.DogeMusicDataService.model.bo.LoginBo;
import com.cuit.DogeMusicDataService.model.bo.UserMsgBo;
import com.cuit.DogeMusicDataService.model.vo.LoginVo;
import com.cuit.DogeMusicDataService.model.vo.UserMsgVo;

public interface ILoginBusiness {
	/**
	 * 登录接口
	 * @param vo
	 * @return
	 */
	public UserMsgVo login(LoginVo vo);
	/**
	 * 注册接口
	 * @param bo
	 * @return
	 */
	public String registery(UserMsgVo bo);
	/**
	 * 用户信息更新接口
	 * @param bo
	 * @return
	 */
	public String update(UserMsgVo bo);
	
}
