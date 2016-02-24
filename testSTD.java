//Use the following equations to compute the standard deviation of n numbers:
//mean = (x1 + x2 + ... + xn) / n,  
//
//deviation = sqrt(((x1 - mean)2 + (x2 - mean)2 + ... + (xn - mean)2)/(n-1))
//
//You have to store the individual number using an array, so that they 
//can be used after the mean is obtained. Your program should contain 
//
//the following methods: 
//public static double deviation(double[] x) 
//public static double mean(double[] x) 
//
//write a test program that prompts the user to enter ten numbers and 
//displays the mean and deviation

import java.util.Scanner;

public class testSTD{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Please list 10 numbers: ");
		double[] ar = new double[10];
		for(int i=0; i< ar.length; i++){
			ar[i]= sc.nextDouble();
		}
		System.out.println("The mean of the numbers is: " + mean(ar));
		System.out.println("The deviation of the numbers is: " + deviation(ar));
	}
 
	public static double deviation(double[] x){
		double dev = 0.0; 
		double mean =  mean(x);
		double under = 0.0;
		for(int k = 0; k< x.length; k++){
		under = under + Math.pow(x[k] - mean, 2);
		}
		under = under/(x.length-1);
		dev = Math.pow(under, .5);
		return dev;
	}	 
	
	public static double mean(double[] x) {
		double mean = 0.0;
		for(int j = 0; j<x.length; j++){
			mean += x[j];
		}
		mean = mean/(x.length);
		return(mean);
	}
}	