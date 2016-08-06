package com.hand.entities;

import java.util.Date;

public class Customer {

	private Integer customer_id;
	private Integer store_id;
	private String first_name;
	private String last_name;
	private String email;
	private Integer address_id;
	private Integer active;
	private Date create_date;
	private Date last_update;

	public Integer getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}

	public Integer getStore_id() {
		return store_id;
	}

	public void setStore_id(Integer store_id) {
		this.store_id = store_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAddress_id() {
		return address_id;
	}

	public void setAddress_id(Integer address_id) {
		this.address_id = address_id;
	}

	public Integer getActive() {
		return active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}

	public Date getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}

	public Date getLast_update() {
		return last_update;
	}

	public void setLast_update(Date last_update) {
		this.last_update = last_update;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [customer_id=");
		builder.append(customer_id);
		builder.append(", store_id=");
		builder.append(store_id);
		builder.append(", first_name=");
		builder.append(first_name);
		builder.append(", last_name=");
		builder.append(last_name);
		builder.append(", email=");
		builder.append(email);
		builder.append(", address_id=");
		builder.append(address_id);
		builder.append(", active=");
		builder.append(active);
		builder.append(", create_date=");
		builder.append(create_date);
		builder.append(", last_update=");
		builder.append(last_update);
		builder.append("]");
		return builder.toString();
	}

	public Customer(Integer customer_id, Integer store_id, String first_name,
			String last_name, String email, Integer address_id, Integer active,
			Date create_date, Date last_update) {
		super();
		this.customer_id = customer_id;
		this.store_id = store_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.address_id = address_id;
		this.active = active;
		this.create_date = create_date;
		this.last_update = last_update;
	}

	public Customer() {
		super();
	}

}
