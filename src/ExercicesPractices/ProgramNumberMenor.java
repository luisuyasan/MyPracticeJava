package ExercicesPractices;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class ProgramNumberMenor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] num =  {12,122,14,18,22,1,3,4,5,6,7,8,9,44,40};
        System.out.println("El máximo valor es: " + Collections.max(Arrays.asList(num)));

        int cantidad;
        do {
            System.out.println("ingrese la cantidad de numeros a evaluar");
            cantidad = scanner.nextInt();
            if (cantidad < 10) System.out.println("debe comparar al menos 10 numeros");
        }while (cantidad < 10);

        int menor = Integer.MAX_VALUE; // asignamos un valor máximo por defecto como numero menor para comenzar
        int numero;

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el numero " + (i + 1) + ": ");
            numero = scanner.nextInt();
            menor = (numero < menor) ? numero : menor;
        }

        System.out.println("El número menor es: " + menor);

        if (menor < 10) {
            System.out.println("El número " + menor + " es menor que 10!");
        } else {
            System.out.println("El número " + menor + " es igual o mayor que 10!");
        }
    }
}
