package com.factory.teas;

public class TeaFactory {
	public Tea brewTea(String country) {
		Tea tea = null;
		
		if (country.equals("England")) {
			tea = new EnglishTea();
		} else if (country.equals("Japan")) {
			tea = new GreenTea();
		}
		return tea;
	}
}
