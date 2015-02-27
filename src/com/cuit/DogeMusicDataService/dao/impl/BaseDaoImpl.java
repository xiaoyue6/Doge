package com.cuit.DogeMusicDataService.dao.impl;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;

@Component("baseDao")
public class BaseDaoImpl {
	@Resource(name="sqlSessionWrite")
	protected SqlSessionTemplate sqlSessionWrite;
	@Resource(name="sqlSessionRead")
	protected  SqlSessionTemplate sqlSessionRead;
	public SqlSessionTemplate getSqlSessionWrite() {
		return sqlSessionWrite;
	}
	public void setSqlSessionWrite(SqlSessionTemplate sqlSessionWrite) {
		this.sqlSessionWrite = sqlSessionWrite;
	}
	public SqlSessionTemplate getSqlSessionRead() {
		return sqlSessionRead;
	}
	public void setSqlSessionRead(SqlSessionTemplate sqlSessionRead) {
		this.sqlSessionRead = sqlSessionRead;
	}
	
}
