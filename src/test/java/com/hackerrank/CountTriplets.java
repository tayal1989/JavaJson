package com.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class CountTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(5);
		arr.add(5);
		arr.add(25);
		arr.add(125);
		
		countTriplets(arr, 5);
	}
	
	// Complete the countTriplets function below.
    static int countTriplets(List<Integer> arr, int r) {
    	int count = 0 ;    	
    	int start = 0 ;
    	int prod = 0 ;
    	int next = start + 1 ;
    	int out = 0 ;
    	
    	List<Integer> list = new ArrayList<Integer>();
    	
    	for(int i = 0 ; i < arr.size() ; i++) {
    		out = arr.get(i) * r ;
    		list.add(out);
    	}
    	
    	System.out.println(list);
    	
    	while(start < arr.size()) {
    		prod = arr.get(start) * arr.get(next) ;
    		for(int i = 0 ; i < list.size() ; i++) {
    			if(prod == list.get(i)) {
    				count++ ;
    			}
    		}
    		start++ ;
    	}
    	
        return count;

    }

}
