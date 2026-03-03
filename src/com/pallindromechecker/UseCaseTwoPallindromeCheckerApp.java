/*
 * UC2- Display whether a hardcoded string is a palindrome.
 * @author - developer
 * @version - 2.0.0
 */

package com.pallindromechecker;

import java.util.Scanner;

public class UseCaseTwoPallindromeCheckerApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input text: ");
		String input = scanner.nextLine();
		System.out.print("Is it Pallindrome? ");
		int n = input.length();
		for(int i = 0; i < n/2; i++) {
			if(input.charAt(i) != input.charAt(n - 1 - i)) {
				System.out.println("False");
				return;
			}
		}
		System.out.println("True");
	}
}
