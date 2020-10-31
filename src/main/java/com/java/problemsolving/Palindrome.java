package com.java.problemsolving;

public class Palindrome {
	public static void main(String[] args) {

		String name = "321ddaaddaadd123";
		boolean status = false;

		if (name.length() % 2 != 0) {
			System.out.println("Not a palindrome");
		} else {
			int i = 0;
			int j = name.length() - 1;
			while (i < j) {
				if (name.charAt(i) == name.charAt(j)) {
					i++;
					j--;
				} else {
					status = false;
					System.out.println("1 Not a palindrome");
					break;
				}
				status = true;
			}
			if (status) {
				System.out.println("Its a palindrome");
			}
		}

	}
}
