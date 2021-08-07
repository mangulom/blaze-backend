package com.blaze.app.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.blaze.app.models.Products;

@Repository
public interface ProductsDAO extends MongoRepository<Products, String> {}
