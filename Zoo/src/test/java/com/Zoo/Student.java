package com.Zoo;

public class Student {

	private int rollNumber;
	private String name;
	private boolean isAttended;
	private String branch;
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		System.out.println("Get the name of the student");
		return name;
	}
	public void setName(String name) {
		System.out.println("Accessed name of the Student");
		this.name = name;
	}
	public boolean isAttended() {
		
		return isAttended;
	}
	public void setAttended(boolean flag) {
		System.out.println("Attendence of the student");
		this.isAttended = isAttended;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
		System.out.println("B.Com student");
		
	}
	
	
}
