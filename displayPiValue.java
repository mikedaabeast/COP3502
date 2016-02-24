//Write a method to compute the following series:
//m(i) = 4(1-1/3+1/5-1/7+1/9-1/11+...+1/(2i-1)-1/(2i+1))
//Write a test program that displays the following table:
//	i                               m(i)
//	10                           3.04184
//	20                           3.09162
//	...
//	100                         3.13159 

public class displayPiValue {
	public static void main(String[] args){
		System.out.printf("%-15s %-15s %n", "i", "m(i)");
		for (int j = 10; j<=100; j+=10){
			System.out.printf("%-15s", j); 
			summer(j);
		}	
	}	
	public static void summer(int j){		
		double sum=0.0;
		for(int i = 1;i<=j;i+=2){
		sum = sum + (1.0/((2.0*i)-1)) - (1.0/((2.0*i)+1));
		}
		sum = 4 *sum; 
		System.out.printf("%.5f", sum);
		System.out.println();		
	}
}