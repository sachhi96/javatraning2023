package com.javacode.collection;

import java.util.LinkedList;

public class Linklistex {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();

		// Adding elements to the linked list
		ll.add("A"); // a
		ll.add("B"); // A,B
		ll.addLast("C"); // A,B,C(data manipulating)
		ll.addFirst("D"); // DABC
		ll.add(2, "E"); // DAEBC

		System.out.println(ll);

		ll.remove("B"); // DAEC
		ll.remove(3); // DAE
		ll.removeFirst();// AE
		ll.removeLast(); // E

		System.out.println(ll);
	}
}
