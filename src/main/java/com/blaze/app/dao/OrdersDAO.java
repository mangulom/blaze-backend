package com.blaze.app.dao;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.blaze.app.models.Orders;

@Repository
public interface OrdersDAO extends MongoRepository<Orders, String> {
}
