//Write a method to add two matrices and returns the 
//result matrix. Suppose matrix c is the result of 
//adding two matrices a and b, ci,j = ai,j + bi,j. 
//The header of the method is as follows:
//public static double[ ][ ] addMatrix(double[ ][ ] a, double[ ][ ] b)

import java.util.Random;
public class MatrixAddition{
	public static void main(String[] arge){
		double[][] a = new double[3][3];
		double[][] b = new double[3][3];
		Random rand = new Random();
		
		//Make random values. The *1.12 is so make it a double value
		for(int i = 0; i < 3; i++){
			for(int j = 0; j<3; j++){
				a[i][j] = rand.nextInt(11) * 1.12;
			}	
		}
		for(int x = 0; x < 3; x++){
			for(int y = 0; y<3; y++){
				b[x][y] = rand.nextInt(11) + 1.12;
			}	
		}
		
		//Print Arrays
		System.out.println("Matrix A is: ");
		for(int r = 0; r < 3; r++){
			for(int s = 0; s<3; s++){
				System.out.printf("%-5.2f ", a[r][s]);
			}	
			System.out.println();
		}
		System.out.println("\n" + "Matrix B is: ");
		for(int u = 0; u < 3; u++){
			for(int v = 0; v<3; v++){
				System.out.printf("%-5.2f ", b[u][v]);
			}	
			System.out.println();
		}
		double[][] c = addMatrix(a, b); 
		System.out.println("\nMatrix C, the sum of A and B is: ");
		for(int g = 0; g < 3; g++){
			for(int h = 0; h<3; h++){
				System.out.printf("%-5.2f ", c[g][h]);
			}	
			System.out.println();
		}
	}
		
	public static double[ ][ ] addMatrix(double[ ][ ] a, double[ ][ ] b){
		double[][] c = new double[3][3];
		for(int p=0; p < 3; p++){
			for(int q = 0; q <3; q++){
				c[p][q] = a[p][q] + b[p][q];
			}
		}
		return c;
	}
}	