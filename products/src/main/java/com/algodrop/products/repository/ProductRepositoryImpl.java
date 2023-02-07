package com.algodrop.products.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.algodrop.products.model.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Path;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

@Component
public class ProductRepositoryImpl {

	@PersistenceContext
	private EntityManager entityManager;

	@Autowired
	@Lazy
	private ProductRepository productRepository;

	/*
	 * public List<Product> findProductsByName(String productName){ String hql =
	 * "SELECT e FROM Product e WHERE e.productName = :productName";
	 * TypedQuery<Product> query = entityManager.createQuery(hql, Product.class);
	 * query.setParameter("productName", productName); return query.getResultList();
	 * }
	 
	 * public List<Product> findProductsByStringPart(Set<String> productNames){
	 * CriteriaBuilder cb = entityManager.getCriteriaBuilder();
	 * CriteriaQuery<Product> query = cb.createQuery(Product.class); Root<Product>
	 * product = query.from(Product.class);
	 * 
	 * 
	 * Path<String> productNamePath = product.get("productName");
	 * 
	 * List<Predicate> predicates = new ArrayList<>(); for (String productName :
	 * productNames) { predicates.add(cb.like(productNamePath, productName)); }
	 * 
	 * query.select(product) .where(cb.like); return null; }
	 */
}
