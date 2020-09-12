package com.factory.teas;

public class TeaFactory {
	public Tea brewTea(String country) {
		Tea tea = null;
		
		if (country.equals("England")) {
			tea = new EnglishTea();
		}
		
		return tea;
	}
}
