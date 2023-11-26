package javaBeginnerCourse;
interface Animal1 {
	final int eyes = 2;
	void walk();
}
interface Herbivores{
	final String food = "plants";
}

class Horse1 implements Animal1, Herbivores{ //multiple inheritance
	public void walk() {
		System.out.println("walks on 4 legs");
	}
}
public class Interfaces {
	public static void main(String[] args) {
		Horse1 horse = new Horse1();
		horse.walk();
		System.out.println(horse.eyes);
		System.out.println(horse.food);
	}
	

}
