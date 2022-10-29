package CursoJavaBeggin.BasicJava.Arrays;

import java.util.Scanner;

public class Arrays2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input quantity numbers do you want");
        Integer lengthArray = scanner.nextInt();
        Integer[] array = new Integer[lengthArray];
        fellingUpArray(array);
    }


    //method filling up array with data from user
    public static void fellingUpArray(Integer[] array){
        Scanner scanner = new Scanner(System.in);
        System.out.println("input numbers");
        for (int i = 0; i < array.length;i++){
            array[i] = scanner.nextInt();
        }
        int max = 0;
        for (int i = 0;i < array.length; i++){
            max = (array[max] > array[i])? max : i;
        }
        System.out.println("max = " + array[max]);
    }


}
