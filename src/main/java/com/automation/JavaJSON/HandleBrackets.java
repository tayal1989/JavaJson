package com.automation.JavaJSON;

public class HandleBrackets {

	public static void main(String[] args) {
		//split("()()()")  ["()", "()", "()"]
		
		String str = "()()()";
		str = "((()))";
		str = "((()))(())()()(()())";
		str = "((())())(()(()()))";
		int count = 0 ;
		int start = 0 ;
		
		for(int i = 0 ; i < str.length() ; i++) {
			if(str.charAt(i) == '(') {
				count++ ;
			}
			
			if(str.charAt(i) == ')') {
				count-- ;
			}
			
			if(count == 0) {
				System.out.print("\"" + str.substring(start, i + 1) + "\", ");
				start = i + 1;
			}
		}
	}

}
