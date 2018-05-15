package com.qijin.base.listeners;
import org.apache.log4j.Logger;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.util.HashSet;

/**
 * 监听session中人数 
 * Created by litao on 18/5/15.
 */
public class MySessionListener implements HttpSessionListener {

    private static Logger LOG = Logger.getLogger(MySessionListener.class);

    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        HttpSession session = httpSessionEvent.getSession();
        ServletContext application = session.getServletContext();

        // 在application范围由一个HashSet集保存所有的session
        HashSet sessions = (HashSet) application.getAttribute("sessions");
        if (sessions == null) {
            sessions = new HashSet();
            application.setAttribute("sessions", sessions);
        }

        // 新创建的session均添加到HashSet集中
        sessions.add(session);
        LOG.info("当前在线人数：" + sessions.size());
        // 可以在别处从application范围中取出sessions集合
        // 然后使用sessions.size()获取当前活动的session数，即为“在线人数”
    }

    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        HttpSession session = httpSessionEvent.getSession();
        ServletContext application = session.getServletContext();
        HashSet sessions = (HashSet) application.getAttribute("sessions");
        // 销毁的session均从HashSet集中移除
        sessions.remove(session);
        LOG.info("当前在线人数：" + sessions.size());
    }
}