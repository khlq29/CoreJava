package javaBeginnerCourse;

import java.util.Stack;

public class LearnStack {
	public static void main(String[] args) {
		Stack<String> animals = new Stack<>();
		
		//to store value in stack
		animals.push("lion");
		animals.push("dog");
		animals.push("horse");
		animals.push("cat");
		
		System.out.println("Stack: "+ animals);
		
		//to show which element is at top
		System.out.println(animals.peek());
		
		//to remove the element from the top
		animals.pop();
		System.out.println(animals.peek());
		System.out.println("Stack: "+ animals);
	}
		

}
