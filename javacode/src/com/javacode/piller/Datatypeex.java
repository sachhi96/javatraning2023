package com.javacode.piller;

public class Datatypeex {
	public static void main(String args[]) {//data type with passing the value

		char a = 'G';
		int i = 89;
		byte b = 4;

		// this will give error as number is
		// larger than byte range
		// byte b1 = 7888888955;

		short s = 56;

		// this will give error as number is
		// larger than short range
		// short s1 = 87878787878;
		double d = 4.355453532;
		float f = 4.7333434f;
		long l = 12121;

		System.out.println("char: " + a);
		System.out.println("integer: " + i);
		System.out.println("byte: " + b);
		System.out.println("short: " + s);
		System.out.println("float: " + f);
		System.out.println("double: " + d);
		System.out.println("long: " + l);
	}
}
