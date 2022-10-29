package JavaPOO;

public class ExampleCar 
{
    public static void main(String[] args) {
        Car carSubaru = new Car();
        carSubaru.setMaker("Subaru");
        carSubaru.setModel("Impreza");
        carSubaru.setColor("Black");
        carSubaru.setDisplacement(2.0);

        Car carMazda = new Car("Mazda","CX-50","Red",2.0);
        carMazda.setDisplacement(2.0);

        System.out.println("Car Subaru \n" + carSubaru.detail());
        System.out.println("Car Mazda \n" + carMazda.detail());
        System.out.println("start = " + carSubaru.Star(300));
        System.out.println("break = " + carSubaru.brake());
        System.out.println("breaking subaru = " + carSubaru.StartAndBreak(3000));
        System.out.println("km for liter = " + carMazda.calculateConsumption(300,0.6f));
        System.out.println("km for liter = " + carMazda.calculateConsumption(300,60));


    }
}
