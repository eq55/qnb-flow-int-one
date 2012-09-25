package com.lv.tica.model;

import java.io.Serializable;


public class VehicleSearchCriteria implements Serializable {

	private static final long serialVersionUID = 1L;
	private String vrn = "initial";

	public String getVrn() {
		return vrn;
	}

	public void setVrn(String vrn) {
		this.vrn = vrn;
	}
	
}
