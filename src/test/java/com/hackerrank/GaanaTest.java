package com.hackerrank;

import java.util.ArrayList;

public class GaanaTest {

	public static void main(String[] args) {
		int[] ids = {1, 2, 3, 3, 2} ;
		int[] profit = {10, 20, 30, 40, 25} ;
		int sum = 0 ;
		int maxProfit = 0 ;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0 ; i < ids.length ; i++) {
			if(!list.contains(ids[i])) {
				for(int j = i + 1 ; j < ids.length ; j++) {
					maxProfit = profit[i] ;
					if(ids[i] == ids[j]) {
						if(maxProfit < profit[j]) {
							maxProfit = profit[j] ;
							break ;
						}
					}				
				}
			}
			list.add(ids[i]) ;
			sum = sum + maxProfit ;
			maxProfit = 0 ;
		}		
		System.out.println(sum);
	}

}
