package com.hb_Student_mgt.jan31;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MyHb {

	public static Session getHbConf() {
		Configuration hbCong=new Configuration();
		hbCong.configure("hibernate.cfg.xml");
		hbCong.addAnnotatedClass(Student.class);
		
		SessionFactory sf=hbCong.buildSessionFactory();
		Session senn=sf.openSession();
		return senn;
	}

	
}
