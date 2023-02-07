package com.algodrop.products.dto;

import lombok.Data;

@Data
public class ProductRequest {
	
	private int id;
	private String productName;
	private String productDesc;
	private double price;
	private int quantity;
	private String imageUrl;
	private String productCategory;
		
}
