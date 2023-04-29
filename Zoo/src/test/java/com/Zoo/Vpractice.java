package com.Zoo;

import java.util.Vector;

public class Vpractice {

	public static void main(String[] args) {

		Vector v = new Vector();
		v.add("rama");
		v.add("krishna"); //add elements into the list
		
		Vector v1 = new Vector();
		v1.add("New");
		v1.set(0, "Andhra");
		System.out.println(v1);
		
		/*
		 * System.out.println(v1.get(0)); // retreive the element from the list
		 * v1.add(0, v);//moving vector v elements into v1 System.out.println(v1);
		 * System.out.println(v.containsAll(v1));//Verifying elements.
		 * System.out.println(v1.capacity()); System.out.println(v1.size());
		 */
	}

}
