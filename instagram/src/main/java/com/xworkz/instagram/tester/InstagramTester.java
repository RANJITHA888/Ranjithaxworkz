package com.xworkz.instagram.tester;

import com.xworkz.instagram.dao.InstagramDAO;
import com.xworkz.instagram.dao.InstagramDAOImpl;
import com.xworkz.instagram.dto.InstagramDTO;
import com.xworkz.instagram.service.InstagramService;
import com.xworkz.instagram.service.InstagramServiceImpl;

public class InstagramTester {

	public static void main(String[] args) {

		InstagramDTO dto = new InstagramDTO(400, 5.5, 10, 500, true);
		InstagramDTO dto1 = new InstagramDTO(500, 6.9, 11, 800, false);

		//InstagramService serviceImpl = new InstagramServiceImpl();
		//serviceImpl.validateInstagramDTO(dto1);
		//System.out.println(dto1);
		InstagramDAO dao = new InstagramDAOImpl();
		// dao.update();
dao.getMaximumNoOfUsersInstagram();
dao.getCountOfAllInstagramRecords();
dao.getMinimumNumberOfUsersInstagram();
dao.getSumOfAllInstagramUsers();
		// serviceImpl.validateFetchInstagramDetails();
	}

}
