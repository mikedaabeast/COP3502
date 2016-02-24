//Write a program that reads an integer number between 33 and 125 
//and displays its corresponding ASCII character. For example, if 
//the user enters 97, the program displays the character a. Your code 
//should also display a message when the integer number is not in the
//right range (no need to display the character).

import java.util.Scanner;

public class DispAscii{

    public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a between 33 and 125: ");
		int num = sc.nextInt();
	
		while(num < 33 || num > 125) 
			{
			System.out.print("Invalid, please enter a between 33 and 125: ");
			num = sc.nextInt();
			}
	
		char c = (char)num;
		System.out.print(c);
	}
}