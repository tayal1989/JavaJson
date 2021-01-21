package com.snapdeal.automation.JavaJSON;

public class ChildClass {

	public static void main(String[] args) {
		BaseClass a = new BaseClass() ;
		BaseClass b = a ;
		a.i = 10 ;
		System.out.println(a.i + " " + b.i);
		b.i = 20 ;
		System.out.println(a.i + " " + b.i);
	}

}
