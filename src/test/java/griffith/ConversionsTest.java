/**
 * @author Ihor Tryndey 3105023
 * @version 1.0
 * @since 2024
 */
package griffith;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Ihor Tryndey
 * @version 1.0
 * Class Conversions that implements testing
 */
public class ConversionsTest {
	/*
	 * Creation of an instance of Conversions class for test
	 */
	Conversions obj = new Conversions();
	
	/**
	 * The celsiusToFahrenheitTest method which test three values 
	 * that perform conversion from celsius to fahrenheit.
	 */
	@Test
	public void celsiusToFahrenheitTest() {
		//set float point parameter
		double alpha = 0.01;
		assertEquals(32, obj.celsiusToFahrenheit(0), alpha);
		assertEquals(212, obj.celsiusToFahrenheit(100), alpha);
		assertEquals(-25.6, obj.celsiusToFahrenheit(-32), alpha);
	}

	/**
	 * The fahrenheitToCelsiusTest method which test three values 
	 * that perform conversion from fahrenheit to celsius.
	 */
	@Test
	public void fahrenheitToCelsiusTest() {
		//set float point parameter
		double alpha = 0.01;
		assertEquals(-67.22, obj.fahrenheitToCelsius(-88.996), alpha);
		assertEquals(0, obj.fahrenheitToCelsius(32), alpha);
		assertEquals(100, obj.fahrenheitToCelsius(212), alpha);
	}
	
	/**
	 * The milesToKilometerTest method which test three values 
	 * that perform conversion from miles to kilometres.
	 */
	@Test
	public void milesToKilometerTest() {
		//set float point parameter
		double alpha = 0.001;
		assertEquals(1.609, obj.milesToKilometer(1), alpha);
		assertEquals(53.097, obj.milesToKilometer(33), alpha);
		assertEquals(90, obj.milesToKilometer(55.9353), alpha);
	}
	
	/**
	 * The kilometerToMilesTest method which test three values 
	 * that perform conversion from kilometres to miles.
	 */
	@Test
	public void kilometerToMilesTest() {
		//set float point parameter
		double alpha = 0.001;
		assertEquals(1, obj.kilometerToMiles(1.609), alpha);
		assertEquals(33, obj.kilometerToMiles(53.097), alpha);
		assertEquals(55.9353, obj.kilometerToMiles(90), alpha);
	}
	
	/**
	 * The upperCaseToLowerCaseTest method which test three values 
	 * that perform conversion from upper case to lower case.
	 */
	@Test
	public void upperCaseToLowerCaseTest() {
		assertEquals("ihor", obj.upperCaseToLowerCase("IHOR"));
		assertEquals("tryndey", obj.upperCaseToLowerCase("trYNdEy") );
		assertEquals("artem", obj.upperCaseToLowerCase("Artem"));
	}
	
	/**
	 * The lowerCaseToUpperCaseTest method which test three values 
	 * that perform conversion from lower case to upper case.
	 */
	@Test 
	public void lowerCaseToUpperCaseTest() {
		assertEquals("IHOR", obj.lowerCaseToUpperCase("ihor"));
		assertEquals("TRYNDEY",obj.lowerCaseToUpperCase("tRyndey"));
		assertEquals("ARTEM", obj.lowerCaseToUpperCase("ARTEM"));
	}
}
