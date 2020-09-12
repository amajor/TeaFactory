package com.factory.teas;

public class TeaSimulator {
	public static void main(String[] args) {
		TeaFactory factory = new TeaFactory();
		TeaShop shop = new TeaShop(factory);

		Tea tea1 = shop.orderTea("England");
		Tea tea2 = shop.orderTea("Japan");
		Tea tea3 = shop.orderTea("Morocco");

		// Print feedback for the process of making tea!
		System.out.println("\n\nAlison ordered an " + tea1.getName() + ".\n");
		System.out.println(tea1);
		
		System.out.println("\n\nChris ordered a " + tea2.getName() + ".\n");
		System.out.println(tea2);

		System.out.println("\n\nDustyn ordered a " + tea3.getName() + ".\n");
		System.out.println(tea3);
	}
}
