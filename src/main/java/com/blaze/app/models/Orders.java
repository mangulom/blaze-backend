package com.blaze.app.models;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Orders {
	@Id
	public String _id;
	@Field
	public Integer nro;
	@Field
	public String consumer;
	@Field
	public String status;
	@Field
	public String date;
	@Field
	public Double total;
	
	public List<Detail> detail;
	
	public Orders() {
		super();
	}
	
	public Orders(String _id, Integer nro, String consumer, String status, String date, Double total, List<Detail> detail) {
		super();
		this._id = _id;
		this.nro = nro;
		this.consumer = consumer;
		this.status = status;
		this.date = date;
		this.total = total;
		this.detail = detail;
		
	}

	@Override
	public String toString() {
		return String.format("Orders[_id='%s', nro='%d', consumer='%s', status='%s', date='%s', total='%f']");
	}

	public List<Detail> getDetail() {
		return detail;
	}

	public void setDetail(List<Detail> detail) {
		this.detail = detail;
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

	public String getConsumer() {
		return consumer;
	}

	public void setConsumer(String consumer) {
		this.consumer = consumer;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

/*
	public List<Detail> getDetail() {
		return detail;
	}

	public void setDetail(List<Detail> detail) {
		this.detail = detail;
	}
*/
}
