//use this file as a starting point to write a tester for your program.
public class Lab3
{
	public static void main(String[] args)
	{
		int[] intArray=new int[5];
		String[] stringArray=new String[5];
		
		intArray[0]=12;
		intArray[1]=23;
		intArray[2]=50;
		
		stringArray[0]="ABC";
		stringArray[1]="DEF";
		stringArray[2]="GHI";
		
		SLinkedList list=new SLinkedList();

		list.addBack(11);
		list.addBack(12);
		list.addBack(13);
		list.addFront(22);
		list.addFront(33);
		list.addBack(11);
		System.out.println(list);

		int size = list.size();
		System.out.println("The size of linked list is :" +size);

		int item =list.get(1);
		System.out.println("The item at position :" +item);

		list.remove(11);
		System.out.println(list);

		list.clear();

		System.out.println("Your lab instructor is going to explain how memory is allocated.");
		System.out.println(list);
	}
}