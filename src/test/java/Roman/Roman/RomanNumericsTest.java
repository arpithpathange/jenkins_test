package Roman.Roman;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RomanNumericsTest {
	RomanNumerics rom;
	
	@Before
	public void setUp() throws Exception {
		 rom = new RomanNumerics();
	}

	@Test
	public void testRomanSingleDigit() {
		 int output = rom.convert("VIII");
		 assertEquals(8,output);
	}

	@Test
	public void TestRomanDoubleDigit() {
		int output = rom.convert("CLVIII");
		assertEquals(158,output);
	}

	@Test
	public void testRomanTribbleDigit() {
		int output = rom.convert("LVIII");
		assertEquals(58,output);
	}

	@Test
	public void testRomanToTestMinusDigit() {
		int output = rom.convert("LXXXIX");
		assertEquals(89,output);
	}

	@Test
	public void testRomanToTesRandom() {
		//int output = rom.convert("DCCCLXXXVIII");
		int output = rom.convert("DCCCLXXXVIII");
		assertEquals(888,output);
	}
	


}
