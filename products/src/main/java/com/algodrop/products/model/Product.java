package com.algodrop.products.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Entity
@Data
@AllArgsConstructor
@Builder
@Getter
@Table (name = "product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "product_id")
	private int productId;
	
	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "product_description")
	private String productDesc;
	
	@Column(name = "price")
	private Double price;
	
	@Column(name = "product_quantity")
	private int quantity;
	
	@Column(name = "product_image_url", length = 256)
	private String imageUrl;
	
	@Column(name = "product_category")
	private String productCategory;
		
	
	public Product() {
		
	}

	
	
}
