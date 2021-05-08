package com.devsuperior.zm.dto;

import java.io.Serializable;

import com.devsuperior.zm.entities.Seller;

public class SalesSumDTO implements Serializable{
	
	private String sellerName;
	private Double sum;
	
	public SalesSumDTO() {
		
	}

	public SalesSumDTO(Seller seller, Double sum) {
		this.sellerName = seller.getName();
		this.sum = sum;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}
	
	
	

}
