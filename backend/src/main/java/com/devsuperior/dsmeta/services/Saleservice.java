package com.devsuperior.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsmeta.entities.sale;
import com.devsuperior.dsmeta.repositories.SaleRepository;


@Service
public class Saleservice {
	
	@Autowired
	private SaleRepository repository;
	
	public List <sale> findSales(){
		
		   return repository.findAll();
		
		
		
	}

}
