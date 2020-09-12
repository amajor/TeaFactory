package com.factory.teas;

public class Tea {
	String name;
	String steepTemp;
	String steepTime;
	String serve;
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
		if (serve != null) {
			display.append("- Serve the tea " + serve + ".\n");
		}
		if (side != null) {
			display.append("- Accompany with " + side + ".\n");
		}
		
		return display.toString();
	}
}
