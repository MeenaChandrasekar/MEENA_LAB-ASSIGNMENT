package com.bookapp.model.dao;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//the purpose of this class is to provide "SessionFactory"
public class HibernateConnectionFactory {
	private static SessionFactory factory = null;
	static {
		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.configure().build();

		factory = new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();
	}

	private HibernateConnectionFactory() {
	}

	public static SessionFactory getSessionFactory() {
		return factory;
	}
}
