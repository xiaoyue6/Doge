package com.cuit.DogeMusicDataService.service;

import com.cuit.DogeMusicDataService.model.vo.LoginVo;
import com.cuit.DogeMusicDataService.model.vo.UserMsgVo;

public interface ILoginService {
	public UserMsgVo login(LoginVo vo);
}
