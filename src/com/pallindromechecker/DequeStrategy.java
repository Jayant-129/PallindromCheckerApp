package com.pallindromechecker;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStrategy implements PallindromeStrategy {

	@Override
	public boolean checkPallindrome(String input) {

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
		return isPallindrome;
	}

}