//Design a class named Point3D for points in 3 
//dimensional space. Include a constructor that
//takes three real coordinates x, y, and z. Include 
//methods distance, and distanceL1 for the Euclidean distance, 
//and the L1-distance. Write a test program, testP3D.java with 
//two Point3D objects, using method distance and distanceL1 to 
//calculate corresponding distance between them and print the results out.
//
//For example, if Point3D p1 = new Point3D(1, 2, 4);  
//and Point3D p2 = new Point3D(2, 1, 5);  the L1-distance 
//between these two points is |1-2|+|2-1|+|4-5| = 3.

import java.util.*;

class Point3D{
Scanner sc = new Scanner(System.in);
	double x;
	double y;
	double z;
	
	Point3D(double a, double b, double c){
	x = a;
	y = b;
	z = c;
	}
	
}

public class testP3D{
	public static void main(String[] args){
	
	Point3D p1 = new Point3D(1, 2, 4);   
	Point3D p2 = new Point3D(2, 1, 5); 
	
	System.out.println("The distance between the points are " +  distance(p1,p2));
	System.out.println("The Euclidean distance between the points are " + distanceL1(p1,p2));
	
	}
	
	public static double distanceL1(Point3D p1, Point3D p2){
		double edis= Math.abs(p1.x - p2.x) + Math.abs(p1.y - p2.y) + Math.abs(p1.z-p2.z);	
		return edis;
	}
	
	public static double  distance(Point3D p1, Point3D p2){
		double in = Math.pow((p2.x-p1.x),2) + Math.pow((p2.y-p1.y),2) + Math.pow(p2.z-p1.z,2);
		double dis = Math.pow(in, .5 );
		return dis;
		
	}
}	
	