//Write a program that reads ten integers 
//and displays them in the reverse of the order in which they were read

import java.util.Scanner;

public class reverseOrder{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] norm = new int[10];		
		System.out.print("Please input 10 intergers, seperated by spaces: ");
		for(int i=0 ;i<norm.length; i++){
			norm[i] = sc.nextInt();
		}
		for(int j = norm.length - 1;j >= 0; j--){
			System.out.print(norm[j] + " ");
		}

	}
}