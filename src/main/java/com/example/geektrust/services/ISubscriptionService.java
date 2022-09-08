package com.example.geektrust.services;

import java.time.LocalDate;
import java.lang.Integer;

import com.example.geektrust.entity.*;

public interface ISubscriptionService {
    public void startSubscription(LocalDate date);
    
    public void addSubscription(String subscriptionCategory, String planName);

    public void printRenewDetails();
//
//    public void addTopUp(TopUpCategories topUpCategory, Integer months);
//    
//    public LocalDate calculateNextReminderDate(StreamingServiceCategories streamingServiceCategory); 
//    
//    public int getPlanValue();
}