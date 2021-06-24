package com.xworkz.instagram.service;

import com.xworkz.instagram.dao.InstagramDAO;
import com.xworkz.instagram.dao.InstagramDAOImpl;
import com.xworkz.instagram.dto.InstagramDTO;

public class InstagramServiceImpl implements InstagramService {
	
	InstagramDAO impl=new InstagramDAOImpl(null);
	
	public void validateInstagramDTO(InstagramDTO dto) {
Boolean isValid = true;
		
		if(dto.getNoOfUsers() == 0 || dto.getNoOfUsers() < 1) {
			System.out.println("Invalid Instagram No of Users");
			isValid = false;
		}
		if(dto.getVersion() == 0 || dto.getVersion() <1 ) {
			System.out.println("Invalid Instagram Version");
			isValid = false;
		}
		if(dto.getNoOfFeatures() == 0 || dto.getNoOfFeatures()<1) {
			System.out.println("Invalid Instagram No of Features");
			isValid = false;
		}
		if(dto.getNetWorth() == 0 || dto.getNetWorth() < 1) {
			System.out.println("Invalid Instagram Net Worth");
			isValid = false;
		}
		if(isValid) {
			impl.saveInstagramDTO(dto);
			System.out.println("Instagram_Added_Details_Successfully");
		}
	
	}


	
}