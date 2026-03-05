/*
 * UC5-Use stack to reverse characters and validate palindrome.
 * @author - developer
 * @version - 1.0.0
 */


package com.pallindromechecker;

import java.util.Stack;

public class UseCaseFivePallindromeChecker {
	public static void main(String[] args) {
		
		String input = "noon";
		
		Stack<Character> stack = new Stack<>();
		
		boolean isPallindrome = true;
		
		for(char c: input.toCharArray()) {
			stack.push(c);
		}
		for(char c: input.toCharArray()) {
			if(c != stack.peek()) {
				isPallindrome = false;
				break;
			}
			stack.pop();
		}
		System.out.println("Is Pallindrome? " + isPallindrome);
	}
}
