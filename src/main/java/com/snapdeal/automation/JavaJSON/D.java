package com.snapdeal.automation.JavaJSON;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C a = new C() ;
		C b = a ;
		
		a.i = 10 ;
		System.out.println(a.i + " " + b.i);
		
		b.i = 20 ;
		System.out.println(a.i + " " + b.i);
	}

}
