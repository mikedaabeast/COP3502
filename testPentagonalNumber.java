//A pentagonal number is defined as n(3n-1)/2 for n = 1, 2, ...., 
//and so on. So, the first few numbers are 1, 5, 12, 22, ..., 
//Write the following method that returns a pentagonal number:
//public static int getPentagonalNumber(int n)
//Write a test program that displays the first 100 pentagonal 
//numbers with 10 numbers on each line. 

public class testPentagonalNumber{
	public static void main(String[] args){
		for (int n=1; n<101; n++){
		System.out.print(getPentagonalNumber(n));
			if(n%10 != 0)
				System.out.print(" ");
			else
				System.out.println();
		}	
	}

	public static int getPentagonalNumber(int n){
		n = n*(3*n-1)/2;
		return n;
	}
	
}