package task2_2.data;

import task2_2.model.entity.Circle;
import task2_2.model.entity.Rectangle;
import task2_2.model.entity.Shape;
import task2_2.model.entity.Triangle;

public class DataSource {

    public static Shape[] getShapes(){
        return  new Shape[]{
                new Circle(5.5,"red"),
                new Circle(39.5,"brown"),
                new Circle(4.4,"orange"),
                new Circle(82.5,"blue"),
                new Rectangle(10.1,22.2,"green"),
                new Rectangle(23.1,87.2,"red"),
                new Rectangle(1.1,2.2,"magenta"),
                new Rectangle(45.1,72.2,"cyan"),
                new Triangle(5.5,4.2,"blue"),
                new Triangle(7.5,12.7,"green"),
                new Triangle(57.5,41.2,"gray"),
                new Triangle(68.5,15.2,"black")
        };
    }

}
