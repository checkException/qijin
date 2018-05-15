package com.qijin.base.interceptor;

import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequestInterceptor;

/**
 * 需要进行的拦截
 * @author litao
 * 2018-5-15 10:07:01
 */
public class IndexInterceptor implements WebRequestInterceptor {
    public void preHandle(WebRequest webRequest) throws Exception {
        //System.out.println("IndexInterceptor======preHandle");
    }

    public void postHandle(WebRequest webRequest, ModelMap modelMap) throws Exception {
        //System.out.println("IndexInterceptor======postHandle");
    }

    public void afterCompletion(WebRequest webRequest, Exception e) throws Exception {
        //System.out.println("IndexInterceptor======afterCompletion");
    }
}
