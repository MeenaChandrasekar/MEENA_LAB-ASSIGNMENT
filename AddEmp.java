

package com.crud;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

import org.HibernateSessionFactory;

public class AddEmp {

	public static void main(String[] args) {
		// 1. we need to get SessionFactory
		SessionFactory factory = HibernateSessionFactory.getSessionFactory();
		
		// 2. from sessionfactory --> sesssion
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		// 3. we start the stranscation
		// 4. create a emp object and call session.save(emp)
		// 5. commit the tx if something goes wrong rollback
		Employee employee = new Employee("raj", 67000, 31);
		try {
			tx.begin();
			session.save(employee);
			tx.commit();
		} catch (HibernateException ex) {
			ex.printStackTrace();
			tx.rollback();
		}

		// close the session
		session.close();
	

		factory.close();

	}

}