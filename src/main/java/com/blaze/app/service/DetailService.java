package com.blaze.app.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.blaze.app.dao.DetailDAO;
import com.blaze.app.models.Detail;

@Service
public class DetailService {
	@Autowired
	DetailDAO dao;
	
	private MongoTemplate mongoTemplate;
	
	public DetailService(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}
		
	public List<Detail> findByOrder(Integer nro_order) {
		List<Detail> listProducts = new ArrayList<>();
		Query query = new Query().addCriteria(Criteria.where("nro_order").is(nro_order));
		listProducts = mongoTemplate.find(query, Detail.class); 
		return listProducts;
	
	}

}


