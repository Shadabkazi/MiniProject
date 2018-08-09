package com.capgemini.models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="CATEGORY")
public class Category {
	@Id
	@GeneratedValue
	@Column(name="ID")
	private int Id;
	private String name;
	private String description;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Image image;
	
	@OneToMany
	private Set<Product> products;
	
	public Category() {
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Category [Id=" + Id + ", name=" + name + ", description=" + description + ", image=" + image
				+ ", products=" + products + "]";
	}

	
	
}
