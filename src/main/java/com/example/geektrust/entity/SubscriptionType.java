package com.example.geektrust.entity;

import com.example.geektrust.entity.categories.*;

import java.lang.*;
import java.time.LocalDate;

public class SubscriptionType {
	private StreamingServiceCategories streamingServiceCategory;
	private MonthlyPlanCategories monthlyPlanCategory;
	//private PlanType planType;
	//private LocalDate renewalDate;
	private Integer price;
	private Integer numOfMonths;
	
	public SubscriptionType(String streamingServiceCategory,
			String monthlyPlanCategory) {
//		this.streamingServiceCategory = streamingServiceCategory;
//		this.monthlyPlanCategory = monthlyPlanCategory;
		
		if (streamingServiceCategory.equals("MUSIC"))
		{
			this.streamingServiceCategory = StreamingServiceCategories.MUSIC;
			if (monthlyPlanCategory.equals("FREE"))
			{
				//planType = new PlanType(0, 1);
				price = 0;
				numOfMonths = 1;
			}
			else if (monthlyPlanCategory.equals("PERSONAL"))
			{	
				//planType = new PlanType(100, 1);
				price = 100;
				numOfMonths = 1;
			}
			else if (monthlyPlanCategory.equals("PREMIUM"))
			{
				//planType = new PlanType(250, 3);
				price = 250;
				numOfMonths = 3;
			}
			else 
			{
				
			}
		}
		else if (streamingServiceCategory.equals("VIDEO"))
		{
			this.streamingServiceCategory = StreamingServiceCategories.VIDEO;
			if (monthlyPlanCategory.equals("FREE"))
			{
				//planType = new PlanType(0, 1);
				price = 0;
				numOfMonths = 1;
			}
			else if (monthlyPlanCategory.equals("PERSONAL"))
			{
				//planType = new PlanType(200, 1);
				price = 200;
				numOfMonths = 1;
			}
			else if (monthlyPlanCategory.equals("PREMIUM"))
			{
				//planType = new PlanType(500, 3);
				price = 500;
				numOfMonths = 3;
			}
			else 
			{
				
			}
		}
		else if (streamingServiceCategory.equals("PODCAST"))
		{
			this.streamingServiceCategory = StreamingServiceCategories.PODCAST;
			if (monthlyPlanCategory.equals("FREE"))
			{
				//planType = new PlanType(0, 1);
				price = 0;
				numOfMonths = 1;
			}
			else if (monthlyPlanCategory.equals("PERSONAL"))
			{
				//planType = new PlanType(100, 1);
				price = 100;
				numOfMonths = 1;
			}
			else if (monthlyPlanCategory.equals("PREMIUM"))
			{
				//planType = new PlanType(300, 3);
				price = 300;
				numOfMonths = 3;
			}
			else 
			{
				
			}
		}
		else  
		{
			
		}
	}
	
	public StreamingServiceCategories getStreamingServiceCategory() {
		return streamingServiceCategory;
	}
	
	public void setStreamingServiceCategory(StreamingServiceCategories streamingServiceCategory) {
		this.streamingServiceCategory = streamingServiceCategory;
	}
	
	public MonthlyPlanCategories getMonthlyPlanCategory() {
		return monthlyPlanCategory;
	}
	
	public void setMonthlyPlanCategory(MonthlyPlanCategories monthlyPlanCategory) {
		this.monthlyPlanCategory = monthlyPlanCategory;
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
