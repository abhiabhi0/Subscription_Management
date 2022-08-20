package com.example.geektrust.services;

import java.time.LocalDate;

import com.example.geektrust.entity.Subscription;
import com.example.geektrust.entity.categories.PlanCategories;
import com.example.geektrust.entity.categories.StreamingCategories;
import com.example.geektrust.entity.categories.TopUpCategories;

public class SubscriptionService implements ISubscriptionService{
	private Subscription subscription;
	
	public SubscriptionService(Subscription subscription) {
        this.subscription = subscription;
    }
	
	public void startSubscription(LocalDate date) {
		
	}
    
    public void addSubscription(StreamingCategories streamingCategory, PlanCategories plan) {
    	
    }

    public void printRenewDetails() {
    	
    }

    public void addTopUp(TopUpCategories topup) {
    	
    }
    
    public int getPlanValue() {
    	return 0;
    }
}
