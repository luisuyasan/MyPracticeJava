package CursoJavaBeggin.BasicJava.ExercicesPractices;

import java.util.Scanner;

public class MultipliTwoNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Multiplication de dos numbers enteros positivos o negativos");
        System.out.println("ingrese el number a multiplicar");
        int num1 = scanner.nextInt();

        System.out.println("ingrese la cantidad de veces a multiplicar");
        int num2 = scanner.nextInt();

        int total = 0;

        boolean PositivoNum1 = num1 > -1;
        boolean PositivoNum2 = num2 > -1;
        int ValorAbsolutoNum1 = Math.abs(num1);


        for(int i = 0; i < ValorAbsolutoNum1; i++){
            total = total + num2;
        }

        if((!PositivoNum1 && !PositivoNum2) || !PositivoNum1){
            total = -total;
        }

        System.out.println("el resultado es " + total);
    }

}