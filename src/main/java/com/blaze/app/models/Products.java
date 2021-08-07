package com.blaze.app.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Products {
	@Id
	public String _id;
	@Field
	public Integer nro;
	@Field
	public String name;
	@Field
	public String category;
	@Field
	public Double price;
	@Field
	public String status;
	
	public Products() {
		super();
	}

	public Products(String _id, Integer nro, String name, String category, Double price, String status) {
		super();
		this._id = _id;
		this.nro = nro;
		this.name = name;
		this.category = category;
		this.price = price;
		this.status = status;
	}
	
	@Override
	public String toString() {
		return String.format("Products[_id='%s', nro='%d', name='%s', category='%s', price ='%f', status='%s']");
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public Integer getNro() {
		return nro;
	}

	public void setNro(Integer nro) {
		this.nro = nro;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
