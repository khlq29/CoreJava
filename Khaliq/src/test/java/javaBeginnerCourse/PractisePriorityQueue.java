package javaBeginnerCourse;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PractisePriorityQueue {
	public static void main(String[] args) {
		
		Queue<Integer> pq1 = new PriorityQueue<>();
		pq1.offer(12);
		pq1.offer(123);
		pq1.offer(23);
		//can also be implemented using Queue
		
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		//to convert from minheap to maxheap
		
		pq.offer(40);
		pq.offer(14);
		pq.offer(10);
		pq.offer(15);
		
		System.out.println(pq);
		
		
		System.out.println(pq.poll());
		System.out.println(pq);
		
		System.out.println(pq.peek());
	}
		

}
