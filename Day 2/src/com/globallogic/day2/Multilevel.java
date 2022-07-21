//multilevel inheritance
package com.globallogic.day2;

class wood {
	void paper() {
		System.out.println("paper made out of wood");
	}
}

class timberwood extends wood{
	void pencil() {
		System.out.println("pencil also made out of wood");
	}
}

class softtimberwood extends timberwood{
	void woodenchair() {
		System.out.println("chairs are made of out wood");
	}
}
public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		softtimberwood p = new softtimberwood();
		p.paper();
		p.pencil();
		p.woodenchair();

	}

}
