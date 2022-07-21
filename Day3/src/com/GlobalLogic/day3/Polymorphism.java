package com.GlobalLogic.day3;
//Runtime polymorphism

class Bike{
		void run() {
			System.out.println("speeding up the bike");
		}
	}

	
	class Pulser extends Bike{
		void run() {
			System.out.println("speeding up to 90 kmh");
		}
	}
public class Polymorphism {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Bike b = new Pulser();
 b.run();

	}

}
