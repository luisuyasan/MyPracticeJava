package MiddleJava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Modulo7 {
    public static void main(String[] args) {

        //ControlDate();
        //ControlCalendar();
        //DateAString();
        DateToCompare();
    }

    public static void ControlDate() {
        Date date = new Date();
        SimpleDateFormat formatDate = new SimpleDateFormat("EEEE dd 'de' MMMM 'del' YYYY");
        System.out.println(formatDate.format(date));

        Date date2 = new Date();
        long endTime = date2.getTime() - date.getTime();
        System.out.println("endTime = " + endTime);
    }

    public static void ControlCalendar() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1989,9,30);
        Date date = calendar.getTime();
        System.out.println("date = " + date);

        calendar.set(Calendar.YEAR, 1996);
        calendar.set(Calendar.MONTH,11);
        calendar.set(Calendar.DAY_OF_MONTH, 11);
        calendar.set(Calendar.HOUR_OF_DAY, 8);
        calendar.set(Calendar.MINUTE, 45);
        calendar.set(Calendar.SECOND, 28);
        Date date2 = calendar.getTime();
        System.out.println("date2 = " + date2);

    }

    public static void DateAString(){
        SimpleDateFormat dateFormat = new SimpleDateFormat( "dd-MM-yyyy");
        try {
            Date date = dateFormat.parse("01-05-2020");
            System.out.println("date = " + date);
            System.out.println(" date = " + dateFormat.format(date));
        }catch (ParseException e ){
            e.printStackTrace();
        }
    }

    public static void DateToCompare(){
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat( "dd-MM-yyyy");

        System.out.println("Input a date with format dd-MM-yyyy");
        try {
            Date date = dateFormat.parse(scanner.next());
            System.out.println("date = " + date);
            System.out.println("format = " + dateFormat.format(date));

            Date date2 = new Date();
            System.out.println("date2 = " + date2);

            if (date.after(date2)){
                System.out.println("date user is after than date2 (actually)");
            } else if (date.before(date2)) {
                System.out.println(" date is before than date2");
            } else if (date.equals(date2)) {
                System.out.println(" date is equal than date2 ");
            }
        }catch (ParseException e ){
            e.printStackTrace();
        }
    }


}

