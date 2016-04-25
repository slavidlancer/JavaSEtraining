package com.softuni.jse.coding101;

import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ThousandDaysAfterBirth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Date inputDate = null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        
        try {
            inputDate = simpleDateFormat.parse(input.nextLine());
        } catch (ParseException pe) {
            pe.printStackTrace();
        }
        
        Calendar calendar = Calendar.getInstance();    
        calendar.setTime(inputDate);
        calendar.add(Calendar.DATE, 999);
        
        System.out.println(simpleDateFormat.format(calendar.getTime()));
        
        input.close();
    }
}
