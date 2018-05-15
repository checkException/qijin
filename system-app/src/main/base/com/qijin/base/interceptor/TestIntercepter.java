package com.qijin.base.interceptor;

import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequestInterceptor;

/**
 * 
 * @author litao
 *
 */
public class TestIntercepter implements WebRequestInterceptor {

    public void preHandle(WebRequest webRequest) throws Exception {
        //System.out.println("TestIntercepter======preHandle");
    }

    public void postHandle(WebRequest webRequest, ModelMap modelMap) throws Exception {
        //System.out.println("TestIntercepter======postHandle");
    }

    public void afterCompletion(WebRequest webRequest, Exception e) throws Exception {
        //System.out.println("TestIntercepter======afterCompletion");
    }
}
