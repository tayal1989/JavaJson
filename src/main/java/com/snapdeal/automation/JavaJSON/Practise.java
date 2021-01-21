package com.snapdeal.automation.JavaJSON;

import java.sql.Timestamp;
import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;  

public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String supcList = "[SDL433913444, SDL824927366, SDL415804494, SDL017766151]" ;
//		supcList = supcList.replace("]", "").replace("[", "['").replace(", ", "', '") ;
//		String newSupc = "SDL012246780" ;
//		System.out.println(supcList + "', '" + newSupc + "']");
		
		String s1 = "Dev" ;
		s1 = s1.concat("Das") ;
		System.out.println(s1);
		
		String a = "a" ;
		System.out.println(a.split(",").length);
		
		String supcList = "null" ;
		
		if(!(supcList.contains("null"))) {
			System.out.println("Not Null");
		} else {
			System.out.println("Null");
		}
		
		long unixTime = System.currentTimeMillis();
		System.out.println(unixTime);
		
		long amount = ((2400 - 100)) ;
		amount = amount *  1000000 ;
		System.out.println(amount);
		
		List<String> list = new ArrayList<String>();
		boolean isKeywordPresent = false ;
		list.add("Sunglasses men");
		list.add("Sunglasses for girls");
		list.add("sunglasses");
		list.add("sunglass women");
		list.add("sunglass");
		list.add("sunglass girl");
		list.add("bottle");
		list.add("metal bottles");
		list.add("milton bottle");
		list.add("mobile phones");
		list.add("smart phones");
		list.add("featured phones");
		list.add("nike shirts");
		list.add("woolen shirt");
		list.add("silk shirt");
		list.add("shirt");
		list.add("men shirt");
		list.add("women shirt");
		list.add("kid shirt");
		list.add("function shirt");
		list.add("marriage shirt");
		System.out.println(list.contains("women shirt"));
//		OffsetDateTime currentTimeInUtc = OffsetDateTime.now(ZoneOffset.UTC);
//	    System.out.println(currentTimeInUtc);
//	    long millisecondsSinceEpoch = currentTimeInUtc.toInstant().toEpochMilli();
//	    System.out.println(millisecondsSinceEpoch);
//	    
//	    System.out.println(Clock.system(TimeZone.getTimeZone("GMT-7").toZoneId() ).millis()/1000);
	}

}
