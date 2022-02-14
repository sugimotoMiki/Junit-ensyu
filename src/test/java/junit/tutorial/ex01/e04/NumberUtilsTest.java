package junit.tutorial.ex01.e04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumberUtilsTest {

	NumberUtils numberUtils = new NumberUtils();
	
	@Test
	void test1() {
		assertEquals(true, numberUtils.isEven(10));
	}

	@Test
	void test2() {
		assertEquals(false, numberUtils.isEven(7));
	}
}
