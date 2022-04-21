package com.bridgelab.Day14Problem2;

import java.util.Stack;

public class StackB {

	public static void main(String[] args) {
//		UC1...Ability to create a Stack
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(70);
		stack.add(30);
		stack.add(56);
		System.out.println("Stack="+stack);
		
//		UC2...Ability to peak and pop from the Stack till it is empty
		System.out.println("\nTop Element="+stack.peek());
		System.out.println("Poped Element="+stack.pop());
		System.out.println("Poped Element="+stack.pop());
		System.out.println("Poped Element="+stack.pop());
	}

}
