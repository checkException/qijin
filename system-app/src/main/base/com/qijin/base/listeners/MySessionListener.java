package com.qijin.base.listeners;
import org.apache.log4j.Logger;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.util.HashSet;

/**
 * ����session������ 
 * Created by litao on 18/5/15.
 */
public class MySessionListener implements HttpSessionListener {

    private static Logger LOG = Logger.getLogger(MySessionListener.class);

    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        HttpSession session = httpSessionEvent.getSession();
        ServletContext application = session.getServletContext();

        // ��application��Χ��һ��HashSet���������е�session
        HashSet sessions = (HashSet) application.getAttribute("sessions");
        if (sessions == null) {
            sessions = new HashSet();
            application.setAttribute("sessions", sessions);
        }

        // �´�����session����ӵ�HashSet����
        sessions.add(session);
        LOG.info("��ǰ����������" + sessions.size());
        // �����ڱ𴦴�application��Χ��ȡ��sessions����
        // Ȼ��ʹ��sessions.size()��ȡ��ǰ���session������Ϊ������������
    }

    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        HttpSession session = httpSessionEvent.getSession();
        ServletContext application = session.getServletContext();
        HashSet sessions = (HashSet) application.getAttribute("sessions");
        // ���ٵ�session����HashSet�����Ƴ�
        sessions.remove(session);
        LOG.info("��ǰ����������" + sessions.size());
    }
}