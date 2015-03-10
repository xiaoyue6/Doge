package com.cuit.DogeMusicDataService.dao.impl;

import org.springframework.stereotype.Component;

import com.cuit.DogeMusicDataService.dao.ILoginDao;
import com.cuit.DogeMusicDataService.model.bo.LoginBo;
import com.cuit.DogeMusicDataService.model.bo.UserMsgBo;
import com.cuit.DogeMusicDataService.model.vo.LoginVo;
import com.cuit.DogeMusicDataService.model.vo.UserFriendVo;
import com.cuit.DogeMusicDataService.model.vo.UserMsgVo;

@Component("loginDao")
public class LoginDaoImpl extends BaseDaoImpl implements ILoginDao{
	
	@Override
	public UserMsgVo queryByUserIdAndPsw(LoginBo bo) {
		// TODO Auto-generated method stub
		
		UserMsgVo queryVo = this.sqlSessionRead.selectOne("login", bo);
		return queryVo;
	}

	@Override
	public String registry(UserMsgBo bo) {
		// TODO Auto-generated method stub
		int result = 0;
		result = this.sqlSessionWrite.insert("register", bo);
		if(result==1)
		{
			return "1";
		}
		return "0";
	}

	@Override
	public String update(UserMsgBo bo) {
		// TODO Auto-generated method stub
		int result = 0;
		result = this.sqlSessionWrite.update("register", bo);
		if(result==1)
		{
			return "1";
		}
		return "0";
	}

}
