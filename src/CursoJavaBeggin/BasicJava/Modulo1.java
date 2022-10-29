package CursoJavaBeggin.BasicJava;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Modulo1
{
    public static void main(String[] args)
    {
        var minum1 = 10;
        var minum2 = 5;

        System.out.println(numeros(minum1,minum2));
        System.out.println(saludar("luis").toUpperCase());

        int numeroDecimal = 500;
        System.out.println("numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal) );

        int numeroBinario = 111110100;
        System.out.println("numero octal de " + numeroBinario + " = " + Integer.toOctalString( numeroBinario) );

        ShowWindow();
        ShowConsole();
        compareToStrings();
        ClasStringBuilder("uyasan");
        ConcatStringBuilder();
        CountStrings();
        EjercicioMod1();

    }

    public static int numeros(int a , int b)
    {
        var suma = a + b;
        return suma;
    }

    public static String saludar(String tuNombre){
        var saludo = "hola " + tuNombre + " Bienvenido";
        return saludo;
    }

    public static void ShowWindow(){
        String numeroStr =  JOptionPane.showInputDialog(null,"ingrese un numero entero");
        int number = 0;
        try
        {
            number = Integer.parseInt(numeroStr);
        }catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"debe ingresar un numero");
            ShowWindow();
            System.exit(0);
        }

        String mensaje = "tu numero es: " + number;
        JOptionPane.showMessageDialog(null,mensaje);
    }

    public static void ShowConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero : ");
        int number = 0;
        try {
            number = scanner.nextInt();
        } catch (InputMismatchException e) {
            ShowConsole();
            System.exit(0);
        }

        String mensaje = "tu numero es: " + number;
        System.out.println(mensaje);
    }

    public static void compareToStrings(){
        String nombre = "luis";
        String apellido = "luis";
        boolean esIgual = nombre.equals(apellido);
        System.out.println("esIgual = " + esIgual);
    }

    public static void ClasStringBuilder(String Apellido){
        String Name = "luis ";
        StringBuilder stringBuilder = new StringBuilder(Name);
        var newName = stringBuilder.append(Apellido);
        System.out.println("newName = " + newName);
    }

    public static void ConcatStringBuilder(){
        String Welcome = "el abc = ";
        String a = "a";
        String b = "b";
        String c = "c";
        StringBuilder Sb = new StringBuilder(Welcome);

        var concatenate = Sb.append(a).append("+").append(b).append("+").append(c);
        System.out.println("concatenate = " + concatenate);
    }

    public static void CountStrings(){
        String archivo = "alguna.imagen.js";
        int i = archivo.indexOf("u");
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(i+1) = " + archivo.substring(i+1));
    }

    public static void EjercicioMod1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write names your family");
        String integrante1 = scanner.nextLine();
        String integrante2 = scanner.nextLine();
        String integrante3 = scanner.nextLine();

        String selection1 = integrante1.substring(1,2).toUpperCase().concat(".");
        String charters = integrante1.substring(integrante1.length() - 2);

        String selection2 = integrante2.substring(1,2).toUpperCase().concat(".");
        String charters2 = integrante2.substring(integrante1.length() - 1);

        String selection3 = integrante3.substring(1,2).toUpperCase().concat(".");
        String charters3 = integrante3.substring(integrante1.length() - 1);

        StringBuilder stringBuilder = new StringBuilder();

        String separator = "_";
        var Family =  stringBuilder.append(selection1).append(charters).append(separator).append(selection2).append(charters2).append(separator).append(selection3).append(charters3);

        System.out.println("caracteres = " + Family);
    }

}