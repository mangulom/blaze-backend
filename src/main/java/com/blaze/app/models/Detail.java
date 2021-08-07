package com.blaze.app.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Detail {
	@Id
	public String _id;
	@Field
	public Integer nro_order;
	@Field
	public Integer nro_product;
	@Field
	public String status;
	@Field
	public Integer quantity;
	@Field
	public double unitprice;
	@Field
	public double cost;
	@Field
	public String name;
	public Detail() {
		super();
	}
	
	@Override
	public String toString() {
		return String.format("Detail[_id='%s', nro_order='%d', nro_product ='%d', status='%s', quantity='%d', unitprice='%f', cost='%f', name='%s']");
	}

	public Detail(String _id, Integer nro_order, Integer nro_product, String status, Integer quantity,
			double unitprice, double cost, String name) {
		super();
		this._id = _id;
		this.nro_order = nro_order;
		this.nro_product = nro_product;
		this.status = status;
		this.quantity = quantity;
		this.unitprice = unitprice;
		this.cost = cost;
		this.name = name;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public Integer getNro_order() {
		return nro_order;
	}

	public void setNro_order(Integer nro_order) {
		this.nro_order = nro_order;
	}

	public Integer getNro_product() {
		return nro_product;
	}

	public void setNro_product(Integer nro_product) {
		this.nro_product = nro_product;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public double getUnitprice() {
		return unitprice;
	}

	public void setUnitprice(double unitprice) {
		this.unitprice = unitprice;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
