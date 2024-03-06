package griffith;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConversionsTest {
	Conversions obj = new Conversions();
	@Test
	public void celsiusToFahrenheitTest() {
		double alpha = 0.01;
		assertEquals(32, obj.celsiusToFahrenheit(0), alpha);
		assertEquals(212, obj.celsiusToFahrenheit(100), alpha);
		assertEquals(-25.6, obj.celsiusToFahrenheit(-32), alpha);
	}

	@Test
	public void fahrenheitToCelsiusTest() {
		double alpha = 0.01;
		assertEquals(-67.22, obj.fahrenheitToCelsius(-88.996), alpha);
		assertEquals(0, obj.fahrenheitToCelsius(32), alpha);
		assertEquals(100, obj.fahrenheitToCelsius(212), alpha);
	}
	
	@Test
	public void milesToKilometerTest() {
		double alpha = 0.001;
		assertEquals(1.609, obj.milesToKilometer(1), alpha);
		assertEquals(53.108, obj.milesToKilometer(33), alpha);
		assertEquals(90, obj.milesToKilometer(55.9234), alpha);
	}
}
