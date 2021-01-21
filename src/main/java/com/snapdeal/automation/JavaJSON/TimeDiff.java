package com.snapdeal.automation.JavaJSON;

import java.util.concurrent.TimeUnit;

public class TimeDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long currentTimeMillis = System.currentTimeMillis();
		long campaignCreatedTime = 1585040724852l ;
		long timeDiffInDays = TimeUnit.MILLISECONDS.toDays(currentTimeMillis - campaignCreatedTime);
//		System.out.println(timeDiffInDays);
		
		long ans = (long)(45 * Math.exp(-18)) ;
		System.out.println(ans);
//		System.out.println(45 * Math.exp(-18));
	}

}
