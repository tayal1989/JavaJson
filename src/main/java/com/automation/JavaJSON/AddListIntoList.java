package com.automation.JavaJSON;

import java.util.ArrayList;

public class AddListIntoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list2.addAll(list1);
		list2.add(4);
		System.out.println(list1);
		System.out.println(list2);
	}

}
