package Arrays;

import java.util.Scanner;

public class Array4
{
    public static void main(String[] args) {

        MethodParesUneven();
    }

    public static void MethodParesUneven() {

        int TotalPares = 0;
        int TotalUneven = 0;
        int[] a , pares , uneven;
        a = new int[MethodQuantityNumbersArray()];
        int total = a.length;
        FillingUpArray(a,total);

        for (int i = 0; i < total;i++){
            if (a[i]%2 == 0){
                TotalPares++;
            }else{
                TotalUneven++;
            }
        }

        pares = new int[TotalPares];
        uneven = new int[TotalUneven];

        int j = 0;
        int k = 0;
        for (int i = 0; i < a.length;i++) {
            if (a[i] % 2 == 0){
                pares[j++] = a[i];
            }else{
                uneven[k++] = a[i];
            }
        }

        System.out.println("pares");
        PrintArray(pares);
        System.out.println("\n");
        System.out.println("uneven");
        PrintArray(uneven);
    }


    public static int MethodQuantityNumbersArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("input quantity numbers to array");
        int length = scanner.nextInt();
        return length;
    }

    public static void FillingUpArray(int[] array, int total){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < total;i++){
            System.out.println("input number " + (i + 1));
            array[i] = scanner.nextInt();
        }
    }
    public static void PrintArray (int[] array){
        for (int i = 0; i < array.length;i++){
            System.out.print(array[i] + " ");
        }

    }


}
