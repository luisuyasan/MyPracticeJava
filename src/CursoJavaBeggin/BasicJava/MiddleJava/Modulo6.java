package CursoJavaBeggin.BasicJava.MiddleJava;

public class Modulo6
{
    public static void main(String[] args) {

        Person person = new Person();
        person.modificarNombre("luis");
        System.out.println("person.readName() = " + person.readName());
        test();
        System.out.println("name again from method main = " + person.readName());

    }
    public static void test(){
        System.out.println("Start Method Test");
        Person person = new Person();
        person.modificarNombre("pepe");
        System.out.println("person.readName() = " + person.readName());
        System.out.println("Ending Method test");
    }
}

class Person
{
    private String nombre;

    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }
    public String readName(){
        return this.nombre;
    }
}

