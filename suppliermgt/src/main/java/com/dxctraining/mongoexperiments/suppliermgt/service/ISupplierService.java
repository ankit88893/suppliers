package com.dxctraining.mongoexperiments.suppliermgt.service;

import java.util.List;   

import com.dxctraining.mongoexperiments.suppliermgt.entities.*;

public interface ISupplierService {


	Supplier save(Supplier supplier);

	void removeById(String id);

	List<Supplier> findByName(String name);

	Supplier findById(String id);

	List<Supplier> findAll();
}
