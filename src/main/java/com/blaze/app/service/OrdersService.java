package com.blaze.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.blaze.app.dao.OrdersDAO;
import com.blaze.app.models.Detail;
import com.blaze.app.models.Orders;

@Service
public class OrdersService {
	@Autowired
	OrdersDAO dao;
	
	public List<Orders> listAll() {
		return dao.findAll();
		
	}
	
	public Object findById(String _id) {
		Object order = dao.findById(_id);
		
		return order;
	}
}
