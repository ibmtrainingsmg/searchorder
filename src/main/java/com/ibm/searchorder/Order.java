package com.ibm.searchorder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;

public class Order {
	@NotNull
	@NotBlank
	private String item;
	@Id
	private String id;
	private float price;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public float getPrice() {
		return price;
	}
	/**
	 * handling exception
	 * @param price
	 */
	public void setPrice(float price) {
		if (price <= 0) {
			throw new IllegalArgumentException("price cannot be negative");
		}
		this.price = price;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

}
