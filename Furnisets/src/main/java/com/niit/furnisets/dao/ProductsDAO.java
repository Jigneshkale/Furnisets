package com.niit.furnisets.dao;

import java.util.List;

import com.niit.furnisets.model.Products;

public interface ProductsDAO {
	
	public void addProduct(Products prod);
	
	public void updateProduct(Products prod, int id);
	
	public void deleteProduct(int id);
	
	public List<Products> getAllProducts();
	
	public Products getProductById(int id);

}
