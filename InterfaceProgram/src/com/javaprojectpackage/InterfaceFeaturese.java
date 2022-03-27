package com.javaprojectpackage;

//java 8 allows you create a method with the body
//we can have default and static method

interface MyInt{
	void m1();
	default void m2() {
		System.out.println("m2 method implementation");
	}
	static void m3() {
		System.out.println("m3 static method");
	}
}
class MyClasss implements MyInt{
	public void m1() {
		System.out.println("m1 interface abstract method");
	}
		
	
}

public class InterfaceFeaturese  {

	public static void main(String[] args) {
		
		MyClasss ob=new MyClasss();
		ob.m1();
		ob.m2();
		MyInt.m3();

		
		

	}

}
