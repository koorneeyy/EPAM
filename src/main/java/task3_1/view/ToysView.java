package task3_1.view;

import task3_1.model.entity.BaseToy;

public class ToysView {
    public static final String ALL_TOYS="All toys :";
    public static final String PRICE_SUM="All toys cost: ";
    public static final String COUNT="Count toys in room: ";
    public static final String BY_AGE_FILTER="Toys for children younger than 5 : ";
    public static final String BY_NAME="Toys sorted by name: ";
    public void printToys(String message, BaseToy[] toys){
        System.out.println(message);
        for (BaseToy toy:toys){
            System.out.println(toy);
        }
    }

    public void printMessage(String s) {
        System.out.println(s);
    }

}
