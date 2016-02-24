//Write a program that reads in the value for a, b, and c, 
//and prints the calculation result for the following formula
//		3(a-10)/5 + b+10c/33


import java.util.Scanner;

public class EqCalc{

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a value for a: ");
		int a = sc.nextInt();
		System.out.print("Please enter a value for b: ");
		int b = sc.nextInt();
		System.out.print("Please enter a value for c: ");
		int c = sc.nextInt();
		
		float calc = ((3*(a-10))/5) + b+((10*c)/33);
		
		System.out.print(calc);
	}
}