package project1.data.interfaces;

public class Plane {
    private String model;
    private float fuelPerHour;
    private int distance;

    public Plane(String model, float fuelPerHour, int distance) {
        this.model = model;
        this.fuelPerHour = fuelPerHour;
        this.distance=distance;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getFuelPerHour() {
        return fuelPerHour;
    }

    public void setFuelPerHour(float fuelPerHour) {
        this.fuelPerHour = fuelPerHour;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return  this.getClass().getSimpleName()+
                "model='" + model + '\'' +
                "distance ='" + distance + '\'' +
                ", fuelPerHour=" + fuelPerHour ;
    }
}
