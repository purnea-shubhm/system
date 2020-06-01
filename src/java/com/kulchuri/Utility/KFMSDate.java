package com.kulchuri.Utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class KFMSDate {

    private KFMSDate() {

    }

    public static String getCurrentDate() {
        Date d=new Date();
        return new SimpleDateFormat("dd/MMM/yyyy").format(d);
    }

    public static Long getDays(String startDate, String endDate) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date start = format.parse(startDate);
        java.util.Date end = format.parse(endDate);
        return -((start.getTime() - end.getTime()) / (24 * 60 * 60 * 1000));
    }

    public static void main(String[] args) throws ParseException {
                System.out.println(getCurrentDate());
    }
}
