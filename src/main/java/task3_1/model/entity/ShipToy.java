package task3_1.model.entity;


public class ShipToy extends BaseToy {
    private int maxDistance;
    public ShipToy(String name, String description, int price, int childAge,int maxDistance) {
        super(name, description, price, childAge);
        this.maxDistance=maxDistance;

    }

    @Override
    void playWithToy() {

    }

    @Override
    public String toString() {
        return super.toString() + "{" + "maxDistance=" + maxDistance + '}';
    }
}
