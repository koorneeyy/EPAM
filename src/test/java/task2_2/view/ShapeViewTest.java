package task2_2.view;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.junit.Assert.assertEquals;


public class ShapeViewTest {
    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
    @Test
    public void printMessage() throws Exception {
        String message="Console test";
        ShapeView view=new ShapeView();
        view.printMessage(message);
        assertEquals(message, systemOutRule.getLog().trim());
    }

}