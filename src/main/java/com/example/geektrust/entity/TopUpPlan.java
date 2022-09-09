
package com.example.geektrust.entity;

import com.example.geektrust.entity.categories.*;
import java.lang.Integer;

public class TopUpPlan {
	private TopUpCategories topUpCategory;
	private Integer numOfMonths;
	
	public TopUpPlan(TopUpCategories topUpCategory, Integer numOfMonths) {
		this.topUpCategory = topUpCategory;
		this.numOfMonths = numOfMonths;
	}

	public TopUpCategories getTopUpCategory() {
		return topUpCategory;
	}

	public void setTopUpCategory(TopUpCategories topUpCategory) {
		this.topUpCategory = topUpCategory;
	}

	public Integer getNumOfMonths() {
		return numOfMonths;
	}

	public void setNumOfMonths(Integer numOfMonths) {
		this.numOfMonths = numOfMonths;
	}
}
