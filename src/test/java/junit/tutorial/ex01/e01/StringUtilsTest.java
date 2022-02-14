package junit.tutorial.ex01.e01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
class StringUtilsTest {

	
	@Test
	void snake1() {
		StringUtils stringUtils = new StringUtils();
		assertEquals("aaa", stringUtils.toSnakeCase("aaa"), "aaaと入力"); 
	}
	
	@Test
	void snake2() {
		StringUtils stringUtils = new StringUtils();
		assertEquals("hello_world", stringUtils.toSnakeCase("HelloWorld"));
	}
	
	@Test
	void snake3() {
		StringUtils stringUtils = new StringUtils();
		assertEquals("practice_junit", stringUtils.toSnakeCase("practiceJunit"));
	}
	
}