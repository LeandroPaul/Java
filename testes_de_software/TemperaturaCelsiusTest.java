package testes_de_software;

import static org.junit.Assert.*;

import org.junit.Test;

public class TemperaturaCelsiusTest {

    @Test
    public void testConverteCelsiusParaFahrenheit() {
        TemperaturaCelsius t = new TemperaturaCelsius(50);
        assertEquals(122, t.converteCelsiusParaFahrenheit());

        TemperaturaCelsius t2 = new TemperaturaCelsius(40);
        assertEquals(104, t2.converteCelsiusParaFahrenheit());
    }
}