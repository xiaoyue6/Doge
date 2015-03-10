package com.cuit.DogeMusicDataService.model.vo;

import java.sql.Date;

public class UploadMsgExamineVo {
	/**
	 * 影月Id
	 */
	private String musicID;
	/**
	 * 音乐名称
	 */
	private String musicName;
	/**
	 * 音乐作者
	 */
	private String musicEditor;
	/**
	 * 音乐上传人
	 */
	private String musicUploader;
	/**
	 * 上传时间
	 */
	private Date uploadTime; 
	/**
	 * 音乐当前状态	0 待审核	1可以请求	2删除(硬删除)
	 */
	private String musicStatus;
	/**
	 * 是否删除
	 */
	private Integer isDelete;
	
	public UploadMsgExamineVo()
	{
		
	}

	public UploadMsgExamineVo(String musicID, String musicName,
			String musicEditor, String musicUploader, Date uploadTime,
			String musicStatus, Integer isDelete) {
		super();
		this.musicID = musicID;
		this.musicName = musicName;
		this.musicEditor = musicEditor;
		this.musicUploader = musicUploader;
		this.uploadTime = uploadTime;
		this.musicStatus = musicStatus;
		this.isDelete = isDelete;
	}

	public String getMusicID() {
		return musicID;
	}

	public void setMusicID(String musicID) {
		this.musicID = musicID;
	}

	public String getMusicName() {
		return musicName;
	}

	public void setMusicName(String musicName) {
		this.musicName = musicName;
	}

	public String getMusicEditor() {
		return musicEditor;
	}

	public void setMusicEditor(String musicEditor) {
		this.musicEditor = musicEditor;
	}

	public String getMusicUploader() {
		return musicUploader;
	}

	public void setMusicUploader(String musicUploader) {
		this.musicUploader = musicUploader;
	}

	public Date getUploadTime() {
		return uploadTime;
	}

	public void setUploadTime(Date uploadTime) {
		this.uploadTime = uploadTime;
	}

	public String getMusicStatus() {
		return musicStatus;
	}

	public void setMusicStatus(String musicStatus) {
		this.musicStatus = musicStatus;
	}

	public Integer getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}
	
	

}
