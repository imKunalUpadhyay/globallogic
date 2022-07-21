//hierarchical inheritance
package com.globallogic.day2;

class Animal{  
void eat(){System.out.println("eating");}  
}  

class Dog extends Animal{  
void bark()
{System.out.println("barking");}  
}  

class lion extends Animal{  
void roar()
{System.out.println("roar");}  
} 

public class hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lion k = new lion();
		k.eat();
		k.roar();

	}

}
