//Write a program to vote system if age is > 18 allow to cast a vote//Write a program to vote system if age is > 18 allow to cast a vote

package com.globalogic;

import java.util.Scanner;

public class vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter your age");
		age = sc.nextInt();
		if(age>=18) {
			System.out.print("eligible");
		}
		else
		{
			System.out.println("not eligible");
		}

	}

}
