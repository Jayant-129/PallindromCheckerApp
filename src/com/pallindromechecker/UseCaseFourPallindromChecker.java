/* UC4-Convert a string to a character array and compare characters
 * @author - developer
 * @version - 4.0.0
 * 
 */

package com.pallindromechecker;

public class UseCaseFourPallindromChecker {
	public static void main(String args[]) {
		String input = "madam";
		
		char[] chars = input.toCharArray();
		int start = 0;
		int end = chars.length - 1;
		boolean isPallindrome = true;
		while(start < end) {
			if(chars[start] != chars[end]) {
				isPallindrome = false;
				break;
			}
			start++;
			end--;
		}
		System.out.println("Is String Pallindrome? " + isPallindrome);
	}
}
