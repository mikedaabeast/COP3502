//Twin primes are a pair of prime numbers that differ by 2. 
//For example, 3 and 5 are twin primes, 5 and 7 are twin primes, 
//and 11 and 13 are twin primes. Write a program to find all twin primes 
//less than 1000. Your program should hav a method called isPrime to check 
//whether a given number is prime or not. Display the output as follows:
// (3, 5)
// (5, 7)
// (11, 13)
// ...

public class TwinPrimes{
	public static void main(String[] args){
		boolean prime = false;
		for(int n=2; n<1001; n++){
		prime = isPrime(n);
			if(prime){
				prime = isPrime(n+2);
					if(prime)
						System.out.println("(" + n + ", " + (n+2) +")");
				//if(prime = true){
				//	System.out.println("(" + n + " " + (n+2) +")");
				//}
				
			}
		}
	}
	public static boolean isPrime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
}	