package com.qijin.portal.dao;

import java.util.List;

import com.qijin.portal.model.AdminModel;

public interface AdminDao {
	
	public int save();
	
	public int update();
	
	public int delete();
	
	public List<AdminModel> searchList();
}
