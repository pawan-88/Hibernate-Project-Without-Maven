package com.hb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String args[]) {
		
		System.out.println("Project Started...");
		
		Session session = HibernateEx.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		Emp emp = new Emp();
		
		emp.setId(1);
		emp.setFname("PDS");
		emp.setLname("DS");
		
		session.save(emp);
		
		session.getTransaction().commit();
		session.close();
		
//		Configuration cfg = new Configuration();
//        cfg.configure();
//        SessionFactory factory = cfg.buildSessionFactory();
//        System.out.println(factory);
//        System.out.println(factory.openSession());
	}

}
