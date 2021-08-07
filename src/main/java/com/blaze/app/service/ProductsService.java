package com.blaze.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blaze.app.dao.ProductsDAO;
import com.blaze.app.models.Products;

@Service
public class ProductsService {
	@Autowired
	ProductsDAO dao;
	
	public List<Products> listAll() {
		return dao.findAll();
	}

}
