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
		return miles*1.609;
	}

	@Override
	public double kilometerToMiles(double kilometer) {
		return kilometer/1.609;
	}

	@Override
	public String upperCaseToLowerCase(String uStr) {
		return uStr.toLowerCase();
	}

	@Override
	public String lowerCaseToUpperCase(String lStr) {
		// TODO Auto-generated method stub
		return null;
	}

}
