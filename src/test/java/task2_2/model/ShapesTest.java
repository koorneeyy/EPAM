package task2_2.model;

import org.junit.Before;
import org.junit.Test;
import task2_2.data.DataSource;
import task2_2.model.entity.Circle;
import task2_2.model.entity.Rectangle;
import task2_2.model.entity.Shape;
import task2_2.model.entity.Triangle;

import static org.junit.Assert.*;

public class ShapesTest {
    private Shapes model;
    Shape[] shapesByArea;
    Shape[] shapesByColor;

    @Before
    public void init() {
        model = new Shapes();
        model.setShapes(DataSource.getShapes());
        shapesByArea = new Shape[]{
                new Rectangle(1.1, 2.2, "magenta"),
                new Triangle(5.5, 4.2, "blue"),
                new Triangle(7.5, 12.7, "green"),
                new Circle(4.4, "orange"),
                new Circle(5.5, "red"),
                new Rectangle(10.1, 22.2, "green"),
                new Triangle(68.5, 15.2, "black"),
                new Triangle(57.5, 41.2, "gray"),
                new Rectangle(23.1, 87.2, "red"),
                new Rectangle(45.1, 72.2, "cyan"),
                new Circle(39.5, "brown"),
                new Circle(82.5, "blue"),
        };

        shapesByColor = new Shape[]{
                new Triangle(68.5, 15.2, "black"),
                new Circle(82.5, "blue"),
                new Triangle(5.5, 4.2, "blue"),
                new Circle(39.5, "brown"),
                new Rectangle(45.1, 72.2, "cyan"),
                new Triangle(57.5, 41.2, "gray"),
                new Rectangle(10.1, 22.2, "green"),
                new Triangle(7.5, 12.7, "green"),
                new Rectangle(1.1, 2.2, "magenta"),
                new Circle(4.4, "orange"),
                new Circle(5.5, "red"),
                new Rectangle(23.1, 87.2, "red"),
        };
    }

    @Test
    public void sumArea() throws Exception {
        assertEquals(33701.444, model.sumArea(), 0.01);
    }

    @Test
    public void orderByArea() throws Exception {
        model.orderByArea();
        assertArrayEquals(shapesByArea, model.getShapes());
    }

    @Test
    public void orderByColor() throws Exception {
        model.orderByColor();
        assertArrayEquals(shapesByColor, model.getShapes());
    }

    @Test
    public void sumAreaByFigure() throws Exception {
        assertEquals(26439.98, model.sumAreaByFigure(1), 0.01);
        assertEquals(5497.18, model.sumAreaByFigure(2), 0.01);
        assertEquals(1764.275, model.sumAreaByFigure(3), 0.01);
        assertEquals(0.0, model.sumAreaByFigure(4), 0.01);
    }

}