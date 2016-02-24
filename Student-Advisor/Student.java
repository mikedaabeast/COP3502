import java.util.*;

class Student{
	private String fName;
	private String mName;
	private String lName;
	private String ID;
	private String major;
	private String classYear;
	
	public Student(){
		fName = null;
		mName = null;
		lName = null;
		ID = null;
		major = null;
		classYear= null;
	}
		
	public void SetNames(String name){
		int t=0;
		String s = name;
		for(int i = 0; i < s.length(); i++) {
	        char c = s.charAt(i);
	        if(c == ' ')
	            t++;
		}
		if(t == 2){
			String[] token = s.split(" ");	
			fName = token[0];
			mName = token[1];
			lName = token[2];
		}
		else if(t == 1){
			String[] token = s.split(" ");
			fName = token[0];
			mName = "";
			lName = token[1];			
		}
	}
	
	public void SetID(String id){
		String s = id;
		boolean inval = false;
		String[] token = s.split("-");	
		String fh = token[0];
		String sh = token[1];
		if(fh.length() != 4 || sh.length() != 4){
			System.out.println("Invalid ID, ending program");
			System.exit(0);
		}	
		for(int i=0; i<fh.length(); i++){
			char c = fh.charAt(i);
			int a = Character.digit(c, 10); 
			if(a < 0 || a > 9){
				System.out.println("invalid character used, Invalid ID, ending program");
				System.exit(0);
			}
		}
		for(int i=0; i<sh.length(); i++){
			char c = sh.charAt(i);
			int a = Character.digit(c, 10); 
			if(a < 0 || a > 9){
				System.out.println("invalid character used, Invalid ID, ending program");
				System.exit(0);
			}	
		}
	}

	
	public void SetMajor(String m){
		if(m.equals("CIS") || m.equals("CEN") || m.equals("DAS")){
			major = m;
		}
		else{
			System.out.println("Not a valid major, ending program");
			System.exit(0);
		}
	}
	
	public void SetClassYear(String date){
		String s = date;
		boolean classC = false;
		Calendar cal = Calendar.getInstance();  
	    int Cuyear = cal.get(cal.YEAR);  
	    int Cumonth = cal.get(cal.MONTH)+1; //zero-based  
		
		
		    String[] token = s.split("/");	
		    String mm = token[0];
			String yyyy = token[1];
			int x = Integer.parseInt(mm);
			int y = Integer.parseInt(yyyy);
			boolean mmC = false, yyyyC = false;
			//CHECK IF MONTH IS VALID
			Scanner sc = new Scanner(System.in);
			if(x > 0 && x <13){
					mmC = true;
			}
			else{
				classC= false;
				System.out.print("Invalid Month, ending program ");
				System.exit(0);
				//s = sc.nextLine();
			}
			//CHECK IF YEAR IS VALID
			if(y > Cuyear || y == Cuyear){
					yyyyC = true;
			}
			else{
				classC = false;
				System.out.print("Invalid Year, ending program");
				System.exit(0);
			}
			//CHECK IF IN FUTURE
			if(yyyyC && mmC){
				if(y > Cuyear){
					classC = true;
					classYear = s;
				}
				else if(y == Cuyear){
					if(x == Cumonth || x > Cumonth){
						classC = true;
						classYear = s;
					}
					else{
						classC = false;
						System.out.print("Date in the past,ending program ");
						System.exit(0);
						//s =sc.nextLine();
					}	
				}
			}			
	}

	public String toString(){
		String s = "Name: " + lName + ", " + fName + "\nMajor: " + major + "\nID: " + ID + "\nGraduation Date: " + classYear;	
		return s;
	}

	public String getName(){
		if(mName == "") {
			return lName + ", " + fName;
		}
		return lName + ", " + fName + " " + mName; 
	}
	
	public String getID(){
		return ID;
	}
	
	public String getmajor(){
		return major;
	}
	
	public String getClassYear(){
		return classYear;
	}	
}