package com.snapdeal.automation.JavaJSON;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String timeQM = "13:25:04";	
			
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");	
			Date dateQM = simpleDateFormat.parse(timeQM);
			
		    Date now = new Date() ;
		    String milliseconds = simpleDateFormat.format(now);
		    now = simpleDateFormat.parse(milliseconds);
		    long millisecondsNow = now.getTime();
			
			long difference = millisecondsNow - dateQM.getTime();
			System.out.println("In minutes : " + difference/(1000 * 60));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
