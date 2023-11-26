package javaBeginnerCourse;

import java.util.ArrayDeque;

public class LearnArrayDequeue {
	public static void main(String[] args) {
		
		//it is a queue where elemnts can be added and
		//accessed from both sides
		//can beused as Stack also
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		
		ad.offer(12);
		ad.offer(56);
		
		ad.offerFirst(34);
		ad.offerLast(67);
		ad.offer(99);
		
		System.out.println(ad);
		System.out.println(ad.peek());
		System.out.println(ad.peekFirst());
		System.out.println(ad.peekLast());
		System.out.println(ad);
		
		ad.poll();
		System.out.println(ad);
		
		ad.pollFirst();
		System.out.println(ad);
		
		ad.pollLast();
		System.out.println(ad);
		
	}

}
