package com.qijin.base.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	private static Logger log = Logger.getLogger(TestController.class);

    @RequestMapping("{directory}/{page}")
    public String show(@PathVariable("directory") String directory, @PathVariable("page") String page){
    	log.info(directory+"/"+page+".jsp");
        return directory+"/"+page;
    }
}
