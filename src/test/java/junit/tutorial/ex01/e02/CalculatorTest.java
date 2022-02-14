package junit.tutorial.ex01.e02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void test() {
		
		Calculator calculator = new Calculator();
		try {
			calculator.divide(1, 0);
			fail("例外が発生しませんでした");
		} catch (Exception e) {
			System.out.println("例外が発生しました");
			// TODO: handle exception
		}
				
	}

}
