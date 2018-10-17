package task3_1.model.entity;


public abstract class BaseToy {
 private String name;
 private String description;
 private int price;
 private int childAge;

    public BaseToy(String name, String description, int price, int childAge) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.childAge = childAge;
    }

    @Override
    public String toString() {
        return "BaseToy{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", childAge=" + childAge +
                '}';
    }

    abstract void playWithToy();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getChildAge() {
        return childAge;
    }

    public void setChildAge(int childAge) {
        this.childAge = childAge;
    }



}
