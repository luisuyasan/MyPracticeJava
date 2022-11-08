package CursoJavaBeggin.BasicJava.Matrices;

public class cambioDeNumeros {

    //Se inicializan los vectores
    private char[][] m1 ={{'h','p','r','q'},
            {'k','o','ñ','s'},
            {'s','n','l','j'},
            {'u','g','e','a'}};

    private int[][] m2 = {{0,0,0,0},
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0}};


    /**
     * Identifica los caracteres del parametro y cambia los numeros en caso que sea verdadero.
     * @param texto es la cadena de caracteres
     */
    public void cambiarNumeros(String texto) {

        //guarda los caracteres en un nuevo vector
        char[] matriztexto = texto.toCharArray();

        //recorren el array m1
        for(int fila=0; fila<m1.length; fila++) {
            for(int columna=0; columna<matriztexto.length; columna++) {

                //recorre el vector matriztexto
                for(int recorre=0; recorre<matriztexto.length; recorre++) {

                    if(matriztexto[recorre]==m1[fila][columna]) {
                        m2[fila][columna]=1;
                    }
                }
            }
        }
    }


    /**
     * Muestra el array numerico
     */
    public void mostrarMatrizNumeros() {
        for(int fila=0; fila<m2.length; fila++) {
            for(int col=0; col<m2.length; col++) {
                System.out.print(m2[fila][col]+" ");
            }
            System.out.println("");}
    }

    public static void main(String[]args) {
        cambioDeNumeros c = new cambioDeNumeros();
        c.cambiarNumeros("hola");
        c.mostrarMatrizNumeros();
    }
}