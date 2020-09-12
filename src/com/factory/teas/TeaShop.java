package com.factory.teas;

class TeaShop {
	TeaFactory factory;
	
	public TeaShop(TeaFactory factory) {
		this.factory = factory;
	}
	
	public Tea orderTea(String country) {
		Tea tea;
		
		tea = factory.brewTea(country);
		
		return tea;
	}
}
