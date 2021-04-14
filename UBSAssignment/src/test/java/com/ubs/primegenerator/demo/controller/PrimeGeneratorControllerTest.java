package com.ubs.primegenerator.demo.controller;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ubs.primegenerator.demo.dto.PrimeDTO;
import com.ubs.primegenerator.demo.service.PrimeGeneratorService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PrimeGeneratorControllerTest {
	
	@Autowired
	PrimeGeneratorService primeGeneratorService;
	
	@Test
	public void getPrimeForNegativeNumber() {
		int number= -3;
		PrimeDTO primeNumbers = primeGeneratorService.getPrimeNumbers(number);
		assertEquals(number, primeNumbers.getNumber());
		assertNotNull(primeNumbers);
		assertNotNull(primeNumbers.getPrimeNumbers());
		assertEquals(0, primeNumbers.getPrimeNumbers().size());
		assertEquals(new ArrayList<Integer>(), primeNumbers.getPrimeNumbers());
	}

	@Test
	public void getPrimeForZero() {
		int number= 0;
		PrimeDTO primeNumbers = primeGeneratorService.getPrimeNumbers(number);
		assertEquals(number, primeNumbers.getNumber());
		assertNotNull(primeNumbers);
		assertNotNull(primeNumbers.getPrimeNumbers());
		assertEquals(0, primeNumbers.getPrimeNumbers().size());
		assertEquals(new ArrayList<Integer>(), primeNumbers.getPrimeNumbers());
	}
	
	@Test
	public void getPrimeForPositiveNumber() {
		int number= 11;
		PrimeDTO primeNumbers = primeGeneratorService.getPrimeNumbers(number);
		assertEquals(number, primeNumbers.getNumber());
		assertNotNull(primeNumbers);
		assertNotNull(primeNumbers.getPrimeNumbers());
		assertEquals(5, primeNumbers.getPrimeNumbers().size());
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(2);
		expected.add(3);
		expected.add(5);
		expected.add(7);
		expected.add(11);
		assertEquals(expected, primeNumbers.getPrimeNumbers());
	}
}
