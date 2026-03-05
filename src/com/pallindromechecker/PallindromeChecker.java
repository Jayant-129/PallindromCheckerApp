package com.pallindromechecker;

public class PallindromeChecker {
	private PallindromeStrategy strategy;
	
	public void setPallindromeStrategy(PallindromeStrategy strategy){
		this.strategy = strategy;
	}
	
	public boolean check(String input) {
		return strategy.checkPallindrome(input);
	}
}
