//Design a class Pet with proper data and methods. 
//Write a test program, testPet.java, to read data for 
//five pets and display the following data: name of the 
//smallest pet, name of the largest pet, name of the oldest pet, 
//name of the youngest pet, average weight of the five pets, 
//and average age of the five pets.

import java.util.Scanner;

class Pet{
Scanner sc = new Scanner(System.in);

	public String name;
	public int age;
	public double wieght;
	
	Pet(){
		name = getName();
		age = getAge();
		wieght = getWeight();
		System.out.println();
	}
	String getName(){
		System.out.print("Name of Pet: ");
		String name = sc.nextLine();
		return name;
	}
	int getAge(){
		System.out.print("Age of Pet: ");
		int age = sc.nextInt();
		return age;
	}
	double getWeight(){
		System.out.print("Weight of Pet: ");
		double weight = sc.nextDouble();
		return weight;
	}
}
	
public class testPet{
	public static void testPet(String[] args){
		Pet p1 = new  Pet();
		Pet p2 = new  Pet();
		Pet p3 = new  Pet();
		Pet p4 = new  Pet();
		Pet p5 = new  Pet();
		oldest(p1,p2,p3,p4,p5);
		youngest(p1,p2,p3,p4,p5);
		largest(p1,p2,p3,p4,p5);
		smallest(p1,p2,p3,p4,p5);
		averageWieght(p1,p2,p3,p4,p5);
		averageAge(p1,p2,p3,p4,p5);
	}
	
	public static void oldest(Pet p1, Pet p2, Pet p3, Pet p4, Pet p5){
		if(p1.age > p2.age && p1.age > p3.age && p1.age > p4.age && p1.age > p5.age){
			System.out.println(p1.name + " is the oldest");
		}
		else if(p2.age > p1.age && p2.age > p3.age && p2.age > p4.age && p2.age > p5.age){
			System.out.println(p2.name + " is the oldest");
		}
		else if(p3.age > p1.age && p3.age > p2.age && p3.age > p4.age && p3.age > p5.age){
			System.out.println(p3.name + " is the oldest");
		}
		else if(p4.age > p1.age && p4.age > p2.age && p4.age > p3.age && p4.age > p5.age){
			System.out.println(p4.name + " is the oldest");
		}
		else if(p5.age > p1.age && p5.age > p2.age && p5.age > p3.age && p5.age > p4.age){
			System.out.println(p5.name + " is the oldest");
		}
	}
	
	public static void youngest(Pet p1, Pet p2, Pet p3, Pet p4, Pet p5){
		if(p1.age < p2.age && p1.age < p3.age && p1.age < p4.age && p1.age < p5.age){
			System.out.println(p1.name + " is the youngest");
		}
		else if(p2.age < p1.age && p2.age < p3.age && p2.age < p4.age && p2.age < p5.age){
			System.out.println(p2.name + " is the youngest");
		}
		else if(p3.age < p1.age && p3.age < p2.age && p3.age < p4.age && p3.age < p5.age){
			System.out.println(p3.name + " is the youngest");
		}
		else if(p4.age < p1.age && p4.age < p2.age && p4.age < p3.age && p4.age < p5.age){
			System.out.println(p4.name + " is the youngest");
		}
		else if(p5.age < p1.age && p5.age < p2.age && p5.age < p3.age && p5.age < p4.age){
			System.out.println(p5.name + " is the youngest");
		}
	}
	
	public static void largest(Pet p1, Pet p2, Pet p3, Pet p4, Pet p5){
		if(p1.wieght > p2.wieght && p1.wieght > p3.wieght && p1.wieght > p4.wieght && p1.wieght > p5.wieght){
			System.out.println(p1.name + " is the largest");
		}
		else if(p2.wieght > p1.wieght && p2.wieght > p3.wieght && p2.wieght > p4.wieght && p2.wieght > p5.wieght){
			System.out.println(p2.name + " is the largest");
		}
		else if(p3.wieght > p1.wieght && p3.wieght > p2.wieght && p3.wieght > p4.wieght && p3.wieght > p5.wieght){
			System.out.println(p3.name + " is the largest");
		}
		else if(p4.wieght > p1.wieght && p4.wieght > p2.wieght && p4.wieght > p3.wieght && p4.wieght > p5.wieght){
			System.out.println(p4.name + " is the largest");
		}
		else if(p5.wieght > p1.wieght && p5.wieght > p2.wieght && p5.wieght > p3.wieght && p5.wieght > p4.wieght){
			System.out.println(p5.name + " is the largest");
		}
	}
	
	public static void smallest(Pet p1, Pet p2, Pet p3, Pet p4, Pet p5){
		if(p1.wieght < p2.wieght && p1.wieght < p3.wieght && p1.wieght < p4.wieght && p1.wieght < p5.wieght){
			System.out.println(p1.name + " is the smallest");
		}
		else if(p2.wieght < p1.wieght && p2.wieght < p3.wieght && p2.wieght < p4.wieght && p2.wieght < p5.wieght){
			System.out.println(p2.name + " is the smallest");
		}
		else if(p3.wieght < p1.wieght && p3.wieght < p2.wieght && p3.wieght < p4.wieght && p3.wieght < p5.wieght){
			System.out.println(p3.name + " is the smallest");
		}
		else if(p4.wieght < p1.wieght && p4.wieght < p2.wieght && p4.wieght < p3.wieght && p4.wieght < p5.wieght){
			System.out.println(p4.name + " is the smallest");
		}
		else if(p5.wieght < p1.wieght && p5.wieght < p2.wieght && p5.wieght < p3.wieght && p5.wieght < p4.wieght){
			System.out.println(p5.name + " is the smallest");
		}
	}
	
	public static void averageAge(Pet p1, Pet p2, Pet p3, Pet p4, Pet p5){	
		double avgA = (p1.age + p2.age + p3.age + p4.age + p5.age)/5.0;
		System.out.println("The average age is " + avgA);
	}
	
	public static void averageWieght(Pet p1, Pet p2, Pet p3, Pet p4, Pet p5){
		double avgW = (p1.wieght + p2.wieght + p3.wieght + p4.wieght + p5.wieght)/5.0;
		System.out.println("The average weight is " + avgW);
	}
}