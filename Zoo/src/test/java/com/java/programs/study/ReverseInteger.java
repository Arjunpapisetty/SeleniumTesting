/**
 * 
 */
package com.java.programs.study;

/**
 * @author SeetuRama
 *
 */
public class ReverseInteger {

	/**
	 * Reverse Integer
	 */
	public static void main(String[] args) {

		int num = 12345;
		int rev=0;
		while (num!=0) {
			rev = rev*10+num%10;//5
			num=num/10;//1234
		}
		System.out.println(rev);
		
		
		long num1=47539;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
	}

}
