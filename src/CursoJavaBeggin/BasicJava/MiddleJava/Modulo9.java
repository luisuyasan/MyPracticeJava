package CursoJavaBeggin.BasicJava.MiddleJava;

import java.util.Random;

public class Modulo9// class Math
{
    public static void main(String[] args)
    {
        //ClassMath();
        //ClassRandomMath();
        //RandomColors();
        ObjectRandom();

    }

    public static void ClassMath(){

        int absolut = Math.abs(-3);
        System.out.println("absolut = " + absolut);

        absolut = Math.abs(3);
        System.out.println("absolut = " + absolut);

        double max = Math.max(3.5,1.2);
        System.out.println("max = " + max);

        double min = Math.min(3.5,1.2);
        System.out.println("min = " + min);

        double Ceil = Math.ceil(3.5);
        System.out.println("Ceil = " + Ceil);

        double Floor = Math.floor(3.5);
        System.out.println("Floor = " + Floor);
        
        Long Integer = Math.round(Math.PI);
        System.out.println("Integer = " + Integer);

        double exp = Math.exp(2);
        System.out.println("exp = " + exp);

        double log = Math.log(10);
        System.out.println("log = " + log);

        double Pow = Math.pow(10,3);
        System.out.println("Pow = " + Pow);

        double Sqrt = Math.sqrt(5);
        System.out.println("Sqrt = " + Sqrt);

        double Degrees = Math.toDegrees(1.57);
        Degrees = Math.round(Degrees);
        System.out.println("convert radians to degrees: " + Degrees);

        double radians = Math.toRadians(90.00);
        System.out.println("convert degrees a radians = " + radians);

        System.out.println("sin(90): " + Math.sin(radians));
        System.out.println("cos(90): " + Math.cos(radians));

        radians = Math.toRadians((0.00));
        System.out.println("cos(0): " + Math.cos(radians));
    }

    public static void ClassRandomMath(){
        
        double random = Math.random();
        System.out.println("Random = " + random);

        random = random * 7;
        System.out.println("random = " + random);
        
        random = Math.floor(random);
        System.out.println("random = " + random);
    }
    
    public static void RandomColors(){
        String[] colors = {"blue","yellow","orange","green","white","black"};
        double random = Math.random();
        random *= colors.length;
        System.out.println("random = " + random);
        System.out.println("colors[(int)random] = " + colors[(int)random]);

    }
    
    public static void ObjectRandom(){
       
        Random random = new Random();
        int number = 15 + random.nextInt(25-15+1); //random numbers between 15 and 25
        System.out.println("number = " + number);

        String[] colors = {"blue","yellow","orange","green","white","black"};
        Random random1 = new Random();
        int Position = random1.nextInt(colors.length);
        System.out.println("colors = " + colors[Position]);

    }
}
