
package com.crud;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

import com.factory.HibernateSessionFactory;

public class AllEmpDisplay {

	public static void main(String[] args) {

		SessionFactory factory = HibernateSessionFactory.getSessionFactory();

		Session session = factory.openSession();
		//WE DONT NEED TRANSACTION IF WE JUST WANT TO READ THE DATA
		//SQL		as 		HQL (OO way to write quaries)
		List<Employee> employees=session
				.createQuery("select e from Employee e", Employee.class)
				.getResultList();
		for(Employee employee: employees) {
			System.out.println(employee);
		}


		session.close();
		factory.close();

	}

}
