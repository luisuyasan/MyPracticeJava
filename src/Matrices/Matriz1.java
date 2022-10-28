package Matrices;

public class Matriz1
{
    public static void main(String[] args)
    {
        //MatrizIntegers();
        //MatrizString();
        //MatrizString2();
        //MatrizVariable();
        MatrizIntegers2();

    }
    public static void MatrizIntegers(){
        int[][] numbers;
        numbers = new int[2][4];
        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[0][2] = 3;
        numbers[0][3] = 4;

        numbers[1][0] = 4;
        numbers[1][1] = 3;
        numbers[1][2] = 2;
        numbers[1][3] = 1;
        
        for (int i = 0; i < numbers.length;i++){
            for (int j = 0; j < numbers[i].length;j++)
            System.out.println("numbers = " + numbers[i][j]);
        }

    }

    public static void MatrizString(){

        String[][] names = new String[2][2];
        names[0][0] = "luis";
        names[0][1] = "jenny";
        names[1][0] = "nicolas";
        names[1][1] = "samantha";

        for (String[] fila: names) {
            for (String name: fila) {
                System.out.print(name + "\t");
            }
            System.out.println();
        }
    }

    public static void MatrizString2(){
        String[][] names = new String[3][2];
        names[0][0] = "luis";
        names[0][1] = "uyasan";
        names[1][0] = "nicolas";
        names[1][1] = "uyasan";
        names[2][0] = "jenny";
        names[2][1] = "tao";

        for (int i = 0; i < names.length;i++){
            for (int j = 0; j < names[i].length;j++){
                System.out.print(names[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    public static void MatrizVariable(){
        
        int[][] matriz = new int[3][];
        
        matriz[0] = new int[2];
        matriz[1] = new int[3];
        matriz[2] = new int[4];

        System.out.println("matriz.length = " + matriz.length);
        System.out.println("matriz[0].length = " + matriz[0].length);
        System.out.println("matriz[1].length = " + matriz[1].length);
        System.out.println("matriz[2].length = " + matriz[2].length);

        for (int i = 0; i < matriz.length;i++){
            for (int j = 0; j < matriz[i].length;j++){
               matriz[i][j] = i * j;
            }
        }

        for (int i = 0; i < matriz.length;i++){
            for (int j = 0; j < matriz[i].length;j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

    }

    public static void MatrizIntegers2(){
        int[][] numbers = {{35,90,3,1978},
                           {15,20,10,5},
                           {677,127,542,1994}};

        int searchElement = 578;
        boolean find = false;
        int i = 0;
        int j = 0;
        Search: for (; i < numbers.length;i++){
            for (j = 0;j < numbers[i].length;j++)
                if(numbers[i][j] == searchElement){
                    find = true;
                    break Search;
                }
        }
        
        if (find){
            System.out.println("find " + searchElement + " in position: " + i + "," + j);
        }else{
            System.out.println("number " + searchElement + " not found");
        }
    }

}
