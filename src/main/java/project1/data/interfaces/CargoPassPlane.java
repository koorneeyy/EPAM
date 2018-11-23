package project1.data.interfaces;

public class CargoPassPlane extends Plane {
    private int maxCapacity;
    private  int passCount;
    public CargoPassPlane(String model, float fuelPerHour,int distance, int maxCapacity,int passCount) {
        super(model, fuelPerHour, distance);
        this.maxCapacity=maxCapacity;
        this.passCount=passCount;
    }

    public int getPassCount() {
        return passCount;
    }

    public void setPassCount(int passCount) {
        this.passCount = passCount;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    @Override
    public String toString() {
        return super.toString()+ " maxCapacity=" + maxCapacity +
                ", passCount=" + passCount ;
    }
}
