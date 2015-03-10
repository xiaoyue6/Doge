package com.cuit.DogeMusicDataService.business.impl;

import javax.annotation.Resource;

import com.cuit.DogeMusicDataService.business.ILoginBusiness;
import com.cuit.DogeMusicDataService.dao.ILoginDao;
import com.cuit.DogeMusicDataService.model.bo.LoginBo;
import com.cuit.DogeMusicDataService.model.bo.UserMsgBo;
import com.cuit.DogeMusicDataService.model.vo.LoginVo;
import com.cuit.DogeMusicDataService.model.vo.UserMsgVo;

public class LoginBusinessImpl implements ILoginBusiness{
	@Resource(name="loginDao")
	private ILoginDao loginDao;
	@Override
	public UserMsgVo login(LoginVo vo) {
		// TODO Auto-generated method stub
		LoginBo bo = new LoginBo(vo);
		//按用户ID首字母构建表名
		String tableName = vo.getAccount().substring(0, 1)+"UserBasicMsg";
		bo.setTableName(tableName);
		
		return loginDao.queryByUserIdAndPsw(bo);
	}
	@Override
	public String registery(UserMsgVo vo) {
		// TODO Auto-generated method stub
		UserMsgBo bo = new UserMsgBo(vo);
		String tableName = vo.getAccount().substring(0, 1)+"UserBasicMsg";
		bo.setTableName(tableName);
		return loginDao.registry(bo);
	}
	@Override
	public String update(UserMsgVo vo) {
		// TODO Auto-generated method stub
		UserMsgBo bo = new UserMsgBo(vo);
		String tableName = vo.getAccount().substring(0, 1)+"UserBasicMsg";
		bo.setTableName(tableName);
		return loginDao.registry(bo);
	}

}
