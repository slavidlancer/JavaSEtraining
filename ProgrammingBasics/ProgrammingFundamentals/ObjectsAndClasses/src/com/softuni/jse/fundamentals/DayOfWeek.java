package com.softuni.jse.fundamentals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);
        String dateAsText = input.nextLine();
        Date date = new SimpleDateFormat("dd-MM-yyyy").parse(dateAsText);
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEEEEEEEE");
        String dayOfWeek = dateFormat.format(date);
        
        System.out.println(dayOfWeek);
        
        input.close();
    }
}
