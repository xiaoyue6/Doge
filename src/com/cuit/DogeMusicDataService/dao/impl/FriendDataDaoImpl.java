package com.cuit.DogeMusicDataService.dao.impl;

import java.util.List;

import com.cuit.DogeMusicDataService.dao.IFriendDataDao;
import com.cuit.DogeMusicDataService.model.vo.FriendVo;
import com.cuit.DogeMusicDataService.model.vo.LoginVo;
import com.cuit.DogeMusicDataService.model.vo.UserFriendVo;
import com.cuit.DogeMusicDataService.model.vo.UserMsgVo;

public class FriendDataDaoImpl implements IFriendDataDao{

	@Override
	public boolean addFriend(UserFriendVo vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delectFriend(UserFriendVo vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<FriendVo> queryFriendsList(LoginVo vo) {
		// TODO Auto-generated method stub
		return null;
	}

    /** 
     * {@inheritDoc}.
     */
    @Override
    public UserMsgVo queryUserMsgByID() {
        // TODO Auto-generated method stub
        return null;
    }

}
