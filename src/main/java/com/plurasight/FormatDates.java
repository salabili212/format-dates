package com.plurasight;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.ZonedDateTime;
import java.time.ZoneId;


public class FormatDates {
    public static void main(String[] args) {

        //get the date and time and date&&time togather
        LocalDateTime timeDate= LocalDateTime.now();
        LocalTime time = LocalTime.now();
        LocalDate today = LocalDate.now();

        //Get the zone by the ZoneId method
        ZonedDateTime zone = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime nyZoned = ZonedDateTime.now(ZoneId.of("America/New_York"));

        //The date formater I put all the date formater in one string and devide it
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy|yyyy-MM-dd|E,MMM dd, yyyy x z");

        //printing time and zoned in that format
        String dateTime = zone.format(format);
        String[] dateTimeInArray = dateTime.split("\\|");
        System.out.println(dateTimeInArray[0]);
        System.out.println(dateTimeInArray[1]);
        System.out.println(dateTimeInArray[2]);

        System.out.println();

        format = DateTimeFormatter.ofPattern("hh:mm dd-MMM-yyyy z");
        System.out.println(nyZoned.format(format));



    }
}
