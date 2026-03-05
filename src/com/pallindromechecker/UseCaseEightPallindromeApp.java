/*
 * UC8-Check palindrome using singly linked list.
 * @author - developer
 * @version - 8.0.0
 */

package com.pallindromechecker;

import java.util.LinkedList;

public class UseCaseEightPallindromeApp {
	public static void main(String[] args) {
		
		//Initalize the string
		String input = "level";
		
		//Initalize the LinkedList
		LinkedList<Character> list = new LinkedList<>();
		
		//Add character to LinkedLost
		for(char c: input.toCharArray()) {
			list.add(c);
		}
		
		boolean isPallindrome = true;
		
		//Check if it is Pallindrome
		while(list.size() > 1) {
			if(list.getFirst() != list.getLast()) {
				isPallindrome = false;
				break;
			}
			list.removeFirst();
			list.removeLast();
		}
		
		System.out.println("Is Pallindrome? " + isPallindrome);
	}
}
