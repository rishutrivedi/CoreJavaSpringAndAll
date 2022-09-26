package jpaapp.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
//sessionFactory -is a factory iof session and client of connectionProvider
	//org.hibernate.SessionFactory interface provides factory method to get an 
	private static final SessionFactory sessionFactory=buildSessionFactory();
	private static SessionFactory buildSessionFactory() {
		return new Configuration().configure().buildSessionFactory();
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public static void shutdown() {
		buildSessionFactory().close();
	}
}
