package com.ubs.primegenerator.demo.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.stereotype.Service;

import com.ubs.primegenerator.demo.dto.PrimeDTO;

@Service
public class PrimeGeneratorService {

	public PrimeDTO getPrimeNumbers(Integer number) {
		List<Integer> primes = IntStream.rangeClosed(2, number).filter(x -> isPrime(x)).boxed()
				.collect(Collectors.toList());
		return new PrimeDTO(number, primes);
	}
	
	private static boolean isPrime(int number) {
        return number > 1 && IntStream.range(2, number).noneMatch(i -> number % i == 0);
	}
}
