package com.example.geektrust.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.lang.Integer;

import com.example.geektrust.entity.*;
import com.example.geektrust.entity.categories.MonthlyPlanCategories;
import com.example.geektrust.entity.categories.StreamingServiceCategories;

public class SubscriptionService implements ISubscriptionService{
	private LocalDate startDate;
	private List<SubscriptionType> subscriptions = new ArrayList<SubscriptionType>();
	private TopUpPlan topUpPlan;
	
//	public SubscriptionService(SubscriptionPlan subscriptionPlan) {
//        this.subscriptionPlan = subscriptionPlan;
//    }
	
    
	
	public void startSubscription(LocalDate startDate) {
		this.startDate = startDate;
	}

	public void addSubscription(String subscriptionCategory, String planName) {
		SubscriptionType subscriptionType = new SubscriptionType(subscriptionCategory, planName); 
		subscriptions.add(subscriptionType);
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public ArrayList<SubscriptionType> getSubscriptions() {
		return subscriptions;
	}

	public void setSubscriptions(ArrayList<SubscriptionType> subscriptions) {
		this.subscriptions = subscriptions;
	}

	public TopUpPlan getTopUpPlan() {
		return topUpPlan;
	}

	public void setTopUpPlan(TopUpPlan topUpPlan) {
		this.topUpPlan = topUpPlan;
	}
	
	public void printRenewDetails() {
		Integer totalAmt = 0;
		for (SubscriptionType subscription : subscriptions) {
			LocalDate expiryDate = startDate.plusMonths(subscription.getNumOfMonths());
			LocalDate reminderDate = expiryDate.minusDays(10);
			System.out.println("RENEWAL_REMINDER " + subscription.getStreamingServiceCategory().toString() + " " + reminderDate.toString());

			totalAmt += subscription.getPrice();
		}
		System.out.println("RENEWAL_AMOUNT " + totalAmt.toString());
	}
	
}
