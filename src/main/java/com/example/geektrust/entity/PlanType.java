package com.example.geektrust.entity;

public class PlanType {
	private Integer price;
	private Integer numOfMonths;
	
	public PlanType(Integer price, Integer numOfMonths) {
		super();
		this.price = price;
		this.numOfMonths = numOfMonths;
	}
	
	public Integer getPrice() {
		return price;
	}
	
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	public Integer getNumOfMonths() {
		return numOfMonths;
	}
	
	public void setNumOfMonths(Integer numOfMonths) {
		this.numOfMonths = numOfMonths;
	}
}
