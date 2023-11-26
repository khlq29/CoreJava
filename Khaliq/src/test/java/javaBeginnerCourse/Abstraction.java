package javaBeginnerCourse;

abstract class Animal{
	abstract void walk();
	Animal(){
		System.out.println("you are  creating a new animal");
	}
	public void eats() {
		System.out.println("animal eats");
		
	}
}

class Horse extends Animal{
	Horse(){
		System.out.println("created a horse");
	}
	public void walk() {
		System.out.println("Walks on four legs");
	}
}
class Chicken extends Animal{
	public void walk() {
		System.out.println("Walks on two legs");
	}
}

public class Abstraction {
	public static void main(String[] args) {
		Horse horse = new Horse();
		
		
		//Animal animal = new Animal();
		//animal.walk();
		//since animal is abstracted it will show 
		//runtime error since the error shown after
		//running the code
		
	}

}
