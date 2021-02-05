package com.jdmj.InventoryManagement.dao;

import java.util.List;

import com.jdmj.InventoryManagement.entity.Supplier;


public interface SupplierDao {

	public List<Supplier> getSuppliers();///???????????
	
	public void saveSupplier(Supplier theSupplier);

	public Supplier getSupplier(int theId);

}
