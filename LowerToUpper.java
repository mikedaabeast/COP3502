//Write a program that reads an lower case letter and displays the 
//corresponding upper case character. 
//For example, if the user enters a, the program displays character A. 

import java.util.Scanner;

public class LowerToUpper {
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please a lower case letter: ");
		String input = sc.next();
		char c1 = input.charAt(0);
		int num = (int)c1 - 32;
		char c2 = (char)num;
		System.out.println(c2);
	}
}