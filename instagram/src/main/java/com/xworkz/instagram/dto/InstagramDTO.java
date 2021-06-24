package com.xworkz.instagram.dto;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQueries;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "instagram_table")

@NamedQuery(name = "maximum no of users", query = "select max(noOfUsers) from  InstagramDTO")
@NamedQuery(name = "minimum no of users", query = "select min(noOfUsers) from InstagramDTO")
@NamedQuery(name = "count of all", query = "select count(noOfUsers) from InstagramDTO")
@NamedQuery(name = "Sum of all users", query = "select sum(noOfUsers) from InstagramDTO")

public class InstagramDTO implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "I_ID")
	private int userId;

	@NonNull
	@Column(name = "NO_OF_USERS")
	private double noOfUsers;

	@NonNull
	@Column(name = "VERSION")
	private double version;

	@NonNull
	@Column(name = "NO_OF_FEATURES")
	private int noOfFeatures;

	@NonNull
	@Column(name = "NET_WORTH")
	private double netWorth;

	@NonNull
	@Column(name = "IS_PUBLIC")
	private boolean isPublic;
	
	

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public double getNoOfUsers() {
		return noOfUsers;
	}

	public void setNoOfUsers(double noOfUsers) {
		this.noOfUsers = noOfUsers;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public int getNoOfFeatures() {
		return noOfFeatures;
	}

	public void setNoOfFeatures(int noOfFeatures) {
		this.noOfFeatures = noOfFeatures;
	}

	public double getNetWorth() {
		return netWorth;
	}

	public void setNetWorth(double netWorth) {
		this.netWorth = netWorth;
	}

	public boolean isPublic() {
		return isPublic;
	}

	public void setPublic(boolean isPublic) {
		this.isPublic = isPublic;
	}

	public InstagramDTO(int userId, @NonNull double noOfUsers, @NonNull double version, @NonNull int noOfFeatures,
			@NonNull double netWorth, @NonNull boolean isPublic) {
		super();
		this.userId = userId;
		this.noOfUsers = noOfUsers;
		this.version = version;
		this.noOfFeatures = noOfFeatures;
		this.netWorth = netWorth;
		this.isPublic = isPublic;
	}
	

	public InstagramDTO() {
		super();
	}

	@Override
	public String toString() {
		return "InstagramDTO [userId=" + userId + ", noOfUsers=" + noOfUsers + ", version=" + version
				+ ", noOfFeatures=" + noOfFeatures + ", netWorth=" + netWorth + ", isPublic=" + isPublic + "]";
	}
	
	
	

}
