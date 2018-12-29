package test_Practice;

import test_Practice.C.D;

public class TTest {

	public static void main(String[] args) {
		
		C c = new C();
		c.f();
		
		D d = new D();
		d.f();
	}

}

interface A {
	public static String f() {
		return "接口A";
	}
}

interface B {
	public static String f() {
		return "接口B";
	}
}

class C implements A {
	
	public static String f() {
		System.out.println("接口AA");
		return null; 
	}
	
	static class D implements B {
		
		public static String f() {
			System.out.println("接口BB");
			return null; 
		}
	}
}