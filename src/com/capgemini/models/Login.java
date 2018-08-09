package com.capgemini.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="LOGIN")
public class Login {
	@Id
	@Column(name="ID")
	private int id;
	private String username;
	private String password;
	@OneToOne
	private Customer customer;
	
	public Login() {
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	@Override
	public String toString() {
		return "Login [id=" + id + ", username=" + username + ", password=" + password + ", customer=" + customer + "]";
	}
	
	
	
	

}
