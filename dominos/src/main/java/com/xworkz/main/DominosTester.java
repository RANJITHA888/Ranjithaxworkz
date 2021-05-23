package com.xworkz.main;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.dto.DominosDTO;

public class DominosTester {
public static void main(String[] args) {
		Configuration configuration = new Configuration();                                               
		configuration.configure("hibernate.cfg.xml");
		SessionFactory buildSessionFactory = configuration.buildSessionFactory();
		Session openSession = buildSessionFactory.openSession();
		DominosDTO dto=new DominosDTO("corn","rajajinagar",200,true,"large");
		Transaction transaction = openSession.beginTransaction();
		openSession.save(dto);
		transaction.commit();
		
	}

}
