package com.example.geektrust.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.example.geektrust.entity.categories.*;

public class Subscription {
	private LocalDate startDate;
	private List<StreamingCategories> activePlans;
}
