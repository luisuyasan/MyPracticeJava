package ExercicesPractices;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CovertDateBirthDay {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("input your date Birthday in format = dd-MM-yyyy ");

        try {
            Date dateBirthDay = ft.parse(scanner.next());
            System.out.println("Date of Birth Day = " + ft.format(dateBirthDay));

            Date dateActually = new Date();
            System.out.println("Date Actually = " + dateActually);

            ft = new SimpleDateFormat("yyyyMMdd");

            int from = Integer.parseInt(ft.format(dateBirthDay));
            int until = Integer.parseInt(ft.format(dateActually));

            int Age = (until - from) / 10000;
            System.out.println("Age = " + Age);

        }catch (ParseException e ){
            e.printStackTrace();
        }

    }
}
