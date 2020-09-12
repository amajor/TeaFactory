package com.factory.teas;

public class Tea {
	String name;
	String steepTemp;
	String steepTime;
	String side;
	
	public String getName() {
		return name;
	}
	
	public void prepare() {
		System.out.println("Brewing " + name + "...");
	}
	
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("===== " + name + " =====\n");
		display.append("- Bring water to " + steepTemp + ".\n");
		display.append("- Steep for " + steepTime + ".\n");
		if (side != null) {
			display.append("- Serve with " + side + ".\n");
		}
		
		return display.toString();
	}
}
