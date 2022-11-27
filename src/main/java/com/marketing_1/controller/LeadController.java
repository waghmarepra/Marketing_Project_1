package com.marketing_1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LeadController {
	
	@RequestMapping("/createLead")
	public String viewCreateString() {
		return"lead_create";
		
	}

}
