package ExercicesPractices;
import java.util.ArrayList;
import java.util.Scanner;


public class GFC {

    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        // add method for integer ArrayList
        System.out.println("ingrese un numero");
        int number1 = scanner.nextInt();

        System.out.println("ingrese un segundo numero");
        int number2 = scanner.nextInt();

        System.out.println("ingrese un tercer numero");
        int number3 = scanner.nextInt();

        list.add(number1);
        list.add(number2);
        list.add(number3);


        System.out.println(list);
    }

}
