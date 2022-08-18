package com.example.geektrust.services;

import java.time.LocalDate;

import com.example.geektrust.entity.Topup;
import com.example.geektrust.entity.PlanType.Plan;

public interface ISubscriptionService {
    public void createSubscription(LocalDate date);

    public void addActivePlan(Plan plan);

    public void printRenewDetails();

    public void addTopUp(Topup topup);
    
    public Integer getPlanValue();
}