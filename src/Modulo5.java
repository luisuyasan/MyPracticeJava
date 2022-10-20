public class Modulo5
{
    public static void main(String[] args)
    {
        int[] numbers = {1,2,3,4};
        //int i = 10;
        //System.out.println("valor desde el main = " + i);
        //PasarPorValor(i);
        //System.out.println("finalizando el method main = " + i);

        System.out.println("values from main");
        for (int i = 0; i < numbers.length;i++){
            System.out.println("numbers[i] = " + numbers[i]);
        }
        System.out.println("Before call method");
        PasarPorReferencia(numbers);
        System.out.println("After call method");
        for (int i = 0; i < numbers.length;i++){
            System.out.println("numbers[i] = " + numbers[i]);
        }
        System.out.println(" Ending method with array data modified");


    }

    public static void PasarPorValor(int i) {
        System.out.println("valor desde el method PasarPorValor = " + i);
        i = 35;
        System.out.println("cambio valor desde el method " + i);
    }

    public static void PasarPorReferencia(int[] edadArray) {
        System.out.println("Start Method PasarPorReferencia");
        for (int i = 0; i < edadArray.length;i++){
            edadArray[i] = edadArray[i] + 20;
        }
        System.out.println("Ending Method PasarPorReferencia ");
    }

}

