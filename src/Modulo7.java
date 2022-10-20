import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Modulo7 {
    public static void main(String[] args) {

        ControlDate();
        ControlCalendar();
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
}

