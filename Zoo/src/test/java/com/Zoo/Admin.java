package com.Zoo;

public class Admin extends Developer{
public void manage() {
	super.read();
	write();
	System.out.println("I have manage access");
}
public void read() {
	
}
}
