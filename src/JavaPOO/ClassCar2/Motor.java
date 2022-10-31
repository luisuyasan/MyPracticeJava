package JavaPOO.ClassCar2;

public class Motor {
    private double Displacement;
    private TypeMotor type;

    public Motor() {
    }

    public Motor(double displacement, TypeMotor type) {
        Displacement = displacement;
        this.type = type;
    }

    public double getDisplacement() {
        return Displacement;
    }

    public void setDisplacement(double displacement) {
        Displacement = displacement;
    }

    public TypeMotor getType() {
        return type;
    }

    public void setType(TypeMotor type) {
        this.type = type;
    }
}
