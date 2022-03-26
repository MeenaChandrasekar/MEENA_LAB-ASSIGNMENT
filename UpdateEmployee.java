



package com.crud;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

import com.factory.HibernateSessionFactory;

public class UpdateEmp {

	public static void main(String[] args) {

		SessionFactory factory = HibernateSessionFactory.getSessionFactory();

		Session session = factory.openSession();
		Transaction tx = session.getTransaction();

		Employee empToUpate =session.get(Employee.class, 3);
		empToUpate.setSalary(empToUpate.getSalary()+10000);
		try {
			tx.begin();
			session.update(empToUpate);
			tx.commit();
		} catch (HibernateException ex) {
			ex.printStackTrace();
			tx.rollback();
		}

		session.close();
		factory.close();

	}

}