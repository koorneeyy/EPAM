package task2_2.model;


import task2_2.model.entity.Circle;
import task2_2.model.entity.Rectangle;
import task2_2.model.entity.Shape;
import task2_2.model.entity.Triangle;

import java.util.Arrays;
import java.util.Comparator;

public class Shapes {
    Shape [] shapes;

    public Shape[] getShapes() {
        return shapes;
    }

    public void setShapes(Shape[] shapes) {
        this.shapes = shapes;
    }

    public double sumArea(){
        double result = 0;
        for(Shape shape:shapes){
            result +=shape.calcArea();
        }
        return result;
    }

    public void orderByArea() {
        Arrays.sort(shapes, new Comparator<Shape>() {
            @Override
            public int compare(Shape o1, Shape o2) {
                return (int) (o1.calcArea()-o2.calcArea());
            }
        });
    }

    public void orderByColor() {
        Arrays.sort(shapes, new Comparator<Shape>() {
            @Override
            public int compare(Shape o1, Shape o2) {
                return o1.getShapeColor().compareTo(o2.getShapeColor());
            }
        });
    }

    public double sumAreaByFigure(int figure) {
        double result = 0;

        for(Shape shape:shapes){
            switch (figure) {
                case 1:
                    if(shape instanceof Circle)result +=shape.calcArea();
                    break;
                case 2:
                    if(shape instanceof Rectangle)result +=shape.calcArea();
                    break;
                case 3:
                    if(shape instanceof Triangle)result +=shape.calcArea();
                    break;

            }
        }

        return result;

    }
}
