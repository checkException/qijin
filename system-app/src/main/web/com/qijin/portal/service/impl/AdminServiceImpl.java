package com.qijin.portal.service.impl;

import java.util.List;



import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qijin.portal.dao.AdminDao;
import com.qijin.portal.model.AdminModel;
import com.qijin.portal.service.AdminService;

@Service("adminService")
public class AdminServiceImpl implements AdminService {
	
	@Resource
	private AdminDao adminDao;
	
	public int save() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete() {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<AdminModel> searchList() {
		// TODO Auto-generated method stub
		return adminDao.searchList();
	}

}
