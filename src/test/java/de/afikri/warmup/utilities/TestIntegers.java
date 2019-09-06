package de.afikri.warmup.utilities;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestIntegers {
	
	static Integers integers;
	@BeforeClass
	public static void setup() {
		integers = new Integers();
		
	}
	
	@Test
	public void isArrDistinctTest(){
		int input = 987654321;
		int output = 123456789;
		assertTrue(output == integers.reverseIneger(input));
	}

}
