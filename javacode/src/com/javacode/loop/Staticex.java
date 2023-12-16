package com.javacode.loop;

public class Staticex {
	public static void withstatic() {
		System.out.println("withstatic");
	}

	public void withoutstatic() {
		System.out.println("without");
	}

	public static void main(String[] args) {
		withstatic();// with static keyword
		Staticex s = new Staticex();// withoutstastic with object refrence
		s.withoutstatic();
	}
}
