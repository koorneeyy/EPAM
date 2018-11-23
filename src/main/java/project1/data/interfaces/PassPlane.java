package project1.data.interfaces;


public class PassPlane extends Plane{
    private  int passCount;

    public PassPlane(String model, float fuelPerHour,int distance, int passCount) {
        super(model, fuelPerHour,distance);
        this.passCount=passCount;
    }

    public int getPassCount() {
        return passCount;
    }

    public void setPassCount(int passCount) {
        this.passCount = passCount;
    }

    @Override
    public String toString() {
        return super.toString()+ " passCount=" + passCount;
    }
}
