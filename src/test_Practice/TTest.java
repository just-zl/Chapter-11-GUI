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
		return "�ӿ�A";
	}
}

interface B {
	public static String f() {
		return "�ӿ�B";
	}
}

class C implements A {
	
	public static String f() {
		System.out.println("�ӿ�AA");
		return null; 
	}
	
	static class D implements B {
		
		public static String f() {
			System.out.println("�ӿ�BB");
			return null; 
		}
	}
}