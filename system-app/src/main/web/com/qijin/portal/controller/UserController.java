package com.qijin.portal.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.qijin.portal.model.AdminModel;
import com.qijin.portal.service.AdminService;

@Controller
@RequestMapping("/user/")
public class UserController {
	private static Logger log=Logger.getLogger(UserController.class);
	
	@Resource(name="adminService")
	private AdminService adminService;
	
	@RequestMapping(value="{directory}/{page}")
	public String user(@PathVariable("directory") String directory,@PathVariable("page") String page){
		
		log.info("directory="+directory+" , page="+page);
		return "/pages/test/hello";
	}
	
	@RequestMapping(value="directory/page")
	public String user1(String directory,String page){
		List<AdminModel> list= adminService.searchList();
		if(list!=null&&list.size()>0){
			System.out.println(list.get(0).getId()+"--"+list.get(0).getName());
		}
		log.info("directory="+directory+" , page="+page);
		return "pages/test/hello";
	}
}
