package com.factory.teas;

public class TeaSimulator {
	public static void main(String[] args) {
		TeaFactory factory = new TeaFactory();
		TeaShop shop = new TeaShop(factory);
		
		Tea tea = shop.orderTea("England");
		System.out.println("Alison ordered an " + tea.getName() + "\n");
		System.out.println(tea);
	}
}
