//Java program to calculate a Factorial of a number
package com.globalogic;
import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,fact=1,number;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		number =sc.nextInt();
		
		for(i=1;i<=number;i++) {
			fact=fact*i;
		}
		System.out.println("factorial of "+number +" is "+fact);

	}

}
