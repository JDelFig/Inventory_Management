package com.jdmj.InventoryManagement.dao;

import java.util.List;

import com.jdmj.InventoryManagement.entity.ProductInfo;


public interface ProductInfoDao {

	
public List<ProductInfo> getProductInfos();///???????????
	
	public void saveProductInfo(ProductInfo theProductInfo);

	public ProductInfo getProductInfo(int theId);
}
