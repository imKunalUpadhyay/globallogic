//write a program to give the color code and print the color name  
package com.globalogic;

import java.util.Scanner;

public class colour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the colour code:");
		char choose = sc.next().charAt(0);
		
		switch (choose){
		case 'R':
			System.out.println("Red");
			break;
			
		case 'B':
			System.out.println("Blue");
			break;
			
			default:
				System.out.println("incorrect value ");
			
			
			
		
			
		}
		

	}

}
