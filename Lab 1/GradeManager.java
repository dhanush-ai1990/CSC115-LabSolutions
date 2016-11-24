/**
 name: GradeManager.java
 purpose: Process students' grades
 author: Harshit Jain
 last modified: Sep. 18th, 2016
 list of credits: none
*/
import java.util.Scanner;
import java.io.FileNotFoundException;
// import required classes

public class GradeManager
{
	/**
	Open file named "fName", parse the data and
	construct an array of Student objects.
	Return the array.
	*/
	public static Student[] getStudentsFromFile(String fName)throws FileNotFoundException
	{
		// Create a File with the filename 'fName'.

		// Create a Scanner with the File.

		// Use the Scanner to read the number of students.

		// Create an array of Student references, matching the amount of students in size.

		// For each element of the array:
			// Read the student number, read the mark.
			// Create a student with the numebr and the mark.
			// Store the student into the array.

		// Return the array of Students.

		return null;
	}
	
	/**
	An interactive method to get student number and mark from keyboard.
	If user enters the required information, a Student object is created and returned.
	"null" is returned otherwise.
	*/
	public static Student getStudentFromUser()
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
			return new Student(strN, mark);
		}
		return null;
	}
	
	/**
	Calculate the average mark from the array of Student objects in "list",
	the number of valid students in the array is given in "count".
	The result is a decimal number. Return the average as a double number.
	*/
	public static double averageMark(Student[] list, int count)
	{
		return 0.0;
	}
	
	/**
	 Print the student information to screen.
	"list" is an array of Student objects.
	"count" is the number of students in the array.
	The first line contains some descriptive words,
	then the student information is printed, one student per line.
	At the end, the class average mark is printed,
	preceded by some descriptive words.
	No return value.
	*/
	public static void printReport(Student[] list, int count)
	{
			// Print introductory text.

			// Print each student.

			// Compute average mark by calling 'averageMark'.

			// Print the average mark.
	}
	
	/**
	 Double the size of the array "list".
	"list" is an array of Student objects.
	The values in "list" is copied to the newly created array.
	The enlarged array is returned.
	*/
	public static Student[] enlargeList(Student[] list)
	{
		// Create a new array with double the size of 'list'.

		// Copy contents of 'list' to the new array.

		// Return the new array.

		return null;
	}
	
	public static void main(String[] args)
	{
		if (args.length!=1)
		{
			System.out.println("Missing command-line argument: input filename!");
			System.exit(1);
		}

		try
		{
			Student[] classList = getStudentsFromFile(args[0]);

			// Print student info by calling 'printReport'.

			// Repeatedly call 'getStudentFromUser':
				// Each time a new student is created:
					// If the 'classList' array is full, enlarge it by calling 'enlargeList'
					// Store new student into the (enlarged) array
					// Keep track of amount of students in the array.
				// If no student is created, quit.

		}
		catch (FileNotFoundException fe)
		{
			System.out.println("Invalid file:" + args[0]);
			System.exit(1);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.exit(1);
		}
	}
}