/**
 * 
 */
package com.java.programs.study;

import java.util.Iterator;

/**
 * @author SeetuRama
 *
 */
public class ReverseAString {

	/**
	 * Reverse a string without using existing functions
	 */
	public static void main(String[] args) {
		String s = "Programmer"; // 10 characters

		int len = s.length(); // length of the string is stored in variable "len"
		String rev = ""; // to store the reversed string in variable rev.
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);

		StringBuffer sf = new StringBuffer(s);
		System.out.println(sf.reverse());
	}

}
