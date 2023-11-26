package javaBeginnerCourse;

import bank.Bank;
class Shape{
	public void area() {
		System.out.println("display area");
	}
}
class Triangle extends Shape {
	public void area(int b,int h){
		System.out.println((0.5)*b*h);
	}
}

class Circle extends Shape {
	public void area(int r){
		System.out.println((3.14)*r*r);
	}
}


public class Inheritance {
	public static void main(String[] args){
		Triangle t1 = new Triangle();
		Circle c1 = new Circle();
		c1.area();
		c1.area(20);
		t1.area();
		t1.area(24, 10); //120
	
		bank.Bank account1 = new Bank();
		account1.name = "customer1";
		account1.acno = 123456789;
		account1.printinfo();
		
	}
}
