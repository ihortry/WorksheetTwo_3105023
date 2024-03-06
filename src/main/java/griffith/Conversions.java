/**
 * @author Ihor Tryndey 3105023
 * @version 1.0
 * @since 2024
 */
package griffith;

/**
 * @author Ihor Tryndey
 * @version 1.0
 * Class Conversions that implements conversion of celsius, fahrenheit, miles, kilometre, upper case and lowercase
 */
public class Conversions implements ConversionsInterface{

	/**
	 * Method that implements conversion from celsius to fahrenheit conversion
	 * @param double clesius
	 * @return double
	 */
	@Override
	public double celsiusToFahrenheit(double celsius) {
		return (celsius*1.8)+32;
	}

	/**
	 * Method that implements conversion from fahrenheit to celsius conversion
	 * @param double fahrenheit
	 * @return double
	 */ 
	@Override
	public double fahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit-32)/1.8;
	}

	/**
	 * Method that implements conversion from miles to kilometres conversion
	 * @param double miles
	 * @return double
	 */ 
	@Override
	public double milesToKilometer(double miles) {
		return miles*1.609;
	}

	/**
	 * Method that implements conversion from kilometres to miles conversion
	 * @param double kilometer
	 * @return double
	 */ 
	@Override
	public double kilometerToMiles(double kilometer) {
		return kilometer/1.609;
	}

	/**
	 * Method that implements conversion from upper case to lower case conversion
	 * @param double uStr
	 * @return String
	 */ 
	@Override
	public String upperCaseToLowerCase(String uStr) {
		return uStr.toLowerCase();
	}

	/**
	 * Method that implements conversion from lower case to upper case conversion
	 * @param double uStr
	 * @return String
	 */ 
	@Override
	public String lowerCaseToUpperCase(String lStr) {
		return lStr.toUpperCase();
	}

}
