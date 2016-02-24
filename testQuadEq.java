//Design a class named QuadraticEquation for a quadratic 
//equation ax 2+bx+x=0.
//
//The class contains:
//private data fields a, b, and c that represents three coefficients.
//a constructor for the arguments for a, b, and c.
//three get methods for a, b, and c.
//a method named getDiscriminant() that returns the discriminant, which is b 2-4ac
//the methods named getRoot1() and getRoot2() for returning 
//two roots of the equation, or returning 0 if the discriminant is negative.
//
//Write a test program, testQuadEq.java, that prompts the user to enter 
//values for a, b, and c and displays the roots. If no roots 
//for the equation, display "The equation has no roots."

import java.util.*;

class QuadraticEquation{
	Scanner sc = new Scanner(System.in);
	private double a;
	private double b;
	private double c;
	
	QuadraticEquation(){
		double a = geta();
		double b = getb();
		double c = getc();
	}

	
	double geta(){
		System.out.print("a = ");
		a = sc.nextDouble();
		return a;
	}
	
	double getb(){
		System.out.print("b = ");
		b = sc.nextDouble();
		return b;
	}
	
	double getc(){
		System.out.print("c = ");
		c = sc.nextDouble();
		return c;
	}
	
	double getDiscriminant(){
		double dis = (b * b) - (4 * a * c);
		return dis;
	}
	
	double getRoot1(){
		double dis =  getDiscriminant();
		if(dis > 0){
			double root = ((-1.0 * b) - Math.pow(dis, .5))/(2.0*a);
			return root;
		}
		return 0;
	}
	
	double getRoot2(){
		double dis =  getDiscriminant();
		if(dis > 0){
			double root = ((-1.0 * b) + Math.pow(dis, .5))/(2.0*a);
			return root;
		}
		return 0;
	}
	
}

public class testQuadEq{
	public static void main(String[] args){
		System.out.print("For a quadratic equation ax 2+bx+x=0\nPlease enter the values\n");
		QuadraticEquation eq = new  QuadraticEquation();
		if(eq.getDiscriminant() < 0){
			System.out.print("The equation has no roots.");
		}
		else{
			System.out.print("The equation has roots at " + eq.getRoot1() + " and " + eq.getRoot2());
		}
	}
}