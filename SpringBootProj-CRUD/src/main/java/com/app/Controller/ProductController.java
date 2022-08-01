package com.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.Service.ProductServiceImpl;
import com.app.model.Product;


@RestController
@CrossOrigin("*")
public class ProductController {
	
	@Autowired
	private ProductServiceImpl productImpl;
	
	@PostMapping(value="saveProduct")
	public Product saveProduct(Product p) {
		productImpl.saveProduct(p);
		return p;
	}
	
	@GetMapping(value="getProduct")
	public List<Product> findAll(){
		return productImpl.findALL();
	}
	
	@PutMapping(value="updateProduct")
	public Product updateProduct(@RequestBody Product p) {
		return productImpl.updateProduct(p);
	}
	
	@DeleteMapping(value="updatePrduct")
	public String DeleteProduct(int id) {
		productImpl.DeleteProduct(id);
		return "Deleted";
	}
	
}
