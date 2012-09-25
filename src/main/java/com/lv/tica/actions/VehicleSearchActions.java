package com.lv.tica.actions;

import org.springframework.stereotype.Component;
import org.springframework.webflow.action.FormAction;

import com.lv.tica.model.VehicleSearchCriteria;

@Component("vehicleSearchActions")
public class VehicleSearchActions {
	
	

	public String search(VehicleSearchCriteria criteria) {
		return criteria.getVrn();
	}
}
