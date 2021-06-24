package com.xworkz.instagram.dao;

import com.xworkz.instagram.dto.InstagramDTO;

public interface InstagramDAO {

	public void saveInstagramDTO(InstagramDTO dto);

	public void fetchInstagramDetails();

	public void updateInstagram();

	public void getMaximumNoOfUsersInstagram();

	public void getMinimumNumberOfUsersInstagram();

	public void getCountOfAllInstagramRecords();

	public void getSumOfAllInstagramUsers();
}
