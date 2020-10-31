package com.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="student")
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id; 
	
	@NotNull(message="can not be empty")
	@Size(min=1, message="can not be empty")
	@Column(name="first_name")
	private String firstName; 
	
	@Column(name="last_name")
	private String lastName; 
	
	@Column(name="email")
	private String email;
	
	@NotNull(message="can not be empty")
	@Size(min=1, message="can not be empty")
	@Column(name="favourite_language")
	private String favouriteLanguage; 
	
//	@NotNull(message="can not be empty")
//	@Size(min=1, message="can not be empty")
//	@Column(name="operating_systems")
//	List<String> operatingSystems; 
//	
//	
//	public List<String> getOperatingSystems() {
//		return operatingSystems;
//	}
//
//	public void setOperatingSystems(List<String> operatingSystems) {
//		this.operatingSystems = operatingSystems;
//	}

	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}

	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	} 
}
