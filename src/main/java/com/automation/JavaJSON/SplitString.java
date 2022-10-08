package com.automation.JavaJSON;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String queryString = "Brand:Apple^Canon.canon&size_s:Large^Max|Vishal^Agarwal";
		if(queryString.contains("|")) {
			queryString = queryString.replace("|", "-");
		}
		System.out.println(queryString);
		
		if(queryString.contains("^")) {
			queryString = queryString.replace("^", "=");
		}
		System.out.println(queryString);
		
		String[] breakQueryString = queryString.split("-");
		System.out.println(breakQueryString[0]);
		
		if(breakQueryString[0].contains("^")) {
			breakQueryString[0] = breakQueryString[0].replace("^", "=");
		}
		
		String[] breakQueryString1 = breakQueryString[0].split("=");
		System.out.println(breakQueryString1[0]);
		System.out.println(queryString.split("|").length);

	}

}
