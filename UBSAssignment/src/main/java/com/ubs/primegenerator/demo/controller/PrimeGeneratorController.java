package com.ubs.primegenerator.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ubs.primegenerator.demo.dto.PrimeDTO;
import com.ubs.primegenerator.demo.service.PrimeGeneratorService;

@RestController
public class PrimeGeneratorController {
	
	@Autowired
	PrimeGeneratorService primeGeneratorService;

	@RequestMapping(value = "/primes/{number}", method = RequestMethod.GET, produces = { "application/json", "application/xml", "text/xml" })
	public PrimeDTO getPrimeNumbers (@PathVariable Integer number) {
		return primeGeneratorService.getPrimeNumbers(number);	
	}
}
