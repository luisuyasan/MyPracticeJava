import java.lang.reflect.Array;
import java.util.Arrays;

public class Modulo10 //Arrays
{
    public static void main(String[] args)
    {
        //SpecificationArrays();
        ArrayString();
        
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
}
