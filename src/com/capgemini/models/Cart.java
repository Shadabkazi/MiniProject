package com.capgemini.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.OneToMany;


@Embeddable
public class Cart {
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<Item> items;
	
	public Cart() {
		// TODO Auto-generated constructor stub
	}

	
	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}


	@Override
	public String toString() {
		return "Cart [items=" + items + "]";
	}


	


}
