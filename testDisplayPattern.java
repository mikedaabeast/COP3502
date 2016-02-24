//Write a method to display a pattern as follows:
//                  1
//                2 1
//              3 2 1
//	          ...
//		n n-1 ... 2 1
//the method header is public static void displayPattern(int n).

public class testDisplayPattern{
	public static void main(String[] args){
		int n = 10;
		displayPattern(n);
	}

	public static void displayPattern(int n){
		for(int i=1; i<=n;i++){
			for(int j=n;j>=1;j--){
				if(j>i)
					System.out.printf("%2s", "");
				else{
					System.out.printf("%2s", n-(n-j));
				}
			}
			System.out.println();
		}
	}	
}