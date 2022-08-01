package com.app.Service;

import java.util.List;

import com.app.model.Product;

public interface IProductService {
	
	public Product saveProduct(Product p);
	
	public List<Product> findALL();
	
	public Product updateProduct(Product product);
	
	public String DeleteProduct(int id);
}
