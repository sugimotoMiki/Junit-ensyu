package junit.tutorial.ex02.e02;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	@DisplayName("テキストファイルから読み込んだ従業員情報の表示")
	void test() {
		try {
			Employee employee = new Employee();
			List<Employee> list = new ArrayList<>();
			InputStream input = new FileInputStream("C:\\env\\springworkspace\\Junit-ensyu\\src\\main\\java\\junit\\tutorial\\ex02\\e02\\Employee.txt");
			list = employee.load(input);
			Employee employee1 = list.get(0);
			assertEquals("Ichiro", employee1.getFirstName(), "名前表示");
			assertEquals("Tanaka", employee1.getLastName(), "名字表示");
			assertEquals("ichiro@example.com", employee1.getEmail(), "メールアドレス表示");	
		} catch (Exception e) {
			throw new RuntimeException(e);
			// TODO: handle exception
		}
		
	}

}
