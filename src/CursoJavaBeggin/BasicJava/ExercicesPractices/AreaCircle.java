package CursoJavaBeggin.BasicJava.ExercicesPractices;

import java.util.Scanner;

public class AreaCircle
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input the radius of the circle");
        double radius = scanner.nextDouble();

        double Area = Math.PI * Math.pow(radius,2);
        System.out.println("Area the circle is  = " + Area);
    }
}
