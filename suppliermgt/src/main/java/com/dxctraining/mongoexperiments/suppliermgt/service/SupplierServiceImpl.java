package com.dxctraining.mongoexperiments.suppliermgt.service;
import java.util.List;
import java.util.Optional; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dxctraining.mongoexperiments.suppliermgt.dao.ISupplierDao;
import com.dxctraining.mongoexperiments.suppliermgt.entities.Supplier;
import com.dxctraining.mongoexperiments.suppliermgt.exception.InvalidArgumentException;
import com.dxctraining.mongoexperiments.suppliermgt.exception.SupplierNotFoundException;

@Service
public class SupplierServiceImpl implements ISupplierService {

	@Autowired
	private ISupplierDao supplierDao;

	@Override
	public Supplier save(Supplier supplier) {
		supplier = supplierDao.save(supplier);
		return supplier;
	}

	@Override
	public Supplier findById(String id) {
		Optional<Supplier> optional = supplierDao.findById(id);
		boolean exist = optional.isPresent();
		if (!exist) {
			throw new SupplierNotFoundException("supplier not found for id= " + id);
		}
		Supplier supplier = optional.get();
		return supplier;
	}

	@Override
	public void removeById(String id) {
		supplierDao.deleteById(id);
	}

	@Override
	public List<Supplier> findByName(String name) {
		List<Supplier> list = supplierDao.findByName(name);
		return list;
	}

	@Override
	public List<Supplier> findAll() {
		List<Supplier> supplier = supplierDao.findAll();
		return supplier;
	}
}
