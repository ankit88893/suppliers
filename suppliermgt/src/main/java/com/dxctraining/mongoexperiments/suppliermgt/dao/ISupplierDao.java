package com.dxctraining.mongoexperiments.suppliermgt.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dxctraining.mongoexperiments.suppliermgt.entities.*;

public interface ISupplierDao extends MongoRepository<Supplier, String> {

List<Supplier> findByName(String name);
	
}