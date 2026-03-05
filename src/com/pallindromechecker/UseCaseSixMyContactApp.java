/*
 * UC6 - Demonstrate FIFO vs LIFO using Queue and Stack.
 * Check is String Pallindrome using Queue and Stack
 * @author - developer
 * @version - 1.0.0
 */

package com.pallindromechecker;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class UseCaseSixMyContactApp {
	public static void main(String[] args) {
		String input = "civic";
		
		Queue<Character> queue = new LinkedList<>();
		Stack<Character> stack = new Stack<>();
		boolean isPallindrome = true;
		for(char c: input.toCharArray()) {
			stack.push(c);
			queue.offer(c);
		}
		
		while(queue.isEmpty()) {
			if(stack.peek() != queue.peek()) {
				isPallindrome = false;
				break;
			}
			stack.pop();
			queue.poll();
		}
		System.out.println("Is Pallindrome? " + isPallindrome);
	}
}
