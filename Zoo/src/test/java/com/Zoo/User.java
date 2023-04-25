package com.Zoo;

public class User {

	public static void main(String[] args) {
		Admin admin = new Admin();
		admin.read();
		admin.write();
		admin.manage();
		System.out.println();
	}

}
