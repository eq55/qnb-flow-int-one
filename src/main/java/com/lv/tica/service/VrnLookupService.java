package com.lv.tica.service;

import org.springframework.integration.annotation.Gateway;

public interface VrnLookupService {
	@Gateway(requestChannel="ReqChan")
	String checkVrn(String vrn);
}
