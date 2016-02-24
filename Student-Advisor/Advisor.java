import java.io.*;
import java.util.*; 

public class Advisor{
	public static void main(String[] args) throws FileNotFoundException, IOException {
		File file = new File(args[0]);
		BufferedReader in = new BufferedReader(new FileReader(file));
		int studs = Integer.parseInt(in.readLine());
		Student[] students = new Student[studs];
		
		for(int i = 0; i < studs; i++) {
			students[i] = new Student();
			students[i].SetNames(in.readLine());
			students[i].SetID(in.readLine());
			students[i].SetMajor(in.readLine());
			students[i].SetClassYear(in.readLine());
		}
		in.close();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter file name of sasve file for 2015 graduates: ");
		String newFile = sc.next();
		File outFile = new File(newFile);
		if(outFile.exists())
		{
			System.out.println("This file already exists, sorry");
			System.exit(0);
		}
		PrintWriter output = new PrintWriter(outFile + ".txt");
		for (int i = 0; i < studs; i++) {
			String[] date = students[i].getClassYear().split("/");
			if (date[1].equals("2015")) {
				output.println(students[i].toString());
			}	
		}
		output.close();
	} 
}