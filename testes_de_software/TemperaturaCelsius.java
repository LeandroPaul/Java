package testes_de_software;

public class TemperaturaCelsius {

	    private double celsius;
	    private double fahrenheit;

	    public  TemperaturaCelsius(double celsius){
	        this.celsius = celsius;
	    }

	    public double ConverteCelsiusParaFahrenheit(){
	        fahrenheit = (1.8*celsius)+32;
	        return fahrenheit;
	    }
	}