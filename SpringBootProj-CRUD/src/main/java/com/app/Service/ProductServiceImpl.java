package com.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.Repository.ProductRepository;
import com.app.model.Product;

public class ProductServiceImpl implements IProductService {
	
	@Autowired
	private ProductRepository productRepo;

	@Override
	public Product saveProduct(Product p) {
	productRepo.save(p);
		return p;
	}

	@Override
	public List<Product> findALL() {
		return (List<Product>) productRepo.findAll();
		
	}

	@Override
	public Product updateProduct(Product product) {
		return productRepo.save(product);
		
	}

	@Override
	public String DeleteProduct(int id) {
		productRepo.deleteById(id);
		return "Deleted...";
	}

	
	
}
