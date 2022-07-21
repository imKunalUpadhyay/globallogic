//Final Keyword with method
package com.globallogic.day2;

class bike{
	final void run() {
		System.out.println("full speed");
	}
}

class superbike extends bike{
	void run() {
		System.out.println("speed is low");
	}
}

public class Finalkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		superbike s = new superbike();
		s.run();

	}

}
