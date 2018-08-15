package com.capgemini.models;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="CATEGORY")
public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String cName;
	@Column(length=1000)
	private String cDescription;
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private Image image;
	
	@OneToMany(fetch=FetchType.EAGER)
	private List<Product> products;

	
	public Category() {
	}


	
	
	public List<Product> getProducts() {
		return products;
	}




	public void setProducts(List<Product> products) {
		this.products = products;
	}




	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	


	
	public String getcName() {
		return cName;
	}




	public void setcName(String cName) {
		this.cName = cName;
	}




	public String getcDescription() {
		return cDescription;
	}




	public void setcDescription(String cDescription) {
		this.cDescription = cDescription;
	}




	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}



	@Override
	public String toString() {
		return "Category [Id=" + id + ", name=" + cName + ", description=" + cDescription + ", image=" + image
				+ "]";
	}

	
	
}
