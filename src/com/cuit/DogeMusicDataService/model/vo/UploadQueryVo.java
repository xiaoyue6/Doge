package com.cuit.DogeMusicDataService.model.vo;

import java.sql.Date;

public class UploadQueryVo {
	/**
	 * 音乐ID
	 */
	private String musicID;
	/**
	 * 音乐名称
	 */
	private String musicName;
	/**
	 * 起始时间
	 */
	private Date startTime;
	/**
	 * 截止时间
	 */
	private Date endTime;
	/**
	 * 音乐状态
	 */
	private Integer musicStatus;
	/**
	 * 音乐上传人
	 */
	private String musicUploader;
	
	public UploadQueryVo() {
		super();
		// TODO Auto-generated constructor stub
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
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Integer getMusicStatus() {
		return musicStatus;
	}
	public void setMusicStatus(Integer musicStatus) {
		this.musicStatus = musicStatus;
	}
	public String getMusicUploader() {
		return musicUploader;
	}
	public void setMusicUploader(String musicUploader) {
		this.musicUploader = musicUploader;
	}
	
	
}
