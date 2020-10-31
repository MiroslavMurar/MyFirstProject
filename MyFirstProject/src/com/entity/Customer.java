package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.entity.validator.CourseCode; 

@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id; 
	
	@Column(name="first_name")
	@Size(min=1, message="Must be at least one letter long ")
	private String firstName; 
	
	@Column(name="last_name")
	@Size(min=1, message="Must be at least one letter long ")
	private String lastName; 
	
	@Column(name="email")
	@Pattern(regexp=".+@.+", message="must contains letter@letter")
	private String email; 
	
	@Column(name="code")
	private String code; 
	
	@Column(name="postal_code")
	private String postalCode; 
	
	@Column(name="course_code")
	@CourseCode(value="AAA", message="must start with AAA")
	private String courseCode;

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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	} 
}
