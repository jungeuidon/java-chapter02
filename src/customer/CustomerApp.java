package customer;

import chapter02.Customer;

public class CustomerApp {

	public static void main(String[] args) {
		Customer c = new Customer();  // Ctrl + Shift + O 하면 자동으로 import 가 된다.
		
		// c.name = "둘리";  // chapter02패키지-Customer 클래스에 있는 protected는 다른 패키지에서 접근이 안된다.
		
		// c.age = 10; // chapter02패키지-Customer 클래스에 있는 private은 외부에서 접근 불가능
		c.setAge(10);
		System.out.println(c.getAge());
	}

}
