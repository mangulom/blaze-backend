package com.blaze.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.blaze.app.models.Detail;
import com.blaze.app.service.DetailService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class DetailAPI {
	@Autowired
	DetailService service;
	@GetMapping(path="/products-order", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Detail>> listProducts(@RequestParam("nro_order") Integer nro_order) {
		List<Detail> listProducts = new ArrayList<Detail>();
		listProducts = service.findByOrder(nro_order);
		return new ResponseEntity<List<Detail>>(listProducts, HttpStatus.OK);
	}
}
