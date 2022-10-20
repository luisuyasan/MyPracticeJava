import java.text.SimpleDateFormat;
import java.util.Date;

public class Modulo7
{
    public static void main(String[] args)
    {
        Date date = new Date();
        SimpleDateFormat formatDate = new SimpleDateFormat("EEEE dd 'de' MMMM 'del' YYYY");
        System.out.println(formatDate.format(date));

        Date date2 = new Date();
        long endTime = date2.getTime() - date.getTime();
        System.out.println("endTime = " + endTime);

    }
}
