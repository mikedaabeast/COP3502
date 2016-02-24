//Write a program that reads multiple integers between 1 and 10 and 
//prints the occurrences of each. Assume the input ends with 0. 
//Note that if a number occurs more than one time, the plural word 
//"times" is used in the output.

import java.util.Scanner;
public class countNum{
	public static void main(String[] args) {
		int[] ar = {0,0,0,0,0,0,0,0,0,0};
		Scanner sc =  new Scanner(System.in);
		int ending = 1;
		System.out.print("Please enter a list of number: ");
		while(ending != 0){
			ending = sc.nextInt();
			if (ending == 0)
				break;
			else
				ar[ending - 1] += 1;	
		}
		for(int j=0; j<10; j++){
			if(ar[j]>1)
				System.out.println("The number " + (j+1) + " appears " + ar[j] + " times"); 
			else if(ar[j]==1)
				System.out.println("The number " + (j+1) + " appears " + ar[j] + " time");
		}
	}
}