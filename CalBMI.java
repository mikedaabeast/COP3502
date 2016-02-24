//Write a program that computes and display the Body Mass Index (BMI). 
//It asks the user to input weight in kilograms and height in meters, 
//and calculates the BMI as the weight divided by the square of the height. 

import java.util.Scanner;

public class CalBMI{

    public static void main(String[] args) {
						
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter weight(Kilograms): ");
		int weight = sc.nextInt();
		System.out.print("Please enter height(meters): ");
		float height = sc.nextFloat();
				
		float BMI = ((weight)/(height * height));
				
		System.out.print("Your BMI is " + BMI);
	}
}