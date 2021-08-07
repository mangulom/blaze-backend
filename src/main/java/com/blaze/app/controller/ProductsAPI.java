package com.blaze.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blaze.app.models.Products;
import com.blaze.app.service.ProductsService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class ProductsAPI {
	@Autowired
	ProductsService service;
	@GetMapping(path="/products", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Products>> listAll() {
		List<Products> listAll = null;
		listAll = service.listAll();
		return new ResponseEntity<List<Products>>(listAll, HttpStatus.OK);
	}	
}
