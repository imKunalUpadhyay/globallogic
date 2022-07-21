package com.globallogic.day7;

public class Checkalphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "umbrella";
		boolean x=false;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)=='e') {
				x=true;
				break;
			}
		}
		System.out.println(x);

	}

}
