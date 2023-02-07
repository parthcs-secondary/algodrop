package com.algodrop.products.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algodrop.products.model.Product;
import com.algodrop.products.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {
	
	@Autowired
	public final ProductRepository productRepository;

	
	public void addProduct(Product product) {
		System.out.println();
		productRepository.save(product);
	}
	
	public List<Product> getProductsByName(String productName){
		System.out.println("Inside getProductsByName : ");
		return productRepository.findProductsByName(productName);
	}
	
//	public List<Product> getProductsByStringPart(String productName){
//		System.out.println("Inside getProductsByName : ");
//		return productRepository.findProductsByStringPart();
//	}

	public Optional<Product> findById(int id) {
		// TODO Auto-generated method stub
		return productRepository.findById(id);
	}
	
	public List<Product> getProductsByCategory(String productCategory){
		System.out.println("Inside getProductsByName : ");
		return productRepository.findProductsByCategory(productCategory);
	}
	
	

}
