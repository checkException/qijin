package com.qijin.portal.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 管理员实体类
 * @author litao
 *
 */
public class AdminModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2303536483717678016L;

	private String id;
	private String pwd;
	private String groupId;
	private String name;
	private String headImg;
	private Integer addTime;
	private Integer editTime;
	private String token;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHeadImg() {
		return headImg;
	}
	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}
	public Integer getAddTime() {
		return addTime;
	}
	public void setAddTime(Integer addTime) {
		this.addTime = addTime;
	}
	public Integer getEditTime() {
		return editTime;
	}
	public void setEditTime(Integer editTime) {
		this.editTime = editTime;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
	
}
