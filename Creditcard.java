//A credit card number must have between 13 and 16 digits. It must start with

//4 for Visa cards
//5 for Master cards
//37 for American Express cards
//6 for Discover cards

//Double every second digit from right to left. If doubling 
//of a digit results in a two-digit number, add up the two 
//digits to get a single-digit  number.
//	2*2=4
//	2*2=4
//	4*2=8
//	1*2=2
//	6*2=12 (1+2= 3)
//	5*2=10 (1+0=1)
//	8*2=16 (1+6=7)
//	4*2=8

//Now add all single-digit numbers from Step 1.
//4+4+8+2+3+1+7+8 = 37

//Add all digits in the odd places from right to left in the card number.
//	6+6+0+8+7+8+3=38

//Sum the results from Step 2 and Step 3;
//	37+38=75

//If the result from Step 4 is divisible by 10, the card number 
//is valid; otherwise, it is invalid. For example, the number 
//4388576018402626 is invalid, but the number 4388576018410707 is valid.
//Write a program that prompts the user to enter a credit card number as 
//a long integer. Display whether the number is valid or invalid. Design 
//your program to use the following methods:

// return true if the card number is valid
//public static Boolean isValid(long number);

// get the result from Step 2
//public static int  sumOfDoubleEvenPlace(long number);

// return the number if it is a single digit, otherwise, return the sum of the two digits
//public static int  getDigit(int number);

// return sum of odd place digits in number
//public static int  sumOfoddPlace(long number);

// return true if the digit d is a prefix for number, e.g., prefixMatched(3788576018402626, 37) returns true
//public static boolean  prefixMatched(long number, int d);

// return the number of digits in d, e.g., getSize(4388576018402626) returns 16
//public static int  getSize(long d);

/* return the first k number of digits from number. 
If the number of digits in number is less than k, 
return number. E.g., getPrefix(4388576018402626, 2) returns 43*/
//public static long getPrefix(long number, int k);
 
//Please note that if the credit card number is shorter or longer 
//than 16 digits, or does not start with the four numbers listed 
//above, it is not a valid card number.

import java.util.Scanner;

public class Creditcard{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		System.out.print("Please input credit card number as a long integer: ");
		long number = sc.nextLong();
		if(isValid(number))
			System.out.println("Credit Card is Valid");
		else
			System.out.println("Credit Card is invalid");
	}
	
	public static Boolean isValid(long number){
		if((getSize(number)>16) || (getSize(number)<13))
			return false;
		else if(prefixMatched(number, (int)getPrefix(number, 2)) == false)
			 return false;
		else if(((sumOfDoubleEvenPlace(number) + sumOfoddPlace(number) ) % 10) != 0){
			return false;
		}
		return true;
	}
	
	public static int sumOfDoubleEvenPlace(long number){
		long value = 0;
		int esum=0;
		while(number > 0){
			number = number/10;
			value = number%10;
			int digit = (int)value;
			esum= esum + getDigit(digit * 2);
			number=number/10;	
		}
		return esum;
	}
	
	public static int getDigit(int number){
		int summer = 0;	
		summer = (number % 10) + (number / 10);
		return summer;
	}
	
	public static int  sumOfoddPlace(long number){
		long value = 0;
		int osum=0;
		while(number > 0){
			value = number%10;
			int digit = (int)value;
			osum= osum + digit;
			number=number/100;	
		}
		return osum;
	}
	
	public static boolean prefixMatched(long number, int d){
		if(d == 37)
			return true;
		else if ((d) == 4 || (d) == 5 || (d) == 6)
			return true;
		return false;
	}
	
	public static int  getSize(long d){
		int i=0;
		while(d > 0){
			d=d/10;
			i++;
		}
		return i;
	}

	public static long getPrefix(long number, int k){
		while(number > 37){
			number /= 10;
		}
		return number;
	}
}