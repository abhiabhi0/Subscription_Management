package com.example.geektrust.entity;

import com.example.geektrust.entity.categories.PlanCategories;
import com.example.geektrust.entity.categories.StreamingCategories;

public class SubscriptionType {
	private StreamingCategories streamingCategory;
	private PlanCategories plan;
	
	public SubscriptionType() {}
	
	public StreamingCategories getStreamingCategory() {
		return this.streamingCategory;
	}
	
	public PlanCategories getPlanCategory() {
		return this.plan;
	}
}
