package com.capgemini.models;

import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Component
@Entity
@Table(name="IMAGE1")
public class Image {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String name;
	
	@Lob
	private Blob image;
	
	
	public Image() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Integer getID() {
		return id;
	}



	public void setID(Integer iD) {
		id = iD;
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Blob getImage() {
		return image;
	}


	public void setImage(Blob image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Image [ID=" + id + ", name=" + name + ", image=" + image + "]";
	}
	
	

}
