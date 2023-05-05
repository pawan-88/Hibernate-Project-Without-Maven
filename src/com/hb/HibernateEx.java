package com.hb;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateEx {
	private static final SessionFactory factory =  buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try{
            return new Configuration().configure().buildSessionFactory();
        }catch (Throwable ex){
            System.err.println("Factory failed.."+ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    public static SessionFactory getSessionFactory(){
        return factory;
    }
    public static void shutdown(){
        getSessionFactory().close();
    }

}
