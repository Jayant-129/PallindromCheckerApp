/*
 * UC11-Encapsulate palindrome logic in a class.
 * @author - developer
 * @version - 11.0.0
 */

package com.pallindromechecker;
class PallindromeService{
	//Class deidcated to evaluate Pallindrome Strings
	
	public boolean checkPallindrome(String s) {
		return check(s,0,s.length() - 1);
	}
	
	private boolean check(String s, int start,int end) {
		if(start >= end) return true;
		if(s.charAt(start) != s.charAt(end)) return false;
		return check(s,start + 1,end - 1);
	}
	
}

public class UseCaseElevenPallindromeChecker {
	public static void main(String[] args) {
		//Initialize the String;
		String input = "Level@1345243    9#";
		
		//Normalize the String
		String result = input.toLowerCase().replaceAll("[^a-zA-Z]","");

		//Created PallindromeService object to Use its Service
		PallindromeService pallindromeService = new PallindromeService();
		
		//Service is invoked to check if string is Pallindrome
		boolean isPallindrome =pallindromeService.checkPallindrome(result);
		
		System.out.println("Is Pallindrome? " + isPallindrome);
	}
}

