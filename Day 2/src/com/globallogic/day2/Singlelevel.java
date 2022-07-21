//Single level inheritance
package com.globallogic.day2;

class Employee{
	void salary() {
		System.out.println("salary=40000");
	}
	
}
	
	class Engineer extends Employee{
		void PFDeduction() {
			System.out.println("pfdecuction=2000");
		}
	}


public class Singlelevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engineer a = new Engineer();
		a.salary();
		a.PFDeduction();

	}

}
