package griffith;

public class Conversions implements ConversionsInterface{

	@Override
	public double celsiusToFahrenheit(double celsius) {
		return (celsius*1.8)+32;
	}

	@Override
	public double fahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit-32)/1.8;
	}

	@Override
	public double milesToKilometer(double miles) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double kilometerToMiles(double kilometer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String upperCaseToLowerCase(String uStr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String lowerCaseToUpperCase(String lStr) {
		// TODO Auto-generated method stub
		return null;
	}

}
