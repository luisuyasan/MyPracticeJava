package JavaPOO.CarClass;


// my first clas with parameters, methods, constructors, getAndSet
public class Car
{
    //Attributes
    private int id;
    private String maker;
    private String model;
    private ColorCar color;
    private Motor motor;
    private Tank tank;
    private Person person;
    private Tire[] tires;
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
    public Car(String maker,String model, ColorCar color, Motor motor,TypeCar typeCar){
        this(maker,model); //constructor in constructor
        this.color = color;
        this.motor = motor;
        this.type = typeCar ;
    }

    public Car(String maker,String model, ColorCar color, Motor motor,TypeCar typeCar,Tank tank, Person person, Tire[] tires) {
        this(maker,model,color,motor,typeCar);
        this.tank = tank;
        this.person = person;
        this.tires = tires;
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

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Tank getTank() {
        if(tank == null){
        this.tank = new Tank();
        }return tank;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Tire[] getTires() {
        return tires;
    }

    public void setTires(Tire[] tires) {
        this.tires = tires;
    }

    //Methods
    public String detail(){
        String detail =
                "Id = " + id + "\n" +
                "Color = " + color.getColor() + "\n" +
                "Maker = " + maker + "\n" +
                "Model = " + model + "\n" +
                "Motor = " + motor.getDisplacement() +", "+ motor.getType() + "\n" +
                "Identify Model  = " + IdentifyModel + "\n" +
                "Top Speed = " +ROAD_TOP_SPEED + " Km/H "+ "\n" +   //type const final not modify!
                "Type = " +type.getName() + "\n" +
                "Description = " +type.getDescription() + "\n" +
                "Number Doors = " +type.getNumberDoors() + "\n" +
                "Drive = " + person + "\n" +
                "Capacity = " + tank.getCapacity() + "\n" +
                "Set of Tires";
                    if(getTires() != null){
                    for(Tire tire: this.getTires()){
                      detail +="\n"+ (tire.getMarker() + ", " + tire.getAro()+ ", " + tire.getWidth());
                       }
                    }
                    return detail  + "\n";
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
        return km/(this.getTank().getCapacity() * percentCombustible);
    }

    public float calculateConsumption(int km, int percentCombustible){
        return km/(this.getTank().getCapacity() * (percentCombustible)/100f);
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
