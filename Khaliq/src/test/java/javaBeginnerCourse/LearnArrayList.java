package javaBeginnerCourse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {
	public static void main(String[] args) {
		//ArrayList<String> studentsName = new ArrayList<>();
		//default size of arraylist is 10
		//for increase in size = n + n/2 + 1
		//studentsName.add("rakesh");
		//unlike arrays arrayList automatically
		//increases its size based on the 
		//the data required. for Array if define it with 
		//any size, it won't take any things above that
		//size.
		/*List<Integer> list = new ArrayList<>();
		list.add(1);//use to add value to the list
		list.add(2);
		list.add(3);
		System.out.println(list);
		
		list.add(4);
		System.out.println(list);
		list.add(0, 50); //can add value to the specific position
		System.out.println(list);
		
		List<Integer> newList = new ArrayList<>();
		newList.add(150);
		newList.add(160);
		
		list.addAll(newList); 
		// this will add all the elements of newList to current list
		System.out.println(list);
		
		
		
		System.out.println(list.get(0));*/
		//used to get a specific element using its
		//index value
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		
		System.out.println(list);
		
		//individual access to the elements
		//three methods
		
		//1.for loop
		for (int i=0; i<list.size();i++) {
			System.out.println("the element is " + list.get(i));
		}
		
		//2. foreach loop
		for(Integer element: list) {
			System.out.println("foreach element "+element);
		}
		
		//3. iterator
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println("iterator "+ it.next());
		}
		
		/*
		list.remove(0);
		//this remove the element using index
		System.out.println(list);
		list.remove(Integer.valueOf(30));
		//this remove the element mentioned directly
		System.out.println(list);
		
		list.clear();
		//empties the list
		System.out.println(list);
		
		list.set(0, 99);
		//change the element at specific index
		System.out.println(list);
		
		System.out.println(list.contains(50));
		//to check whether the specific element is present
		System.out.println(list.contains(500));*/
	}

}
