package com.qijin.portal.service;

import java.util.List;

import com.qijin.portal.model.AdminModel;

public interface AdminService {
	
	public int save();
	
	public int update();
	
	public int delete();
	
	public List<AdminModel> searchList();
}
