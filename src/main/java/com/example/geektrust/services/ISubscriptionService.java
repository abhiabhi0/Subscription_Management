package com.example.geektrust.services;

import java.time.LocalDate;

import com.example.geektrust.entity.categories.*;

public interface ISubscriptionService {
    public void startSubscription(LocalDate date);
    
    public void addSubscription(StreamingCategories streamingCategory, PlanCategories plan);

    public void printRenewDetails();

    public void addTopUp(TopUpCategories topup);
    
    public int getPlanValue();
}