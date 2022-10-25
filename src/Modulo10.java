import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Modulo10 //Arrays
{
    public static void main(String[] args)
    {
        //SpecificationArrays();
        //ArrayString();
        //TouringArrays();
        //FillingUpArrays();
        //ForInverse();
        //ArrayReverse();
        OrderBubble();
        
    }

    public static void SpecificationArrays(){
        int[] numbers = new int[4];

        numbers[0] = 1;
        numbers[1] = Integer.valueOf("2");
        numbers[2] = 3;
        numbers[3] = 4;

        int i = numbers[0];
        int j = numbers[1];
        int k = numbers[2];
        int l = numbers[3];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);

        int lengthNumbers = numbers.length;
        System.out.println("lengthNumbers = " + lengthNumbers);

        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void ArrayString(){

        String[] products = new String[5];
        products[0] = "TV Samsung 50";
        products[1] = "SSD Samsung Extern";
        products[2] = "Asus NoteBook";
        products[3] = "MacBook Air 14";
        products[4] = "HeadSet usb modern";

        Arrays.sort(products);  //organize the array alphabetical or numbers in order descend

        String Product1 = products[0];
        String Product2 = products[1];
        String Product3 = products[2];
        String Product4 = products[3];
        String Product5 = products[4];

        System.out.println("Product1 = " + Product1);
        System.out.println("Product1 = " + Product2);
        System.out.println("Product1 = " + Product3);
        System.out.println("Product1 = " + Product4);
        System.out.println("Product1 = " + Product5);
    }

    public static void TouringArrays() {

        String[] names = {"luis","nicolas","jenny","carlos","alex"};
        int LengthNames = names.length;

        //Touring arrays with for
        for (int i = 0; i < LengthNames; i++){
            System.out.println("names position "+ (i+1) + "= " + names[i]);
        }

        //Touring arrays with forEach
        Arrays.sort(names);
        for (String name: names){
            System.out.println("name = " + name);
        }

        //Touring arrays with while
        int i = 0;
        while(i < LengthNames){
            System.out.println("name in while= " + names[i]);
            i++;
        }

        //Touring arrays with doWhile
        int j = 0;
        do {
            System.out.println("name in do while= " + names[j]);
            j++;
        } while(j < LengthNames);
    }

    public static void FillingUpArrays() {

        int[] numbers = new int[10];
        int totalNumbers = numbers.length;
        for (int i = 0; i < totalNumbers;i++){   //filling up array
            numbers[i] = i*3;
        }

        for (int number:numbers) {                    //printer array
            System.out.println("number = " + number);
        }
    }

    public static void ForInverse() {
        String[] names = {"luis","nicolas","jenny","carlos","alex"};
        int LengthNames = names.length;
        for (int i = LengthNames - 1 ;i >= 0;i--){
            System.out.println("names[i] = " + names[i]);
        }
    }

    public static void ArrayReverse(){
        String[] names = {"luis","nicolas","jenny","carlos","alex"};
        Collections.reverse(Arrays.asList(names));
        for (String name: names) {
            System.out.println("name = " + name);
        }
    }

    public static void OrderBubble(){
        String[] names = {"luis","nicolas","jenny","carlos","alex"};
        int LengthNames = names.length;
        int counter = 0;
        for (int i = 0; i < LengthNames - 1; i++){
            
            for (int j = 0; j < LengthNames - 1 -i; j++){
                if (names[j+1].compareTo(names[j]) < 0){
                    String auxiliary = names[j];
                    names[j] = names[j + 1];
                    names[j+1] = auxiliary;
                    System.out.println("auxiliary = " + auxiliary);
                }
                counter++;
            }
        }
        System.out.println("counter = " + counter);
        
        for (int i = 0; i < LengthNames;i++){
            System.out.println("names[i] = " + names[i]);
        }
       
    }

}
