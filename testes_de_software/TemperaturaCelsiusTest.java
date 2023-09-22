package testes_de_software;

import org.junit.*;
//import org.junit.Test;
import org.junit.Assert;


public class TemperaturaCelsiusTest {

      @Test
    public void testConvert() {
      
        TemperaturaCelsius t = new TemperaturaCelsius(50.0);
        Assert.assertTrue(t.ConverteCelsiusParaFahrenheit()==122);

        TemperaturaCelsius t2 = new TemperaturaCelsius(40);
        Assert.assertTrue(t2.ConverteCelsiusParaFahrenheit()==104);
    }
}
