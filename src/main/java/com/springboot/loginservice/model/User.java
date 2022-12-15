package com.springboot.loginservice.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="users",schema="login")
public class User {

	@Id
	private Long userId;
	
	private String emailId;
	
	private String firstName;
	
	private String lastName;
	
	private String mobileNumber;
	
	private Date createdDate;
	
	private Date modifiedDate;
}
