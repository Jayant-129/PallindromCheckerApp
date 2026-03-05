/*
 * UC7 - Use Deque to compare front and rear elements.
 * @author - developer
 * @version - 7.0.0
 */

package com.pallindromechecker;

import java.util.ArrayDeque;
import java.util.Deque;

public class UseCaseSevenPallindromChecker {
	public static void main(String args[]) {
		
		//Initialize the String
		String input = "refer";
		
		//Create a Deque to store Character
		Deque<Character> deque = new ArrayDeque<>();
		
		//insert element in Deque
		for(char c: input.toCharArray()) {
			deque.addLast(c);
		}
		
		boolean isPallindrome = true;
		
		//Check if it is Pallindrome
		while(deque.size() > 1) {
			if(deque.peekFirst() != deque.peekLast()) {
				isPallindrome = false;
				break;
			}
			deque.pollFirst();
			deque.pollLast();
		}
		
		System.out.println("Is Pallindrome? " + isPallindrome);
	}
}
