package javaBeginnerCourse;

import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedlistQueue {
    public static void main(String[] args) {
    	boolean b;

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(12);
        queue.offer(24);
        queue.offer(36);
        System.out.println(queue.contains(36));
        //check the presence of specific element
        b = queue.contains(13);
        System.out.println(b);

        System.out.println(queue);
        
        System.out.println(queue.poll());
        //to remove the element
        System.out.println(queue);
        
        queue.peek();
        //show the first elemwnt to come out
        System.out.println(queue.peek());
        
        queue.add(234);
        System.out.println(queue);
        
        System.out.println(queue.element());
    }
}
