package JavaPOO.CarClass;

import java.util.Arrays;

import static JavaPOO.CarClass.TypeMotor.DIESEL;
import static JavaPOO.CarClass.TypeMotor.GASOLINE;

public class ExampleCar
{
    public static void main(String[] args) {

        Car.setIdentifyModel("5897KC");  // Attribute Static access without Instance of class , affect all objects of class

        carMazda();
        carMazda2();
        carFord();
        Car carNull = new Car();


        System.out.println("Car Subaru \n" + carSubaru().detail());
        System.out.println("Car Mazda \n" + carMazda().detail());
        System.out.println("Car Mazda \n" + carMazda2().detail());
        System.out.println("Car Ford \n" + carFord().detail());

        System.out.println("start = " + carSubaru().Star(300));
        System.out.println("break = " + carSubaru().brake());
        System.out.println("breaking subaru = " + carSubaru().StartAndBreak(3000));
        //carMazda.setTank(new Tank(40));
        System.out.println("km for liter = " + carMazda().calculateConsumption(300,0.6f));
        System.out.println("km for liter = " + carMazda().calculateConsumption(300,60));

        System.out.println();
        //compare objects , override method equals
        System.out.println("es equal = " + (carMazda() == carMazda2()));
        System.out.println("es equal = " + (carMazda().equals(carMazda2())));
        System.out.println("es equal = " + (carNull.equals(new String("holi"))));

        System.out.println();
        //override method toString
        System.out.println(carMazda2().toString());

        System.out.println();
        System.out.println("Subaru Id = " + carSubaru().getId());
        System.out.println("Mazda  Id = " + carMazda().getId());
        System.out.println("Mazda2 Id = " + carMazda2().getId());
        System.out.println("Null Id = " + carNull.getId());

        System.out.println();
        SwitchWithEnum();
        System.out.println();
        ForEachWithEnum();


        Car[] car = new Car[4];
        car[0] = carSubaru();
        car[1] = carMazda();
        car[2] = carMazda2();
        car[3] = carFord();

        System.out.println();

        Arrays.sort(car);
        for (Car value : car) {
            System.out.println("car = " + value);
        }

    }
    public static Car carSubaru(){
        Person person = new Person("Luis","Uyasan");
        Tank tank = new Tank(30);
        Tire[] tires = new Tire[5];
        Tire tire = new Tire("Pirelli",17,7.5);
        Arrays.fill(tires, tire);   // method Arrays.fill -- function equal that a for lop.


        Car carSubaru = new Car();
        carSubaru.setMaker("Subaru");
        carSubaru.setModel("Impreza");
        carSubaru.setColor(ColorCar.BLACK);
        carSubaru.setMotor(new Motor(1.6,GASOLINE));
        carSubaru.setType(TypeCar.HATCHBACK);
        carSubaru.setTank(tank);
        carSubaru.setPerson(person);
        carSubaru.setTires(tires);
        return carSubaru;
    }

    public static Car carMazda(){
        //objeto con parametros pasados por el constructor de la clase;
        Car carMazda = new Car("Mazda","CX-50",ColorCar.RED,new Motor(2.0,GASOLINE),TypeCar.SEDAN,new Tank(),new Person("Nicolas","Uyasan"),ArrayTiresMazda());
        return carMazda;
    }

    public static Car carMazda2(){
        //objeto con parametros pasados por el constructor de la clase;
        Car carMazda2 = new Car("Mazda","CX-50",ColorCar.YELLOW,new Motor(2.0,DIESEL),TypeCar.CONVERTIBLE,new Tank(),new Person("Jenny","Tao"),ArrayTiresMazda2());
        return carMazda2;
    }

    public static Car carFord(){
        //objeto con parametros pasados por el constructor de la clase;
        return new Car("Ford","Escape",ColorCar.BLACK,new Motor(3.0,GASOLINE),TypeCar.PICKUP,new Tank(),new Person("Sorany","Giraldo"),ArrayTiresFord());
    }
    public static Tire[] ArrayTiresMazda(){
        Tire[] tires = new Tire[5];
        Tire tire = new Tire("Firestone",16,7.2);
        for (int i = 0 ; i < tires.length; i ++){
            tires[i] = tire;
        }
        return tires;
    }

    public static Tire[] ArrayTiresMazda2(){
        Tire[] tires = new Tire[4];
        tires[0] = new Tire("GoodYear",18,7.9);
        tires[1] = new Tire("GoodYear",18,7.9);
        tires[2] = new Tire("GoodYear",18,7.9);
        tires[3] = new Tire("GoodYear",18,7.9);
        return tires;
    }

    public static Tire[] ArrayTiresFord(){
        Tire[] tires = new Tire[5];
        Tire tire = new Tire("Continental",21,8.4);
        for (int i = 0 ; i < tires.length; i ++){
            tires[i] = tire;
        }
        return tires;
    }



    public static void SwitchWithEnum(){
        Car carMazda2 = new Car("Mazda","CX-50",ColorCar.YELLOW,new Motor(2.5,DIESEL),TypeCar.CONVERTIBLE);
        TypeCar typeCar = carMazda2.getType();
        switch (typeCar){
            case COUPE:
                System.out.println("coupe");
                break;
            case SEDAN:
                System.out.println("sedan");
                break;
            case TRUCK:
                System.out.println("truck");
                break;
            case PICKUP:
                System.out.println("pickup");
                break;
            case HATCHBACK:
                System.out.println("hatchback");
                break;
            case CONVERTIBLE:
                System.out.println("convertible");
                break;
            case STATION_WAGON:
                System.out.println("station wagon");
                break;
            default:
                System.out.println("any type");
                break;
        }
    }

    public static void ForEachWithEnum(){
        TypeCar[] types = TypeCar.values();
        for (TypeCar tc: types) {
            System.out.println("tc = " + tc.getName()+", " +
                                          tc.getDescription()+ "," +
                                           tc.getNumberDoors());
        }
    }
}
