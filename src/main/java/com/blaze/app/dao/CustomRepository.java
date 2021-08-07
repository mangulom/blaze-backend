package com.blaze.app.dao;

import java.util.List;

import com.blaze.app.models.Detail;

public interface CustomRepository {
	public List<Detail> listProductsByOrder(Integer _id_order);
}
