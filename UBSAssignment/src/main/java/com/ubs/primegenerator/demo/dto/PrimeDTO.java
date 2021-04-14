package com.ubs.primegenerator.demo.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PrimeDTO {
	
	private int number;
	private List<Integer> primeNumbers;
	
	public PrimeDTO(int number, List<Integer> primeNumbers) {
		super();
		this.number = number;
		this.primeNumbers = primeNumbers;
	}	
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public List<Integer> getPrimeNumbers() {
		return primeNumbers;
	}
	public void setPrimeNumbers(List<Integer> primeNumbers) {
		this.primeNumbers = primeNumbers;
	}

	@Override
	public String toString() {
		return "PrimeDTO [number=" + number + ", primeNumbers=" + primeNumbers + "]";
	}
}
