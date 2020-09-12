package com.factory.teas;

public class Tea {
	String name;
	
	public String getName() {
		return name;
	}
	
	public void prepare() {
		System.out.println("Brewing " + name);
	}
	
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("===== " + name + " =====\n");
		
		return display.toString();
	}
}
