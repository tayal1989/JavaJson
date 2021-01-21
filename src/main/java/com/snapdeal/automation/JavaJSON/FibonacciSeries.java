package com.snapdeal.automation.JavaJSON;

public class FibonacciSeries {

	public static void main(String[] args) {
		
//		for(int i = 0 ; i < 10 ; i++) {
//			System.out.println(fib(i));
//		}
		
		int a = 0;
		int b = 1;
		int c = 0;
		
		for(int i = 0 ; i < 10 ; i++) {
			if(i == 0) {
				System.out.println(a);
			} else if(i == 1) {
				System.out.println(b);
			} else {
				c = a + b;
				System.out.println(c);
				a = b;
				b = c;
			}
		}

	}
	
	public static int fib(int n) {
		if(n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}

}
