package customer;

import chapter02.Customer;

public class VipCustomer extends Customer {  //chapter02패키지-Customer 클래스의 자식 클래스 
	public void showInfo() {
		System.out.println(name);    // protected 같은 패키지에서 뿐만 아니라 자식 클래스에서도 접근이 가능하다.
		System.out.println(getAge()); 
	}

}
