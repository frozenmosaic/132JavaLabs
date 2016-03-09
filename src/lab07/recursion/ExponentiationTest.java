package lab07.recursion;

import static org.junit.Assert.*;
import org.junit.Test;

public class ExponentiationTest {
	
	private Exponentiation expo = new Exponentiation();
	
	@Test
	public void testExp() {
		assertEquals(2, expo.exp(2, 1));
		assertEquals(4, expo.exp(2, 2));
		assertEquals(8, expo.exp(2, 3));
		assertEquals(1024, expo.exp(2, 10));
	}

}
