package junit.tutorial.ex01.e05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ItemStockTest {

	ItemStock itemStock = new ItemStock();
		
	@Test
	@DisplayName("初めのアイテム")
	void test1() {
		Item item = new Item("book", 400);
		assertEquals(0, itemStock.getNum(item), "初めてのアイテムの場合");
	}
	
	@Test
	@DisplayName("一つ目のアイテム")
	void test2() {
		Item item = new Item("book", 400);
		itemStock.add(item);
		assertEquals(1, itemStock.getNum(item),  "一つ目のアイテムの場合");
	}
	
	@Test
	@DisplayName("一つ目から取得")
	void test3() {
			Item item = new Item("book", 400);
			itemStock.add(item);
			assertEquals(1, itemStock.getNum(item),  "一つ目のアイテムの場合");
		
	}
	
	@Test
	@DisplayName("2個のアイテム")
	void test4() {
		Item item1 = new Item("book", 400);
		Item item2 = new Item("book", 200);
		itemStock.add(item1);
		itemStock.add(item2);
		assertEquals(2, itemStock.getNum(item2), "2個同じアイテムの場合");
	}
	
	@Test
	@DisplayName("異なるアイテム追加")
	void test5() {
		Item item1 = new Item("book", 400);
		Item item2 = new Item("cd", 2000);
		itemStock.add(item1);
		itemStock.add(item2);
		assertEquals(1, itemStock.getNum(item2), "異なるアイテムを追加した場合");
	}
	
	

}
