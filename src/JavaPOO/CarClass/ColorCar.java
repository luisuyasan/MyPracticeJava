package JavaPOO.CarClass;

public enum ColorCar
{
    RED("Red"),
    BLACK("Black"),
    YELLOW("Yellow"),
    BLUE("Blue"),
    WHITE("White");

    //customize date
    private final String color;

    ColorCar(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}




