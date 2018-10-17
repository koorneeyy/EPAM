package task3_1.view;

import task3_1.model.entity.BaseToy;

public class ToysView {
    public void printShapes(String message, BaseToy[] toys){
        System.out.println(message);
        for (BaseToy toy:toys){
            System.out.println(toy);
        }
    }

    public void printMessage(String s) {
        System.out.println(s);
    }

}
