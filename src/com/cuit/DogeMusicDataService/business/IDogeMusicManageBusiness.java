package com.cuit.DogeMusicDataService.business;

import com.cuit.DogeMusicDataService.model.vo.UploadMsgExamineVo;
import com.cuit.DogeMusicDataService.model.vo.UploadQueryVo;

public interface IDogeMusicManageBusiness {
	/**
	 * 管理员按照条件查询音乐
	 * @param vo
	 * @return
	 */
	public UploadMsgExamineVo query(UploadQueryVo vo);
}
