package CursoJavaBeggin.BasicJava;

import javax.swing.*;
import java.util.Scanner;

public class Modulo2
{
    public static void main(String[] args)
    {
        /*
        int i = 5;
        byte j = 7;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;
        byte b = 127;
        */

        //Validation();
        //OperadorTernario();
        //OperadorTernario2();
        //NumerosOrdenados();
        //ExercisePractice();
        //ExercisePractice2();

    }

    public static void Validation(){
        String[] usernames = {"luis","jenny","nicolas","alex"};
        String[] passwords = {"123","12345","123456","1234567"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el username");
        String u = scanner.nextLine();
        System.out.println("ingrese el password");
        String p = scanner.nextLine();

        boolean esAutenticate = false;

        try {
            for (int i = 0; i < usernames.length; i++) {
                if (usernames[i].equals(u) && passwords[i].equals(p)) {
                    esAutenticate = true;
                    break;
                } else {
                    esAutenticate = false;
                }
            }
            if(esAutenticate == true){
                System.out.println("puedes ingresar");
            }
            else{
                System.out.println("no puedes ingresar");
            }
        }catch (NullPointerException e){
            System.out.println("saliendo");
            System.exit(0);
        }
    }

    public static void OperadorTernario(){
        Scanner scanner = new Scanner(System.in);

        double promedio;
        double mathematics;
        double ciencias;
        double historia;
        String Nota;

        String mensaje =  "ingrese una nota entre 0.0 y 5.0";

        System.out.println(mensaje);
        mathematics = scanner.nextDouble();

        System.out.println(mensaje);
        ciencias = scanner.nextDouble();

        System.out.println(mensaje);
        historia = scanner.nextDouble();

        promedio = (mathematics + ciencias + historia) / 3;
        Nota = (promedio >= 3.0 ? "Aprobado" : "Perdido");
        StringBuilder stringBuilder = new StringBuilder("su nota final es: ");

        System.out.println(stringBuilder.append(promedio).append(" Su estado es = ").append(Nota));
    }

    public static void OperadorTernario2(){
        int max = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num1 = scanner.nextInt();

        System.out.println("ingrese un segundo numero");
        int num2 = scanner.nextInt();

        System.out.println("ingrese un tercero numero");
        int num3 = scanner.nextInt();

        System.out.println("ingrese un cuarto numero");
        int num4 = scanner.nextInt();

        max = (num1 > num2)? num1 : num2;
        max = (max > num3)? max : num3;
        max = (max > num4)? max  :num4;

        System.out.println("max = " + max);
    }

    public static void NumerosOrdenados(){
        int num1 = 0;
        int num2 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        num1 =  scanner.nextInt();
        System.out.println("ingrese el segundo numero");
        num2 = scanner.nextInt();

        int numeroMayor = (num1 > num2)? num1 : num2;
        int numeroMenor = (num1 < num2)? num1 : num2;

        StringBuilder stringBuilder = new StringBuilder("orden mayor a menor = ");
        var result =  stringBuilder.append(numeroMayor).append(",").append(numeroMenor);
        System.out.println(result);
    }

    public static void ExercisePractice(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese la medida actual del tanque");
        double Estanque = scanner.nextDouble();

        if (Estanque == 70) {
            System.out.println("Estanque Lleno");
        } else if (Estanque >= 60 && Estanque < 70) {
            System.out.println("Estanque casi lleno");
        } else if(Estanque >= 40 && Estanque < 60) {
            System.out.println("Estanque  3/4");
        } else if (Estanque >= 35 && Estanque < 40) {
            System.out.println("Medio Estanque");
        } else if (Estanque >= 20 && Estanque < 35) {
            System.out.println("Suficiente");
        }else if(Estanque >= 1 && Estanque < 20){
            System.out.println("Insuficiente");
        }else{
            System.out.println("valor incorrecto");
        }
    }

    public static void ExercisePractice2(){
        String Nombre1 = JOptionPane.showInputDialog("ingrese el primer integrante de tu familia");
        String Nombre2 = JOptionPane.showInputDialog("ingrese el segundo integrante de tu familia");
        String Nombre3 = JOptionPane.showInputDialog("ingrese el tercer integrante de tu familia");

        String str1 = Nombre1;
        String str2 = Nombre2;
        String str3 = Nombre3;
        String[] newStr1 = str1.split("\\s+");
        String[] newStr2 = str2.split("\\s+");
        String[] newStr3 = str3.split("\\s+");

        //for (int i = 0; i < newStr.length; i++) {
        //System.out.println(newStr[i]);
        //}

        var cant1 = newStr1[0].length();
        var cant2 = newStr2[0].length();
        var cant3 = newStr3[0].length();

        if(cant1 > cant2 && cant1 > cant3){
            JOptionPane.showMessageDialog( null, Nombre1 + " tiene el nombre mas largo");
        }else if (cant2 > cant1 && cant2 > cant3) {
            JOptionPane.showMessageDialog( null, Nombre2 + " tiene el nombre mas largo");
        } else if (cant3 > cant2 && cant3 > cant1) {
            JOptionPane.showMessageDialog( null, Nombre3 + " tiene el nombre mas largo");
        }
    }

}
