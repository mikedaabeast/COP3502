//Print the following table to display the sin value 
//and cos value of degrees from 0 to 360 with increments 
//of 10 degrees. Round the value to keep four digits after 
//the decimal point.
//	Degree          Sin                 Cos
//	0                      0.0000         1.0000
//	10                    0.1736         0.9848
//	...
//	350                  -0.1736         0.9848
//	360                  0.0000         1.0000

public class printTrigValues{
	public static void main(String[] args){
		System.out.printf("%-10s %-10s %-10s %n", "Degree", "Sin", "Cos");
				for (double j = 0.0; j<=360; j+=10){
			System.out.printf("%-10s", j); 
			sine(j);
			cosine(j);
		}	
	}	
	
	
	public static void sine(double j){
	//Special case because it would give negative zero: -0.0000
		if(j==360)
			System.out.printf("%-10.4f ", 0.0);
		else{
			double s = Math.sin(Math.toRadians(j));
			System.out.printf("%-10.4f ", s); 
		}
	}
	
	
	public static void cosine(double j){
		//Special case because it would give negative zero: -0.0000
		if(j==270)
			System.out.printf("%-10.4f %n ", 0.0);	
		else{
			double c = Math.cos(Math.toRadians(j));
			System.out.printf("%-10.4f %n" , c); 
		}
	}
}