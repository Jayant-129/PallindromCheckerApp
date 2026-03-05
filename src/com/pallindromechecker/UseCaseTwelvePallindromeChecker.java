package com.pallindromechecker;

/*
* MAIN CLASS - UseCaseTwelvePalindromeApp
*
* @author Developer
* @version 12.0
*
* */
 
import java.util.Scanner;
 
public class UseCaseTwelvePallindromeChecker {
	public static void main(String[] args) {
 
		Scanner scanner = new Scanner(System.in);
		PallindromeChecker palindromeChecker = new PallindromeChecker();
		
		int choice = 0;
 
        while (choice != 3) {
 
            System.out.println("\nMenu");
            System.out.println("1. Palindrome Checker Using Stack");
            System.out.println("2. Palindrome Checker Using Deque");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
 
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
 
                case 1 -> {
                	System.out.print("Input : ");
                	String input = scanner.nextLine();
                	palindromeChecker.setPallindromeStrategy(new StackStrategy());
            		System.out.println("Is it a Palindrome? :" + palindromeChecker.check(input));
                }
 
                case 2 -> {
                	System.out.print("Input : ");
                	String input = scanner.nextLine();
                	palindromeChecker.setPallindromeStrategy(new DequeStrategy());
            		System.out.println("Is it a Palindrome? :" + palindromeChecker.check(input));
                }
 
                case 3 -> System.out.println("Exiting program...");
 
                default -> System.out.println("Invalid choice");
            }
        }
 
 
		scanner.close();
	}
}
 