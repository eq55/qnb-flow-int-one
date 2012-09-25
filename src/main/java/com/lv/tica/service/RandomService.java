package com.lv.tica.service;

import org.springframework.integration.annotation.Gateway;

public interface RandomService {
	
	@Gateway(requestChannel = "requestChannel")
	public String getRandomMember(String[] theArray);
}
