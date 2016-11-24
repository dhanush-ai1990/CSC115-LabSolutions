/**
  A hash table stores student information.
*/
public class MyHashTable
{
	private final int HASH_TABLE_SIZE=7;//a prime number
	private MyLinkedList[] table; //hash table
	private int count; //number of student objects
	
	/**
	  Create HASH_TABLE_SIZE empty MyLinkedList objects. In this case, create 7 empty lists. Set count to 0.
	*/
	public MyHashTable()
	{
		table = new MyLinkedList[HASH_TABLE_SIZE];
		for(int i=0; i<table.length; i++)
		{
			table[i]=new MyLinkedList();
		}
		count=0;
	}
	
	/**
	  return true if the table is empty, false otherwise.
	*/
	public boolean isEmpty()
	{
		return count==0;
	}
	
	/**
	  insert a student "obj" into the hash table. Need to find the index of the table based on the student number. Then insert the student "obj" into the list at that index.
	*/
	public void insert(Student obj)
	{
		String key=obj.getStudentNum();
		int i=hashIndex(key);
		table[i].insert(obj);
		count++;
	}
	
	/**
	  Based on the student number (or ID), remove the student if found and return true, return false if not found. Throw an exception if the list is empty.
	*/
	public boolean remove(String studentID)throws EmptyListException
	{
		int i=hashIndex(studentID);
		if(table[i].remove(studentID))
		{
			count--;
			return true;
		}
		return false;
	}
	
	/**
	  Based on the student number (or ID), return the student object if found and return null, return false if not found. Throw an exception if the list is empty.
	*/
	public Student search(String studentID)throws EmptyListException
	{
		int i=hashIndex(studentID);
		return table[i].search(studentID);
	}
	
	/**
	  Based on the student number (or ID), calculate the table index. Throw a HashException object if the studentID is null or empty. Suggest: convert each char into an int, add them and mod with table size. Return the int.
	*/
	public int hashIndex(String studentID)throws HashException
	{
		if(studentID==null || studentID.length()==0)
			throw new HashException("Need a student number.");
		int asciiCode=0;
		for(int i=0; i<studentID.length();i++)
		{
			asciiCode += studentID.charAt(i);
			asciiCode %=HASH_TABLE_SIZE;	
		}
		return asciiCode;
	}
	
	/**
	  A string representation of the hash table. One student per line.
	*/
	public String toString()
	{
		String output="";
		for(int i=0; i<table.length; i++)
		{
			if(table[i].size()!=0)
				output += table[i].toString()+"\n"; 
		}
		return output;
	}
	
	/**
	  return the number of student object in the table.
	*/
	public int size()
	{
		return count;
	}
	public static void main(String[] args)
	{
		MyHashTable csc123=new MyHashTable();
		csc123.insert(new Student("V00111111",11));
		csc123.insert(new Student("V00999999",99));
		csc123.insert(new Student("V00888888",88));
		csc123.insert(new Student("V00777777",77));
		csc123.insert(new Student("V00666666",66));
		csc123.insert(new Student("V00555555",55));
		csc123.insert(new Student("V00555551",535));
		csc123.insert(new Student("V00555552",45));
		csc123.insert(new Student("V00555553",155));
		System.out.println(csc123);
		csc123.remove("V00555555");
		System.out.println("after remove 5");
		System.out.println(csc123);
		csc123.remove("V00999999");
		System.out.println("after remove 9");
		System.out.println(csc123);
		csc123.remove("V00888888");
		System.out.println("after remove 8. size="+csc123.size());
		System.out.println(csc123);
		csc123.remove("V00666666");
		System.out.println("after remove 6. size="+csc123.size());
		System.out.println(csc123);
		csc123.remove("V00111111");
		System.out.println("after remove 1. size="+csc123.size());
		System.out.println(csc123);
		csc123.remove("V00777777");
		System.out.println("after remove 7. size="+csc123.size());
		System.out.println(csc123);
	}
}