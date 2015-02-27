package com.cuit.DogeMusicDataService.dao;

import org.mybatis.spring.SqlSessionTemplate;

public interface IBaseDao {
	void setSqlSessionRead(SqlSessionTemplate sqlSessionTemplate);
	void setSqlSessionWrite(SqlSessionTemplate sessionTemplate);
	void setSqlSession(SqlSessionTemplate sessionTemplate);
	SqlSessionTemplate getSqlSessionRead();
	SqlSessionTemplate getSqlSessionWrite();
	SqlSessionTemplate getSqlSession();
}
