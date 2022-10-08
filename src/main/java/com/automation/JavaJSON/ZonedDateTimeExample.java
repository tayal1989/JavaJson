package com.automation.JavaJSON;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

public class ZonedDateTimeExample {

    //private static final String DATE_FORMAT = "dd-M-yyyy hh:mm:ss a";
    private static final String DATE_FORMAT = "MMM dd yyyy";
    public static void main(String[] args) throws ParseException {

        DateFormat formatterIST = new SimpleDateFormat("MMM dd yyyy HH:mm:ss");
        formatterIST.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata")); // better than using IST
        Date date = formatterIST.parse("Jun 02 2020 00:00:00");
        System.out.println(formatterIST.format(date)); // output: 15-05-2014 00:00:00
        
        DateFormat formatterUTC = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        formatterUTC.setTimeZone(TimeZone.getTimeZone("UTC")); // UTC timezone
        System.out.println(formatterUTC.format(date)); // output: 14-05-2014 18:30:00

    }

}
