package com.xworkz.instagram.dao;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.xworkz.instagram.dto.InstagramDTO;
import com.xworkz.singleton.Singleton;

public class InstagramDAOImpl implements InstagramDAO {

	public void saveInstagramDTO(InstagramDTO dto) {
		System.out.println("inside save method");
		Session session = null;
		Transaction trasaction = null;
		try {
			SessionFactory sessionFactory = Singleton.getSessionFactory();
			session = sessionFactory.openSession();
			trasaction = session.beginTransaction();
			session.persist(dto);
			trasaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
			trasaction.rollback();

		} finally {
			if (session != null) {
				session.close();
				System.out.println("Session closed");
			} else {
				System.out.println("Seesion connection failed");
			}
			Singleton.close();
		}
	}

	public void fetchInstagramDetails() {
		Session session = null;

		try {
			SessionFactory sessionFactory = Singleton.getSessionFactory();
			session = sessionFactory.openSession();
			session = sessionFactory.openSession();
			InstagramDTO instagramDTO = session.get(InstagramDTO.class, 1);
			System.out.println(instagramDTO);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			if (session != null) {
				session.close();
				System.out.println("Session is Closed");

			} else {
				System.out.println("Session is not Closed");
			}
			Singleton.close();

		}
	}

	@Override
	public void updateInstagram() {
		Session session = null;
		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = Singleton.getSessionFactory();
			session = sessionFactory.openSession();

			InstagramDTO dto = session.get(InstagramDTO.class, 1);
			dto.setNetWorth(1000);
			dto.setNoOfUsers(700);
			transaction = session.beginTransaction();
			session.update(dto);
			transaction.commit();
			System.out.println(" update succesfully " + dto);
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			if (session != null) {
				session.close();
				System.out.println("Session is Closed");

			} else {
				System.out.println("Session is not Closed");
			}
			Singleton.close();
		}

	}

	@Override
	public void getMaximumNoOfUsersInstagram() {
		Session session = null;
		try {
			SessionFactory sessionFactory = Singleton.getSessionFactory();
			session = sessionFactory.openSession();

			Query query = session.createNamedQuery("maximum no of users");
			List list = query.list();
			System.out.println("max no of users:" + list);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
				System.out.println("Session is Closed");

			} else {
				System.out.println("Session is not Closed");
			}
			Singleton.close();

		}
	}

	@Override
	public void getMinimumNumberOfUsersInstagram() {
		Session session = null;
		try {
			SessionFactory sessionFactory = Singleton.getSessionFactory();
			session = sessionFactory.openSession();

			Query query = session.createNamedQuery("minimum no of users");
			List list = query.list();
			System.out.println("min no of users:" + list);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
				System.out.println("Session is Closed");

			} else {
				System.out.println("Session is not Closed");
			}
			Singleton.close();

		}
	}

	@Override
	public void getCountOfAllInstagramRecords() {
		Session session = null;
		try {
			SessionFactory sessionFactory = Singleton.getSessionFactory();
			session = sessionFactory.openSession();
			Query query = session.createNamedQuery("count of all");
			List list = query.list();
			System.out.println("count of all:" + list);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
				System.out.println("Session is Closed");

			} else {
				System.out.println("Session is not Closed");
			}
			Singleton.close();

		}
	}

	@Override
	public void getSumOfAllInstagramUsers() {
		Session session = null;
		try {
			SessionFactory sessionFactory = Singleton.getSessionFactory();
			session = sessionFactory.openSession();

			Query query = session.createNamedQuery("Sum of all users");
			List list = query.list();
			System.out.println("sum of all:" + list);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
				System.out.println("Session is Closed");

			} else {
				System.out.println("Session is not Closed");
			}

		}
		Singleton.close();
	}
}