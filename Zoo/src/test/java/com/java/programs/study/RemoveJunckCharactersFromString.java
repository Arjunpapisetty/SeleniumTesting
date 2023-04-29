package com.java.programs.study;

public class RemoveJunckCharactersFromString {

	public static void main(String[] args) {
		/*
		 * By using regular expression we can remove Junk letters
		 */
		String s = "*!&@*(!*^)Tester)*)*(&*^*^Machine(*(*(";
System.out.println(s.replaceAll("[^a-zA-Z0-9]", ""));


	}

}
