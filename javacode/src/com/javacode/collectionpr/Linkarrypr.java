package com.javacode.collectionpr;

import java.util.LinkedList;

public class Linkarrypr {
	public static void main(String[] args) {
		LinkedList<String> r = new LinkedList<String>();
		r.add("Ironman");
		r.add("thor");
		r.add("Doctorstrange");
		r.addLast("Aquaman");
		r.addFirst("Superman");
		System.out.println(r);

		r.removeFirst();//t,d,a,s
		r.removeLast();//t,d,a
		r.remove(2);//
		System.out.println(r);
	}
}
