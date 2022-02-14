package junit.tutorial.ex02.e04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class RangeTest {

	@ParameterizedTest
	@ValueSource(doubles = {0.0, 10.5})
	void test1(double num1) {
		Range range = new Range(0.0, 10.5);
		assertTrue(range.contains(num1));
	}
	
	@ParameterizedTest
	@ValueSource(doubles = {-0.1, 10.6})
	void test2(double num2) {
		Range range = new Range(0.0, 10.5);
		assertFalse(range.contains(num2));
	}
	
	@ParameterizedTest
	@ValueSource(doubles = {-5.1, 5.1})
	void test3(double num3) {
		Range range = new Range(-5.1, 5.1);
		assertTrue(range.contains(num3)); 
	}
	
	@ParameterizedTest
	@ValueSource(doubles = {-5.2, 5.2})
	void test4(double num4) {
		Range range = new Range(-5.1, 5.1);
		assertFalse(range.contains(num4)); 
	}

}
