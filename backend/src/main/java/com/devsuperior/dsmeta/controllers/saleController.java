package com.devsuperior.dsmeta.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsmeta.entities.sale;
import com.devsuperior.dsmeta.services.saleservice;
import com.devsuperior.dsmeta.services.smsservice;


@RestController
@RequestMapping(value = "/sales")

public class saleController {
	
	
	@Autowired
	private saleservice service;
	
	@Autowired
	private smsservice smsService;
	
	@GetMapping
	public Page <sale>findSales(
			
			@RequestParam(value = "minDate", defaultValue ="") String minDate, 
			@RequestParam(value = "maxDate", defaultValue ="")String maxDate, 
			Pageable Pageable) {
		
		   return service.findSales(minDate, maxDate, Pageable);
		   
	}
	
	@GetMapping("/{Id}/notification")
	public void notifySms(@PathVariable Long Id) {
		smsService.sendSms(Id);
		
	} 
}
