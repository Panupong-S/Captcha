package src.main.java;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String args[]) throws ParseException {
       /* SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        String dateStartString = "11:59:59";
        String sysDate = new SimpleDateFormat("HH:mm:ss").format((new Date().getTime()));
        String startTime = new SimpleDateFormat("HH:mm:ss").format(new SimpleDateFormat("HH:mm:ss").parse("11:59:59").getTime());
        Date ddd = new Date();

        System.out.println(sysDate);
        System.out.println(startTime);

        System.out.println(formatter.parse(sysDate).getTime());
        System.out.println(formatter.parse(startTime).getTime());*/

       LocalTime ss = LocalTime.parse("06:00:00");

    }
}
