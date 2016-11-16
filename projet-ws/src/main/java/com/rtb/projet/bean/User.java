package com.rtb.projet.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 @Column(name="id")
	 private int id;
	 
	 
	 private String email_address;
	 
	 private String first_name;
	 

	 private String biography;
	 

	 private String groups;


	public String getEmail_address() {
		return email_address;
	}


	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}


	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getBiography() {
		return biography;
	}


	public void setBiography(String biography) {
		this.biography = biography;
	}


	public String getGroups() {
		return groups;
	}


	public void setGroups(String groups) {
		this.groups = groups;
	}
	 
	 
	 
	 
	 
	
	

}
