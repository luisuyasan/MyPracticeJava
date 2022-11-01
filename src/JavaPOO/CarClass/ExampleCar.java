package JavaPOO.CarClass;

import static JavaPOO.CarClass.TypeMotor.DIESEL;
import static JavaPOO.CarClass.TypeMotor.GASOLINE;

public class ExampleCar
{
    public static void main(String[] args) {

        Person person = new Person("Luis","Uyasan");
        Car carSubaru = new Car();
        carSubaru.setMaker("Subaru");
        carSubaru.setModel("Impreza");
        carSubaru.setColor(ColorCar.BLACK);
        carSubaru.setMotor(new Motor(1.6,GASOLINE));
        carSubaru.setType(TypeCar.HATCHBACK);
        carSubaru.setPerson(person);


        Car.setIdentifyModel("5897KC");  // Attribute Static access without Instance of class , affect all objects of class

        Car carMazda = new Car("Mazda","CX-50",ColorCar.RED,new Motor(2.0,GASOLINE),TypeCar.SEDAN);
        carMazda.setMotor(new Motor(2.0,GASOLINE));

        Car carMazda2 = new Car("Mazda","CX-50",ColorCar.YELLOW,new Motor(2.0,DIESEL),TypeCar.CONVERTIBLE);
        Car carNull = new Car();

        System.out.println("Car Subaru \n" + carSubaru.detail());
        System.out.println("Car Mazda \n" + carMazda.detail());
        System.out.println("Car Mazda \n" + carMazda2.detail());
        System.out.println("start = " + carSubaru.Star(300));
        System.out.println("break = " + carSubaru.brake());
        System.out.println("breaking subaru = " + carSubaru.StartAndBreak(3000));
        //carMazda.setTank(new Tank(40));
        System.out.println("km for liter = " + carMazda.calculateConsumption(300,0.6f));
        System.out.println("km for liter = " + carMazda.calculateConsumption(300,60));

        System.out.println();
        //compare objects , override method equals
        System.out.println("es equal = " + (carMazda == carMazda2));
        System.out.println("es equal = " + (carMazda.equals(carMazda2)));
        System.out.println("es equal = " + (carNull.equals(new String("holi"))));

        System.out.println();
        //override method toString
        System.out.println(carMazda2.toString());

        System.out.println();
        System.out.println("Subaru Id = " + carSubaru.getId());
        System.out.println("Mazda  Id = " + carMazda.getId());
        System.out.println("Mazda2 Id = " + carMazda2.getId());
        System.out.println("Null Id = " + carNull.getId());

        System.out.println();
        SwitchWithEnum();
        System.out.println();
        ForEachWithEnum();
        

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
