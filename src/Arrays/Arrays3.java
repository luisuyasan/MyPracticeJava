package Arrays;

import java.util.Scanner;

public class Arrays3
{
    public static void main(String[] args) {

        //MethodDetectOrder();
        //FindElementInArray();
        FindElementInArrayWithString();
    }

    public static void MethodDetectOrder(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input seven numbers");
        int[] a = new int[7];

        for (int i = 0; i < a.length;i++ ){
            a[i] = scanner.nextInt();
        }
        boolean asc = false;
        boolean des = false;

        for (int i = 0; i < a.length - 1; i++){
            if(a[i] > a[i + 1]){
                des = true;
            }
            if(a[i] < a[i + 1]){
                asc = true;
            }

        }
        if (asc == true && des == true){
            System.out.println("array disordered ");
        }
        if(asc == false && des == false){
            System.out.println("array all equal");
        }
        if(asc == true && des == false){
            System.out.println("array ordered form ascend");
        }
        if(asc == false && des == true){
            System.out.println("array ordered form descend");
        }

    }

    public static void FindElementInArray(){
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[10];

        for(int i = 0 ; i < a.length; i++){
            System.out.println("enter a number: ");
            a[i] = scanner.nextInt();
        }

        System.out.println("\r\nenter number to search");
        int num = scanner.nextInt();

        int i = 0;
        for(;i < a.length && a[i] != num;i++){}
        if(i == a.length){
            System.out.println("number not found");
        } else if (a[i] == num) {
            System.out.println("found in position " + i);
        }
    }

    public static void FindElementInArrayWithString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a quantity names do you want");
        int totalNames = scanner.nextInt();

        String[] a = new String[totalNames];

        for(int i = 0 ; i < a.length; i++){
            System.out.println("enter a name "+ (i + 1));
            a[i] = scanner.next();
        }

        System.out.println("\r\nenter name to search");
        String name = scanner.next();
        int i = 0;
        for(;i < a.length && !a[i].equalsIgnoreCase(name);i++){}
        if(i == a.length){
            System.out.println("name not found");
        } else if (a[i].compareToIgnoreCase (name) == 0 ) {
            System.out.println("found in position " + (i + 1));
        }
    }

}
