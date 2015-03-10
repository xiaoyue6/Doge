package com.cuit.DogeMusicDataService.service.impl;

import com.cuit.DogeMusicDataService.model.vo.UploadMsgExamineVo;
import com.cuit.DogeMusicDataService.service.IDogeMusicManageService;

public class DogeMusicManageServiceImpl extends BaseServiceImpl implements IDogeMusicManageService{

	@Override
	public String search(String vo) {
		// TODO Auto-generated method stub
		UploadMsgExamineVo examineVo = toObject(vo, UploadMsgExamineVo.class);
		return null;
	}

}
