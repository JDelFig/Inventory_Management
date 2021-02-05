package com.jdmj.InventoryManagement.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jdmj.InventoryManagement.dao.ProductDao;


@Controller
public class HomeController {
	
	@Autowired
	private ProductDao productDAO;
	
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	@Transactional
	@RequestMapping(value="/getProducts")
	public  void getProducts(){
		System.out.println(productDAO.getProducts());
	}
}
