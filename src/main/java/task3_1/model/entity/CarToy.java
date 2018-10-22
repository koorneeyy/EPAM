package task3_1.model.entity;


public class CarToy extends BaseToy {
    private int maxSpeed;

    public CarToy(String name, String description, int price, int childAge, int maxSpeed) {
        super(name, description, price, childAge);
        this.maxSpeed = maxSpeed;
    }

    @Override
    void playWithToy() {
        System.out.println("game with toy start.... \n I'move with speed" + maxSpeed);
    }

    @Override
    public String toString() {
        return super.toString() + "{" + "maxSpeed=" + maxSpeed + '}';
    }

}
