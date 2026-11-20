package com.plurasight;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormatDates {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        // Get GMT and New York time.
        ZonedDateTime zone = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime nyZoned = zone.withZoneSameInstant(ZoneId.of("America/New_York"));

        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(today.format(format));

        format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(today.format(format));

        format = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy", Locale.US);
        System.out.println(today.format(format));

        format = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm", Locale.US);
        System.out.println(zone.format(format));

        // Optional challenge: display the time in New York.
        System.out.println();
        format = DateTimeFormatter.ofPattern("H:mm 'on' dd-MMM-yyyy", Locale.US);
        System.out.println(nyZoned.format(format));
    }
}