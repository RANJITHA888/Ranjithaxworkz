package com.xworkz.instagram.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.instagram.dao.InstagramDAO;
import com.xworkz.instagram.dao.InstagramDAOImpl;
import com.xworkz.instagram.dto.InstagramDTO;
import com.xworkz.instagram.service.InstagramService;
import com.xworkz.instagram.service.InstagramServiceImpl;

public class InstagramTester {

	public static void main(String[] args) {
		InstagramDTO dto = new InstagramDTO(1000, 20, 60, 2000, 6000, false);
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		InstagramDAOImpl bean = applicationContext.getBean(InstagramDAOImpl.class);
		bean.saveInstagramDTO(dto);
		System.out.println(dto + " " + bean);

		// InstagramService serviceImpl = new InstagramServiceImpl();
		// serviceImpl.validateInstagramDTO(dto);
		// System.out.println(dto);
		// InstagramDAO dao = new InstagramDAOImpl(null);
		// dao.update();
//dao.getMaximumNoOfUsersInstagram();
//dao.getCountOfAllInstagramRecords();
//dao.getMinimumNumberOfUsersInstagram();
//dao.getSumOfAllInstagramUsers();
		// serviceImpl.validateFetchInstagramDetails();
	}

}
