package com.globallogic.day2;

class student{
	int rollno;
	String name;
	static String college = "CGC";
}

student(int r, String n){	
	rollno = r;
	name = n;
}

void display() {
	System.out.println(rollno + " " + name + " " + college );
}

public class Statickeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1 = new student(12,"kunal");

	}

}
