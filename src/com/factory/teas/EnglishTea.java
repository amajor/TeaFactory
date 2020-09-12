package com.factory.teas;

public class EnglishTea extends Tea {
	public EnglishTea() {
		name = "English Tea";
	}
	
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("===== " + name + " =====\n");
		
		return display.toString();
	}
}
