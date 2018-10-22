package task2_2.view;

import task2_2.model.entity.Shape;

public class ShapeView {
    public static final String MAIN_MENU=" 1. Draw all shapes" +
            "\n 2. Sum area" +
            "\n 3. Sum area by types" +
            "\n 4. Order by area" +
            "\n 5. Order by color " +
            "\n 6. Exit ";

    public static final String SUB_MENU=" 1. Area of circles" +
            "\n 2. Area of rectangres" +
            "\n 3. Area of triangles";



    public static final String ALL_SHAPES="All shapes :";
    public static final String INPUT_INT_DATA="Choise operation :";
    public static final String WRONG_INPUT_INT_DATA ="Incorrect input:";
    public static final String SUM_AREA_FIGURE ="Sum area for Specified shape type is:  ";
    public static final String SUM_AREA ="Sum area for all shapes is:  ";

    public void printShapes(String message, Shape[] shapes){
        System.out.println(message);
        for (Shape shape:shapes){
            shape.draw();
        }
    }

    public void printMessage(String s) {
        System.out.println(s);
    }
}
