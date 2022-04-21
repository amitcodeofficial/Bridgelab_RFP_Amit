package com.bridgelab.Day14Problem2;

import java.util.LinkedList;
import java.util.Queue;

public class QueueB {

	public static void main(String[] args) {
//		UC1...Ability to create a Queue of 56->30->70
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(56);
		q.offer(30);
		q.offer(70);
		System.out.println(q);
		
//		UC2...Ability to dequeue from the beginning
		System.out.println("\nTop Element="+q.peek());
		System.out.println("Removed Element="+q.poll());
		System.out.println("Removed Element="+q.poll());
		System.out.println("Removed Element="+q.poll());
	}

}
