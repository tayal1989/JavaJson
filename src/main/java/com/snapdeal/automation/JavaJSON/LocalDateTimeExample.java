package com.snapdeal.automation.JavaJSON;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LocalDateTimeExample {

    private static final String DATE_FORMAT = "dd-MM-yyyy";
    private static final DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
    private static final DateTimeFormatter dateFormat8 = DateTimeFormatter.ofPattern(DATE_FORMAT);

    public static void main(String[] args) {

		// Get current date
        Date currentDate = new Date();
        System.out.println("date : " + dateFormat.format(currentDate));

        // convert date to localdatetime
        LocalDateTime localDateTime = currentDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
//        System.out.println("localDateTime : " + dateFormat8.format(localDateTime));

        // plus one
        localDateTime = localDateTime.plusYears(1) ;
//        localDateTime = localDateTime.plusYears(1).plusMonths(1).plusDays(1);
//        localDateTime = localDateTime.plusHours(1).plusMinutes(2).minusMinutes(1).plusSeconds(1);

        // convert LocalDateTime to date
        Date currentDatePlusOneDay = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());

        System.out.println("\nOutput : " + dateFormat.format(currentDatePlusOneDay));
        
        String campaignID = "campaign20202" ;
        campaignID = campaignID.split("campaign")[1] ;
		System.out.println(campaignID);
		
		campaignID = "http://10.42.2.148:8080/app/#/campaign/product/23289/create" ;
		campaignID = campaignID.split("product/")[1].split("/create")[0] ;
		System.out.println(campaignID);
		
		String operatingSystem = System.getProperty("os.name");
		System.out.println(operatingSystem);
    }

}