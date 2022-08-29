package com.example.geektrust.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.example.geektrust.entity.categories.*;
import com.example.geektrust.Exception.*;

public class Subscription {
	private LocalDate startDate;
	private List<SubscriptionType> activeSubscriptionTypes;
	private TopUpCategories topUp;
	
	public Subscription(LocalDate startDate) {
		this.startDate = startDate;
		activeSubscriptionTypes = new ArrayList<SubscriptionType>();
	}
	
	public void addSubscription(SubscriptionType subscriptionType) throws DuplicateSubscriptionException {
		for (SubscriptionType subType : activeSubscriptionTypes) {
			
		}
	}
}
