/*
 * UC3- Check whether a string is a palindrome by reversing it.
 * @author - developer
 * @version - 3.0.0
 */
package com.pallindromechecker;

import java.util.Scanner;

public class UseCaseThreePallindromeChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input text: ");
		String input = scanner.nextLine();
		System.out.print("Is String Pallindrome? ");
		int n = input.length();
		String reversed = "";
		for(int i = n - 1; i >= 0; i--) {
			reversed = reversed + input.charAt(i);
		}
		if(reversed.equals(input)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
}
