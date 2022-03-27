package com.javaprojectpackage;

interface myfloat{
	int i=9;    //public static final int i=9;
	void m1();   //abstract public void m1();
}
class Myclass implements myfloat{

	@Override
	public void m1() {
		System.out.println("m1 method of interface");
		
	}
}

public class InterfaceProgram {

	public static void main(String[] args) {
	
		Myclass ob=new Myclass();
        ob.m1();

	}

}
