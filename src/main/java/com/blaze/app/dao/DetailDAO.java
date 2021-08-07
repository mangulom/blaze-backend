package com.blaze.app.dao;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.blaze.app.models.Detail;

@Repository
public interface DetailDAO extends MongoRepository<Detail, String>{};
