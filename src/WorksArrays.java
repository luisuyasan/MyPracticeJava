public class WorksArrays
{
    public static void main(String[] args)
    {
        String[] names = {"luis","nicolas","jenny","carlos","alex"};
        Integer[] numbers = {21,10,17,26,8,32,15,23,2,14};

        int lengthNames = names.length;
        int lengthNumbers = numbers.length;

        MethodBubble(numbers,lengthNumbers);
        PrintArray(numbers,lengthNumbers);
    }


    public static void PrintArray(String[] array,int LengthArray){
        for (int i = 0; i < LengthArray;i++){
            System.out.println("names[i] = " + array[i]);
        }
    }

    public static void PrintArray(Integer[] array,int LengthArray){
        for (int i = 0; i < LengthArray;i++){
            System.out.println("names[i] = " + array[i]);
        }
    }

    public static void MethodBubble(String[] array ,int LengthArray){
        int counter = 0;
        for (int i = 0; i < LengthArray - 1; i++){
            for (int j = 0; j < LengthArray - 1 -i; j++){
                if (array[j+1].compareTo(array[j]) < 0){
                    String auxiliary = array[j];
                    array[j] = array[j + 1];
                    array[j+1] = auxiliary;
                }
                counter++;
            }
        }
    }

    public static void MethodBubble(Integer[] array, int LengthArray ){
        int counter = 0;
        for (int i = 0; i < LengthArray - 1; i++){
            for (int j = 0; j < LengthArray - 1 -i; j++){
                if (array[j+1].compareTo(array[j]) < 0){
                    Integer auxiliary = array[j];
                    array[j] = array[j + 1];
                    array[j+1] = auxiliary;
                }
                counter++;
            }
        }
    }

}

