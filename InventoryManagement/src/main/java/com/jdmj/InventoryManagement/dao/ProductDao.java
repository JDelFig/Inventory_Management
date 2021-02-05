package com.jdmj.InventoryManagement.dao;

import java.util.List;

import com.jdmj.InventoryManagement.entity.Product;



public interface ProductDao {

public List<Product> getProducts();///???????????
	
	public void saveProduct(Product theProduct);

	public Product getProduct(int theId);
	
}
