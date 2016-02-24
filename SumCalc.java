//Write a program that generates two integers between 51 and 100 
//(including 51, but not 100) and prompts the user to enter the sum of these two integers. 
//The program then reports true if the answer is correct, false otherwise.

import java.util.Scanner;
import java.util.Random;

public class SumCalc {
	
    public static void main(String[] args) {
 
		Random rand = new Random();
		//99-51=48
		int num2 = rand.nextInt(51) + 48;
		int num1 = rand.nextInt(51) + 48;
		int num3 = num1 + num2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Guess the sum of two numbers that are between 51 and 100: ");
		int guess = sc.nextInt();
		while(guess != num3){
			if(guess < num3){
				System.out.print("Incorrect, your number is too low, try again: ");
				guess = sc.nextInt();
			}
			else if(guess > num3){
				System.out.print("Incorrect, your number is too high, try again: ");
				guess = sc.nextInt();
			}
		}
		
		if (guess == num3)
		System.out.print("That is the correct number");
	}
}