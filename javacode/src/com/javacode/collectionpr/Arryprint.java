package com.javacode.collectionpr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Arryprint {
	public static void main(String[] args) {
		ArrayList<Integer> p = new ArrayList<Integer>();
		p.add(25);
		p.add(21);
		p.add(84);

		Collections.sort(p);
		for (int i : p)
			;
		{
			System.out.println(p);
		}
	}
}
