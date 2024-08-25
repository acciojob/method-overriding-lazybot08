package com.driver;

class A {
	String meth() {
		return "Invoking method from class A";
	}
}

class B extends A {

	@Override
	String meth() {
		// TODO Auto-generated method stub
		return "Method is overridden in Extended class B";
	}
	
}

public class Main {
	public static void main(String[] args) {
//		B obj1 = new B();
//		System.out.println(obj1.meth());
//		Invoking method from class A
		
		B obj2 = new B();
		System.out.println(obj2.meth());
//		Method is overridden in Extended class B
	}
}
