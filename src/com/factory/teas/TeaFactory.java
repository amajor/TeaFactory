package com.factory.teas;

public class TeaFactory {
	public Tea brewTea(String country) {
		Tea tea = null;
		
		if (country.equals("England")) {
			tea = new EnglishTea();
		} else if (country.equals("Japan")) {
			tea = new GreenTea();
		} else if (country.equals("Morocco")) {
			tea = new MintTea();
		} else if (country.equals("Russia")) {
			tea = new Zavarka();
		}
		return tea;
	}
}
