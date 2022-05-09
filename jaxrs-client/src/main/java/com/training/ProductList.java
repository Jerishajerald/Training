package com.training;

import java.util.List;

import com.example.entity.Product;

public class ProductList {

	private List<Product>productList;

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	public ProductList(List<Product> productList) {
		super();
		this.productList = productList;
	}

	public ProductList() {
		super();
		// TODO Auto-generated constructor stub
	}
}
