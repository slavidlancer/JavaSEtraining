package com.jse.fundamentals.introduction;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class PrintCurrentDateAndTime {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now(ZoneId.of("Europe/Sofia"));
        SimpleDateFormat dateFormat = new SimpleDateFormat(
                "dd.MM.yyyy г.\nHH:mm:ss ч.");
        Date now = new Date();
        
        System.out.printf("%s %s %s, %s\n%s:%s h\n\n",today.getDayOfMonth(),
                today.getMonth().toString().toLowerCase(), today.getYear(),
                today.getDayOfWeek().toString().toLowerCase(), today.getHour(),
                today.getMinute());
        System.out.println(dateFormat.format(now));
    }
}
