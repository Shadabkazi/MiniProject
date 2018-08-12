package com.capgemini.models;

import java.util.List;

import org.springframework.stereotype.Component;


@Component
public class Cart {
	
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
