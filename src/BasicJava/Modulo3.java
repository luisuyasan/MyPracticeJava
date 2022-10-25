package BasicJava;

import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Scanner;

public class Modulo3 //Sentencias
{
    public static void main(String[] args)
    {

        //SentenciaIf();
        //SentenciaIf2();
        //SwitchCase();
        //SwitchCase2();
        //SentenciaFor();
        //SentenciaFor2();
        //SentenciaWhileAndDo();
        //SentenciaForEach();
        //SentenciasBucleEtiquetas();
        //SentenciasBucleEtiquetas2();
        //SentenciasBucleEtiquetas3();

         Scanner scanner = new Scanner(System.in);



    }

    public static void SentenciaIf(){
        Scanner scanner = new Scanner(System.in);
        double promedio;
        System.out.println(" ingresa un numero");
        promedio = scanner.nextDouble();

        if (promedio >= 3.0){
            System.out.println("haz a probado con  = " + promedio);
        }else{
            System.out.println("haz perdido con  = " + promedio);
        }
    }

    public static void SentenciaIf2(){
        Scanner scanner = new Scanner(System.in);
        int month;
        int numberDays = 0;
        int year;

        System.out.println(" ingresa el mes");
        month = scanner.nextInt();
        System.out.println(" ingresa el año");
        year = scanner.nextInt();


        if (month == 1 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            numberDays = 31;
        }else if (month == 4 || month == 6 || month == 9 || month == 11){
            numberDays = 30;
        } else if (month == 2) {
            if(year % 400 == 0 || ((year % 4 ==0) && (year % 100 == 0))){
                numberDays = 29;
            }else{
                numberDays = 28;
            }
        }
        System.out.println("numberDays = " + numberDays);
    }

    public static void SwitchCase(){
        int num = 6;
        switch (num){
            case 1 :
                System.out.println("num 1");
                break;
            case 2 :
                System.out.println("num 2");
                break;
            case 3 :
                System.out.println("num 3");
                break;
            default:
                System.out.println("other number");
        }
    }

    public static void SwitchCase2(){
        Scanner scanner = new Scanner(System.in);
        int month;
        int numberDays = 0;
        int year;

        System.out.println(" ingresa el mes");
        month = scanner.nextInt();
        System.out.println(" ingresa el año");
        year = scanner.nextInt();

        switch (month){
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :
                numberDays = 31;
                break;
            case 4 :
            case 6 :
            case 9 :
                numberDays = 30;
                break;
            case 2 :
                if(year % 400 == 0 || ((year % 4 ==0) && (year % 100 == 0))){
                    numberDays = 29;
                }else{
                    numberDays = 28;
                }
                break;
            default:
                numberDays = 0;
        }
        System.out.println("numberDays = " + numberDays);
    }

    public static void SentenciaFor(){
        for (int i = 0; i < 20;i++){
            if (i % 2 == 0){
                continue;
            }
            System.out.println("i = " + i);
        }
    }

    public static void SentenciaFor2(){
        String[] Nombres = {"luis","jenny","nicolas","elsa"};
        int count = Nombres.length;

        for (int i = 0; i < count ; i++){
            if (Nombres[i].equalsIgnoreCase("luis"))
                continue;
            System.out.println("nombres = " + Nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese el nombre buscar");
        System.out.println("Nombre = " + buscar);
        boolean encontrado = false;

        for (int i = 0; i < count ; i++){
            if (Nombres[i].equalsIgnoreCase(buscar))
                encontrado = true;
            break;
        }
        if (encontrado == true){
            JOptionPane.showMessageDialog(null,buscar + " fue encontrado");
        }else{
            JOptionPane.showMessageDialog(null,buscar + " no existe en el sistema");
        }

    }

    public static void SentenciaWhileAndDo() {

        int i = 0;

        while (i < 20){
            System.out.println("i++ = " + i++);
        }

        do{
            System.out.println("i++ = " + i++);
        }while (i < 10);
    }

    public static void SentenciaForEach() {

        int[] numeros = {1,2,3,4,5,6,7,8,9,10};

        for (int num:numeros) {
            System.out.println("num = " + num);
        }
    }

    public static void SentenciasBucleEtiquetas(){
        bucle1:
        for (int i = 0; i < 5; i++){

            for (int j = 0; j < 5; j++){
                if(i == 2){
                    continue bucle1;
                }
                System.out.println("i = " + i + " j = " + j);
            }
        }
    }

    public static void SentenciasBucleEtiquetas2(){

        String frase = "tres tristes tigres tragan trigo en un trigal";
        int max = frase.length();
        int cantidad = 0;
        char letra = 't';

        for (int i = 0; i < max; i++){
            if (frase.charAt(i) != letra){
                continue;
            }
            cantidad++;
        }
        System.out.println("Encontrado = " + cantidad + " veces el caracter " + letra +  " en la frase");
    }

    public static void SentenciasBucleEtiquetas3(){

        String frase = "tres tristes tigres tragan trigo en un trigal";
        String palabra = "tristes";
        int maxFrase = frase.length();
        int maxPalabra = palabra.length();
        int cantidad = 0;
        char letra = 'e';
        buscar:
        for (int i = 0; i < maxFrase; i++){
            int k = i;
            for (int j = 0; j < maxPalabra; j++) {
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    continue buscar;
                }
            }
            cantidad++;
        }
        System.out.println("Encontrado = " + cantidad + " veces la palabra " + palabra +  " en la frase");
    }

}


