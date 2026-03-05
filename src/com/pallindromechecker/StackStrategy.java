package com.pallindromechecker;


import java.util.Stack;

class StackStrategy implements PallindromeStrategy{

	@Override
	public boolean checkPallindrome(String input) {
		
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
		return isPallindrome;
	}

	


}