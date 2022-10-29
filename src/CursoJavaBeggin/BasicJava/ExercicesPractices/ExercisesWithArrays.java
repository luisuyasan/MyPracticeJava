package CursoJavaBeggin.BasicJava.ExercicesPractices;

import java.util.Scanner;

public class ExercisesWithArrays
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double[] classMath,classHistory,classLanguage;
        double sumNotesMath = 0 , sumNotesHistory = 0 , sumNotesLanguage = 0;
        System.out.println("input the notes quantity");
        int quantityNotes =  scanner.nextInt();
        classMath = new double[quantityNotes];
        classHistory = new double[quantityNotes];
        classLanguage = new double[quantityNotes];


        System.out.println("notes for Math");
        FillingUpArray(classMath,quantityNotes);
        System.out.println("notes for History");
        FillingUpArray(classHistory,quantityNotes);
        System.out.println("notes for Language");
        FillingUpArray(classLanguage,quantityNotes);

        System.out.println("pro class Math = " + SumaNotes(classMath,sumNotesMath)/classMath.length);
        System.out.println("pro class History = " + SumaNotes(classHistory,sumNotesHistory)/classHistory.length);
        System.out.println("pro class Language = " + SumaNotes(classLanguage,sumNotesLanguage)/classHistory.length);

        System.out.println("Prom student = " + PromStudent(classMath,classHistory,classLanguage)  );

    }

    public static void FillingUpArray(double[] array, int total){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < total;i++){
            System.out.println("input note " + (i + 1));
            array[i] = scanner.nextDouble();
        }
    }

    public static double SumaNotes(double[] array, double Notes){
        for (int i = 0; i < array.length; i++){
            Notes += array[i];
        }
        return Notes;
    }

    public static double PromStudent(double[] subject1,double[] subject2,double[] subject3) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input id student");
        int id = scanner.nextInt() - 1;
        double promStudent = (subject1[id] + subject2[id] + subject3[id])/3;
        return promStudent;
    }


}


