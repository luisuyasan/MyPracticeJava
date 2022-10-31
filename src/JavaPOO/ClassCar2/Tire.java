package JavaPOO.ClassCar2;

public class Tire {
    private String marker;
    private int aro;
    private double width;

    public Tire() {
    }

    public Tire(String marker, int aro, double width) {
        this.marker = marker;
        this.aro = aro;
        this.width = width;
    }

    public String getMarker() {
        return marker;
    }

    public int getAro() {
        return aro;
    }

    public double getWidth() {
        return width;
    }
}
