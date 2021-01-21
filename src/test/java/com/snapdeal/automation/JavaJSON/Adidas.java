package com.snapdeal.automation.JavaJSON;

public class Adidas {

	public static void main(String[] args) {
		String str = "Order Information : Id: 2229212\n" + 
				"Amount: 790 USD\n" + 
				"Card Number: 1234123412341234\n" + 
				"Name: TestUser\n" + 
				"Date: 28/9/2020";
		System.out.println(str.split("Id:")[1].split("Amount")[0].trim());
		System.out.println(str.split("Amount:")[1].split("Card")[0].trim());

	}

}
