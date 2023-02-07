package com.algodrop.products.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.algodrop.products.dto.ProductRequest;
import com.algodrop.products.model.Product;
import com.algodrop.products.service.ProductService;
import com.fasterxml.jackson.databind.json.JsonMapper.Builder;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("products")
@RequiredArgsConstructor
public class ProductController {
	
	@Autowired
	private final ProductService productService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void addProduct(@RequestBody ProductRequest productRequest) {
		Product products = Product.builder()
				.productName(productRequest.getProductName())
				.productDesc(productRequest.getProductDesc())
				.productCategory(productRequest.getProductCategory())
				.quantity(productRequest.getQuantity())
				.price(productRequest.getPrice())
				.imageUrl(productRequest.getImageUrl())
				.build();	
				
		productService.addProduct(products);
	}
	
	@GetMapping("/find")
	@ResponseStatus(HttpStatus.OK)
	public Optional<Product> findProduct(@RequestParam("id") int id) {
		return productService.findById(id);
	}
	
	@GetMapping("/findByName")
	@ResponseStatus(HttpStatus.OK)
	public List<Product> findProductsByName(@RequestParam("productName") String productName){
		return productService.getProductsByName(productName);
	}
	
	@GetMapping("/findByCategory")
	@ResponseStatus(HttpStatus.OK)
	public List<Product> findProductsByCategory(@RequestParam("productCategory") String productCategory){
		return productService.getProductsByCategory(productCategory);
	}
}
