package com.devsuperior.dsmeta.services;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.devsuperior.dsmeta.entities.sale;
import com.devsuperior.dsmeta.repositories.SaleRepository;


@Service
public class saleservice {
	
	@Autowired
	private SaleRepository repository;
	
	public Page<sale> findSales(String minDate, String maxDate, Pageable Pageable){
		
		LocalDate today =LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
		
		LocalDate min = minDate.equals("") ? today.minusDays(365):LocalDate.parse(minDate);
		LocalDate max = maxDate.equals("") ? today: LocalDate.parse(maxDate);
		
		
		   return repository.findSales(min, max, Pageable);
		
		
		
	}

}
