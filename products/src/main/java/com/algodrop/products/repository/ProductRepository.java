package com.algodrop.products.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.algodrop.products.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	@Query("SELECT p FROM Product p WHERE p.productName like %:productName%")
	public List<Product> findProductsByName(@Param("productName") String  productName);

	@Query("SELECT p FROM Product p WHERE p.productCategory = :productCategory")
	public List<Product> findProductsByCategory(String productCategory);
	
	/* public List<Product> findProductsByStringPart(Set<String> productName); */
		
}
