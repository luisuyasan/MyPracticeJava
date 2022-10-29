package JavaPOO;

// my first clas with parameters, methods, constructors, getAndSet
public class Car
{
    private String maker;
    private String model;
    private String color;
    private double displacement;
    private int capacityTank = 40;

    //constructor
    public Car(){} // without parameter
    public Car(String maker,String model,String color,double displacement) {
        this.maker = maker;
        this.model = model;
        this.color = color;
        this.displacement = displacement;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    public int getCapacityTank() {
        return capacityTank;
    }

    public void setCapacityTank(int capacityTank) {
        this.capacityTank = capacityTank;
    }

    public String detail(){
        return
                color + "\n" +
                maker + "\n" +
                model + "\n" +
                displacement + "\n";
    }

    public String Star(int rpm){
        return "the car " + maker + " init a " + rpm + "rpm";
    }

    public String brake(){
        return maker + " " + model + " breaking!";
    }

    public String StartAndBreak(int rpm){
        String start = Star(rpm);
        String brake =  brake();
        return start + "\n" + brake;
    }

    public float calculateConsumption(int km, float percentCombustible){
        return km/(capacityTank * percentCombustible);
    }

    public float calculateConsumption(int km, int percentCombustible){
        return km/(capacityTank * (percentCombustible)/100f);
    }

}
