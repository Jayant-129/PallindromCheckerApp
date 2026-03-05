package com.pallindromechecker;

/*
* MAIN CLASS - UseCaseThirteenPalindromeApp
*
* @author Developer
* @version 13.0
*
* */
 
import java.util.Scanner;
 
public class UseCaseThriteenPallindromeChecker {
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
                	long start = System.nanoTime();
                	palindromeChecker.setPallindromeStrategy(new StackStrategy());
                	long end = System.nanoTime();
            		System.out.println("Is it a Palindrome? :" + palindromeChecker.check(input));
            		System.out.println("Execution time: " + (end-start) + "ns");
                }
 
                case 2 -> {
                	System.out.print("Input : ");
                	String input = scanner.nextLine();
                	long start = System.nanoTime();
                	palindromeChecker.setPallindromeStrategy(new DequeStrategy());
                	long end = System.nanoTime();
            		System.out.println("Is it a Palindrome? :" + palindromeChecker.check(input));
            		System.out.println("Execution time: " + (end-start) + "ns");
                }
 
                case 3 -> System.out.println("Exiting program...");
 
                default -> System.out.println("Invalid choice");
            }
        }
 
 
		scanner.close();
	}
}
 