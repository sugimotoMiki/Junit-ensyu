package junit.tutorial.ex02.e01;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	FizzBuzz fizzBuzz = new FizzBuzz();
	
	@Test
	@DisplayName("16までのリスト比較")
	void test() {
		List<String> list = new ArrayList<>();
		list = fizzBuzz.createFizzBuzzList(16);
		List<String> testList = new ArrayList<>();
		testList.add("1");
		testList.add("2");
		testList.add("Fizz");
		testList.add("4");
		testList.add("Buzz");
		testList.add("Fizz");
		testList.add("7");
		testList.add("8");
		testList.add("Fizz");
		testList.add("Buzz");
		testList.add("11");
		testList.add("Fizz");
		testList.add("13");
		testList.add("14");
		testList.add("FizzBuzz");
		testList.add("16");
		assertIterableEquals(testList, list);
	}

}
