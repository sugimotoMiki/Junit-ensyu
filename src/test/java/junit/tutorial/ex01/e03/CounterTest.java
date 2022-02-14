package junit.tutorial.ex01.e03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CounterTest {

	Counter counter = new Counter();
	@Test
	void test1() {
		assertEquals(1, counter.increment(), "1回実行"); 		
	}
	
	@Test
	void test2() {
		counter.increment();
		assertEquals(2, counter.increment(), "2回実行");
		System.out.println(counter.increment());
	}
	
	@Test
	void test3() {
		for (int i = 1; i <= 50 ; i++) {
			counter.increment();
		}
		assertEquals(51, counter.increment(), "51回実行");
	}

}
