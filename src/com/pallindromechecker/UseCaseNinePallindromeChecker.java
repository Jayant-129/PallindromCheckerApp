/*
 * UC9-Check a palindrome using recursion.
 * @author - developer
 * @version - 9.0.0
 */


package com.pallindromechecker;

public class UseCaseNinePallindromeChecker {
	public static void main(String[] args) {
		//Initialize the String;
		String input = "level";
		
		//Method to check Pallindrome is Called
		boolean isPallindrome  = check(input,0,input.length() - 1);
		
		System.out.println("Is Pallindrome? "+ isPallindrome);
		
	}
	//Function to check Pallindrome using recursion
	private static boolean check(String s, int start,int end) {
		if(start >= end) return true;
		if(s.charAt(start) != s.charAt(end)) return false;
		return check(s,start + 1,end - 1);
	}
}
