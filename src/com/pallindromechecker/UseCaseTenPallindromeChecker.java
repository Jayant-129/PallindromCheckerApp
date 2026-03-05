package com.pallindromechecker;

/*
 * UC10- Ignore spaces and case while checking a palindrome
 * @author - developer
 * @version - 10.0.0
 */

public class UseCaseTenPallindromeChecker {
	public static void main(String[] args) {
		//Initialize the String;
		String input = "Aevel@1345243    9#";
		
		//Normalize the String
		String result = input.toLowerCase().replaceAll("[^a-zA-Z]","");

		//Method to check Pallindrome is Called
		boolean isPallindrome  = check(result,0,result.length() - 1);
		
		System.out.println("Is Pallindrome? "+ isPallindrome);
		
	}
	

	//Function to check Pallindrome using recursion
	private static boolean check(String s, int start,int end) {
		if(start >= end) return true;
		if(s.charAt(start) != s.charAt(end)) return false;
		return check(s,start + 1,end - 1);
	}
}