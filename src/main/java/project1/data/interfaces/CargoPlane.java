package project1.data.interfaces;

public class CargoPlane extends Plane {
    private int maxCapacity;

    public CargoPlane(String model, float fuelPerHour,int distance,int maxCapacity) {
        super(model, fuelPerHour, distance);
        this.maxCapacity=maxCapacity;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    @Override
    public String toString() {
        return super.toString()+ " maxCapacity=" + maxCapacity ;
    }
}
