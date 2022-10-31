package JavaPOO.CarClass;

public enum TypeCar
{
    SEDAN("Sedan","middle Car",4),
    STATION_WAGON("Station Wagon","Big Car",4),
    HATCHBACK("Hatchback","Compact Car",4),
    PICKUP("Pickup","Camioneta",4),
    COUPE("Coupe","Small Car",2),
    CONVERTIBLE("Convertible","Deportivo Car",2),
    TRUCK("Truck","Utility Car",4);

    private final String name;
    private final String description;
    private final int numberDoors;


    TypeCar(String name,String description,int numberDoors) {
        this.name = name;
        this.description = description;
        this.numberDoors = numberDoors;

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getNumberDoors() {
        return numberDoors;
    }
}
