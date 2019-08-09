package chapter02;

public class Customer {
	
	protected String name;
	private int age;
	
	public int getAge() {
		return age;
	}
	 
	public void setAge(int age) {
		if (age < 0) {
			age = 0;
		}
		this.age = age;
	}
}
