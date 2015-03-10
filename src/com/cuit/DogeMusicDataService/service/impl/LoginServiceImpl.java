package com.cuit.DogeMusicDataService.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.better517na.logcompontent.annotation.ACCLogServerWriter;
import com.better517na.logcompontent.business.LogBusiness;
import com.better517na.logcompontent.model.MLogException;
import com.better517na.logcompontent.util.ExceptionLevel;
import com.cuit.DogeMusicDataService.business.ILoginBusiness;
import com.cuit.DogeMusicDataService.model.vo.LoginVo;
import com.cuit.DogeMusicDataService.model.vo.UserMsgVo;
import com.cuit.DogeMusicDataService.service.ILoginService;
import com.cuit.commons.Response;
import com.google.gson.reflect.TypeToken;

@Component("loginService")
public class LoginServiceImpl extends BaseServiceImpl implements ILoginService{
	@Resource(name="loginBusiness")
	private ILoginBusiness loginBusiness;
	@Resource(name = "logBusiness")
	private LogBusiness logBusiness;
	
	@ACCLogServerWriter(description = "登录系统")
	@Override
	public String login(String vo) {
		// TODO Auto-generated method stub
//		Response response = new Response<LoginVo>();
//		response = toObject(vo, new TypeToken<LoginVo>(){}.getType());
		LoginVo loginVo = toObject(vo, LoginVo.class);
		try
		{
			UserMsgVo msgVo = loginBusiness.login(loginVo);
			return toSuccess(msgVo);
		}
		catch(Exception e)
		{
			logBusiness.writeExceptionLog(new MLogException(ExceptionLevel.Error, "login", e));
		}
		return null;
	}

	@Override
	public String register(String vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateBasicMsg(String vo) {
		// TODO Auto-generated method stub
		return null;
	}

}
