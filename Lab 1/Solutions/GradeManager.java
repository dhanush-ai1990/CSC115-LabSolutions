/**
 name: GradeManager.java
 purpose: Process students' grades
 author: Harshit Jain
 last modified: Sep. 18th, 2016
 list of credits: none
*/
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class GradeManager
{
	/**
	 Open file named "fName", parse the data and construct an array of Student objects.
	 return the array.
	*/
	public static Student[] getInputFromFile(String fName)throws FileNotFoundException
	{
		Scanner inFile=new Scanner(new File(fName));
		int size=inFile.nextInt();
		Student[] classList=new Student[size];
		
		for (int i=0; i<size; i++)
		{
			classList[i]=new Student(inFile.next(),inFile.nextInt());
		}
		return classList;
	}
	
	/**
	 An interactive method to get student number and mark from keyboard. If user enters the required information, a Student object is created and returned. "null" is returned otherwise.
	*/
	public static Student addStudentFromUser()
	{
		System.out.print("Add a Student? Y/N ");
		Scanner console=new Scanner(System.in);
		String answer=console.nextLine().trim();
		answer=answer.toLowerCase();
		if (answer.charAt(0) == 'y')
		{
			System.out.print("Enter the student number: ");
			String strN=console.nextLine().trim();
			System.out.print("Enter the mark: ");
			int mark=console.nextInt();
			console.close();
			return new Student(strN, mark);
		}
		console.close();
		return null;
	}
	
	/**
	 Calculate the average mark from the array of Student objects in "list", the number of students is stored in "count". The result is a decimal number. Return the average as a double number.
	*/
	public static double average(Student[] list, int count)
	{
		int sum=0;
		for (int i=0; i<count&&count<=list.length;i++)
		{
			sum += list[i].getMark();
		}
		return ((double)sum)/count;
	}
	
	/**
	 Print the student information to screen. "list" is an array of Student objects. "count" is the number of students in the array. The first line contains some descriptive words, then the student information is printed, one student per line. At the end, the class averaged is printed, preceded by some descriptive words. No return values.
	*/
	public static void report(Student[] list, int count)
	{
		System.out.println("The grades for the students:");
		for (int i=0; i<count&&count<= list.length;i++)
		{
			System.out.println(list[i]);
		}
		System.out.printf("The class average is: %1$5.2f\n", average(list, count));
	}
	
	/**
	 Double the size of the array "list". "list" is an array of Student objects. The values in "list" is copied to the newly created array. The enlarged array is returned.
	*/
	public static Student[] enlargeList(Student[] list)
	{
		Student[] newList=new Student[list.length*2];
		for (int i=0;i<list.length;i++)
		{
			newList[i]=list[i];
		}
		return newList;
	}
	
	public static void main(String[] args)
	{
		if (args.length!=1)
		{
			System.out.println("Usage GradeManager inputFileName");
			System.exit(1);
		}
		Scanner inFile=null;
		try{
			//do the whole try block in the lab
			Student[] classList=getInputFromFile(args[0]);
			int count=classList.length;
			System.out.println(count);
			report(classList, count);
			Student newStudent=addStudentFromUser();
			if (newStudent!=null)
			{
				if(count==classList.length)
					classList=enlargeList(classList);
				classList[count++]=newStudent;
				report(classList, count);
			}
		}
		catch (FileNotFoundException fe)
		{
			fe.printStackTrace();
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally{
			if(inFile!=null)
				inFile.close();
		}
	}
}