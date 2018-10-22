import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import task4_1.TemperatureConverter;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TemperatureConverterTest extends TestCase{
TemperatureConverter converter=new TemperatureConverter();

    @Parameterized.Parameter
    public double input;
    @Parameterized.Parameter(1)
    public  double cToFExpected;
    @Parameterized.Parameter(2)
    public  double fToCExpected;
    @Parameterized.Parameter(3)
    public  double cToKExpected;
    @Parameterized.Parameter(4)
    public  double fToKExpected;

    @Test
    public void testConvertFtoC(){
        assertEquals(converter.convertFtoC(input),fToCExpected,0.01);
    }

    @Test
    public void testConvertCtoF(){
        assertEquals(converter.convertCtoF(input),cToFExpected,0.01);
    }

    @Test
    public void testConvertCtoK(){
        assertEquals(converter.convertCtoK(input),cToKExpected,0.01);
    }

    @Test
    public void testConvertKtoC(){
        assertEquals(converter.convertKtoC(cToKExpected),input,0.01);
    }

    @Test
    public void testConvertFtoK(){
        assertEquals(converter.convertFtoK(input),fToKExpected,0.01);
    }
    @Test
    public void testConvertKtoF(){
        assertEquals(converter.convertKtoF(fToKExpected),input,0.02);
    }


    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 0.5, 32.9,-17.5,273.7,255.66}, { 36.6, 97.88,2.55,309.8,275.72 }, { -5, 23,-20.55,268.2,252.61 }
        });
    }

}
