package com.obi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalendarTest {

    public static void main(String[] args) throws ParseException {

        Scanner typeDate = new Scanner(System.in);
        System.out.println("Podaj datę [dd.mm.yyyy]");
        String time = typeDate.nextLine();
        typeDate.close();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        String dateString = time;
        Date formatedDate = dateFormat.parse(dateString);

        System.out.println("Podana data: " + formatedDate);

        Date dateInYearTime = new Date(formatedDate.getTime());
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(dateInYearTime);
        gregorianCalendar.add(java.util.Calendar.MONTH, 12);
        dateInYearTime = gregorianCalendar.getTime();

        System.out.println("Data za rok: " + dateInYearTime);
    }
}