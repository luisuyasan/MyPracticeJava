package JavaPOO.CarClass;

// my first clas with parameters, methods, constructors, getAndSet
public class Car
{
    //Attributes
    private int id;
    private String maker;
    private String model;
    private ColorCar color;
    private double displacement;
    private int capacityTank = 40;
    private static String IdentifyModel;
    private static int LastId;
    public static final Integer ROAD_TOP_SPEED = 100;  //Variable type constant(final)

    private TypeCar type;


    //constructor
    public Car(){      // without parameter
        this.id = ++LastId;
    }
    public Car(String maker,String model) {
        this();
        this.maker = maker;
        this.model = model;
    }
     //constructor
    public Car(String maker,String model, ColorCar color, double displacement,TypeCar typeCar){
        this(maker,model); //constructor in constructor
        this.color = color;
        this.displacement = displacement;
        this.type = typeCar ;
    }

    //Methods set and get
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

    public ColorCar getColor() {
        return color;
    }

    public void setColor(ColorCar color) {
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

    public static String getIdentifyModel() {
        return IdentifyModel;
    }
    public static void setIdentifyModel(String identifyModel) {
        IdentifyModel = identifyModel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TypeCar getType() {
        return type;
    }

    public void setType(TypeCar type) {
        this.type = type;
    }

    //Methods

    public String detail(){
        return
                id + "\n" +
                color.getColor() + "\n" +
                maker + "\n" +
                model + "\n" +
                displacement + "\n" +
                IdentifyModel + "\n" +
                        ROAD_TOP_SPEED + "\n" +   //type const final not modify!
                type.getName() + "\n" +
                        type.getDescription() + "\n" +
                        type.getNumberDoors() + "\n";

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

    @Override    //indica sobre escritura de un metodo.
    public boolean equals(Object obj) {
        if (!(obj instanceof Car)){
            System.out.println("it is not object type Car");
            return false;
        }
        Car c = (Car) obj;
        return (this.maker != null && this.model != null
                && this.maker.equals(c.getMaker())
                && this.model.equals(c.getModel()));
    }

    @Override
    public String toString() {
        return "Car" + "\n" +
                "Maker = " + maker +  "\n" +
                "Model = " + model + "\n";
    }
}
