package com.blaze.app.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.OrderUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.blaze.app.models.Detail;
import com.blaze.app.models.Orders;
import com.blaze.app.service.DetailService;
import com.blaze.app.service.OrdersService;


@CrossOrigin
@RestController
@RequestMapping("/api")
public class OrdersAPI {
	@Autowired
	OrdersService serviceOrder;
	@Autowired
	DetailService serviceDetail;
	
	@GetMapping(path="/orders", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Orders>> listAll() {
		List<Orders> listAll = null;
		listAll = serviceOrder.listAll();
		return new ResponseEntity<List<Orders>>(listAll, HttpStatus.OK);
	}

	@GetMapping(path="/update-orders", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Orders> orderUnique(@RequestParam("_id") String _id) {
		Orders orden = new Orders();
		Optional<Orders> order = (Optional<Orders>) serviceOrder.findById(_id);
		orden.set_id(order.get().get_id());
		orden.setConsumer(order.get().getConsumer());
		orden.setDate(order.get().getDate());
		orden.setNro(order.get().getNro());
		orden.setStatus(order.get().getStatus());
		orden.setTotal(order.get().getTotal());
		List<Detail> listProducts = new ArrayList<Detail>();
		listProducts = serviceDetail.findByOrder(orden.getNro());
		orden.setDetail(listProducts);
		double result = 0;
		for(int e=0; e<orden.getDetail().size(); e++) {
			result = result + orden.getDetail().get(e).getCost();
		}
		orden.setTotal(result);
		return new ResponseEntity<Orders>(orden, HttpStatus.OK);
	}	
	

}
