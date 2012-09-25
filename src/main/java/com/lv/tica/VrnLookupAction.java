package com.lv.tica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.webflow.action.FormAction;
import org.springframework.webflow.definition.StateDefinition;
import org.springframework.webflow.execution.Event;
import org.springframework.webflow.execution.RequestContext;

import com.lv.tica.service.VrnLookupService;

public class VrnLookupAction extends FormAction {
	@Autowired
	VrnLookupService vrnLookupService;
	
	public Event doCheck(RequestContext ctx) {
		StateDefinition state = ctx.getCurrentState();
		if (!ctx.getRequestParameters().isEmpty()) {
			ctx.getFlowScope().put("arg", this.vrnLookupService.checkVrn(ctx.getRequestParameters().get("customerVrn")));
			return success();
		}
		return new Event(state, "vrnMissing");
	}
	
}
