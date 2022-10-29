package CursoJavaBeggin.BasicJava.ExercicesPractices;

import java.util.Scanner;

public class PracticeArrays 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[7];
        System.out.println("enter 7 numbers only 11 - 99");
        for (int i= 0; i < a.length; i++){
            System.out.println("enter number " + (i + 1) + ":");
            a[i] = scanner.nextInt();
        }

        for (int i = 0 ; i < a.length ;i++){
            System.out.println("a = " + a[i]);
        }

        
    }

    public static void Example(){
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[10];

        System.out.println("enter 10 numbers");
        for (int i= 0; i < a.length; i++){
            a[i] = scanner.nextInt();
        }

        for (int i = a.length - 1 ; i >= 0 ;i--){
            System.out.println("a = " + a[i]);
            System.out.println("a = " + a[9 - i]);
        }
    }

    public static void Example2(){
        Scanner scanner = new Scanner(System.in);
        int i, arreglo[];
        arreglo = new int[10];
        for (i = 0; i < 10; i++) {
            System.out.println("Ingrese un numero: ");
            arreglo[i] = scanner.nextInt();
        }

        // como en cada iteración del for se muestran dos números
        // solo necesitaremos recorrer la mitad de iteraciones, con eso es suficiente.
        System.out.println("El resultado es:");
        for (i = 0; i <= 4; i++) {
            System.out.println(arreglo[9 - i]); // y el i-ésimo por el final
            System.out.println(arreglo[i]); // mostramos el i-ésimo número por el principio
        }
    }

}
