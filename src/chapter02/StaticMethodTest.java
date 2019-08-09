package chapter02;

public class StaticMethodTest {
	
	private int n;
	private static int m;
	
	public void f1() {
		n = 10;
		m=20;
		// 원칙적으로 클래스이름(namespace)로 접근해야 한다.
		// 하지만, 같은 클래스인경우 생략가능
		// StaticMethodTest.m = 20; 이라고 쓰는게 맞다. 하지만 생략가능
	}
	 
	public static void f2() {
		// n =10;     에러 : static은 static만 접근가능
		m = 20;
	}
	
	public void f3() {
		f1();
		f2(); //StaticMethodTest.f2()
		
	}
	
	public static void f4() {
		// f1();   에러  : static은 static만 접근가능
		f2();
	}
	
	public static void main(String args[]) {
		f2();
		f4();
	}
}

