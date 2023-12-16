package com.javacode.basic;

public class veriable {
	int a = 10;// global variable(In side the class)

	public void hello(int b)//Argument,parameter
	{
		System.out.println(a + b);//local variable(with in the method)

	}
	public static void main(String[] args) {
		
		veriable v=new veriable();
		v.hello(20);
	}
}
