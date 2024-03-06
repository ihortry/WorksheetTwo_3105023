package griffith;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConversionsTest {
	Conversions obj = new Conversions();
	@Test
	public void celsiusTofahrenheitTest() {
		double alpha = 0.01;
		assertEquals(32, obj.celsiusToFahrenheit(0), alpha);
		assertEquals(212, obj.celsiusToFahrenheit(100), alpha);
		assertEquals(-25.6, obj.celsiusToFahrenheit(-32), alpha);
	}

}
