package task2_2.data;

import org.junit.Test;
import task2_2.model.entity.Shape;
import static org.junit.Assert.*;

public class DataSourceTest {
    @Test
    public void getShapes() throws Exception {
        Shape[]  shapes = DataSource.getShapes();
        for(Shape shape:shapes){
            assertTrue(shape  instanceof Shape) ;
        }
    }

}