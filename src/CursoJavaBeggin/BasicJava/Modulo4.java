package CursoJavaBeggin.BasicJava;

import java.lang.reflect.Method;

public class Modulo4 // Clases Wrapper
{
    public static void main(String[] args)
    {
        //Wrapper();
        GetClass();

    }

    public static void Wrapper(){
        int intPrimitivo = 32574;
        Integer intObject = Integer.valueOf(intPrimitivo); //explicita
        Integer intObject2 = 32574;  //implicit

        //de referencia a entero primitivo
        int num = intObject;
        int num2 = intObject.intValue();

        //de String  A Entero
        String valorTvLcd = "768500";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);

        //Arreglos Boxing o unboxing
        Integer[] enteros = {Integer.valueOf(1),2,3,4,5,6,7,8,9,10};

        int suma = 0;

        for (Integer i : enteros){
            if(i.intValue() % 2 == 0){
                suma += i.intValue();
            }
        }
        System.out.println("suma = " + suma);
    }

    public static void GetClass(){

        String texto = "hi my name is class";
        Class newString =  texto.getClass();

        System.out.println("newString.getName() = " + newString.getName());
        System.out.println("newString.getSimpleName() = " + newString.getSimpleName());
        System.out.println("newString.getPackageName() = " + newString.getPackageName());
        System.out.println("newString = " + newString);

        for (Method method : newString.getMethods()){
            System.out.println("method.getName() = " + method.getName());
        }
        Integer num = 34;
        Class intClass = num.getClass();
        System.out.println("intClass = " + intClass);
        Class objClass = intClass.getSuperclass().getSuperclass();
        System.out.println("objClass = " + objClass);

        for (Method method : objClass.getMethods()){
            System.out.println("method.getName() = " + method.getName());
        }

    }
}


