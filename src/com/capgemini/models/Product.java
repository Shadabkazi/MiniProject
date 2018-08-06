package com.capgemini.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="Product")
public class Product {

	@Id
	private String prod_id;
	
	@Column(name="prod_name")
	private String prod_name;
	
	@Column(name="prod_brand")
	private String prod_brand;
	
	@Column(name="prod_price")
	private float prod_price;
	
	@Column(name="prod_desc")
	private String prod_desc;
	
	@Column(name="prod_image_id")
	private String prod_image_id;
	
	@Column(name="category_id")
	private String category_id;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public String getProd_id() {
		return prod_id;
	}

	public void setProd_id(String prod_id) {
		this.prod_id = prod_id;
	}

	public String getProd_name() {
		return prod_name;
	}

	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}

	public String getProd_brand() {
		return prod_brand;
	}

	public void setProd_brand(String prod_brand) {
		this.prod_brand = prod_brand;
	}

	public float getProd_price() {
		return prod_price;
	}

	public void setProd_price(float prod_price) {
		this.prod_price = prod_price;
	}

	public String getProd_desc() {
		return prod_desc;
	}

	public void setProd_desc(String prod_desc) {
		this.prod_desc = prod_desc;
	}

	public String getProd_image_id() {
		return prod_image_id;
	}

	public void setProd_image_id(String prod_image_id) {
		this.prod_image_id = prod_image_id;
	}

	public String getCategory_id() {
		return category_id;
	}

	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}

	@Override
	public String toString() {
		return "Product [prod_id=" + prod_id + ", prod_name=" + prod_name + ", prod_brand=" + prod_brand
				+ ", prod_price=" + prod_price + ", prod_desc=" + prod_desc + ", prod_image_id=" + prod_image_id
				+ ", category_id=" + category_id + "]";
	}

	public Product(String prod_id, String prod_name, String prod_brand, float prod_price, String prod_desc,
			String prod_image_id, String category_id) {
		super();
		this.prod_id = prod_id;
		this.prod_name = prod_name;
		this.prod_brand = prod_brand;
		this.prod_price = prod_price;
		this.prod_desc = prod_desc;
		this.prod_image_id = prod_image_id;
		this.category_id = category_id;
	}
	
	
	
	
	
}
