package com.jdmj.InventoryManagement.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.jdmj.InventoryManagement.config.HibernateUtil;
import com.jdmj.InventoryManagement.entity.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	//private HibernateUtil x= new HibernateUtil();
	
	@Override
	
	public List<Product> getProducts() {
		Session currentSession = HibernateUtil.getSessionFactory().getCurrentSession();		

        Query<Product> theQuery = currentSession.createQuery("from Customer order by lastName",Product.class);

        List<Product> products = theQuery.getResultList();
		return products;
	}

	@Override
	public void saveProduct(Product theProduct) {
		// TODO Auto-generated method stub

	}

	@Override
	public Product getProduct(int theId) {
		// TODO Auto-generated method stub
		
		return null;
	}

}
