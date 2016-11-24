public class Lab4Tester
{
	public static void main(String[] args)
	{
		int total=0;
		int sizeTest=0;
		int toStringTest=0;
		SLinkedList<Integer> list=new SLinkedList<Integer>();
		if (list.size()==0)
		{
			System.out.println("Passed constructor testing");
			total++;
			sizeTest++;
		}else
			System.out.println("Failed constructor testing");
		
		if (list.toString().equals("{}"))
		{
			System.out.println("Passed toString() testing");
			toStringTest++;
		}else
			System.out.println("Failed toString() testing");
		
		int[] input={1,2,3,4};
		//test addBack
		for (int i=0; i<input.length; i++)
		{
			list.addBack(input[i]);
		}
		System.out.println("line 30: addBack:");
		System.out.println(list);
		if (list.size()==4)
		{
			System.out.println("Passed addBack/size testing");
			total++;
			sizeTest++;
		}else
			System.out.println("Failed addBack/size testing");
		boolean pass=true;	
		for (int i=0; i<input.length; i++)
		{
			if(list.get(i)!=(i+1))
			{
				System.out.println("Failed addBack/get testing");
				pass=false;
				break;
			}
		}
		if (pass)
		{
			System.out.println("Passed addBack/get testing line 50");
			total++;
		}
		
		if (list.toString().equals("{1,2,3,4}"))
		{
			System.out.println("Passed toString() testing");
			toStringTest++;
		}else
			System.out.println("Failed toString() testing");
			
		list=new SLinkedList<Integer>();
		//test addFront
		for (int i=0; i<input.length; i++)
		{
			list.addFront(input[i]);
		}if (list.size()==4)
		{
			System.out.println("Passed addFront/size testing");
			total++;
			sizeTest++;
		}else
			System.out.println("Failed addFront/size testing");
		
		System.out.println("line 75: addFront:");
		System.out.println(list);
		pass=true;	
		int j=0;
		for (int i=input.length; i>0; i--)
		{
			if(list.get(j)!=i)
			{System.out.println("get="+list.get(j)+"i="+i+"j="+j);
				System.out.println("Failed addFront/get testing");
				pass=false;
				break;
			}
			j++;
		}
		if (pass)
		{
			System.out.println("Passed addFront/get testing");
			total++;
		}
		
		if (list.toString().equals("{4,3,2,1}"))
		{
			System.out.println("Passed toString() testing");
			toStringTest++;
		}else{
			System.out.println("Failed toString() testing");
		}
			
		//test clear
		list.clear();
		if (list.size()==0)
		{
			System.out.println("Passed clear testing");
			total++;
			sizeTest++;
		}else
			System.out.println("Failed clear testing");
		
		if (list.toString().equals("{}"))
		{
			System.out.println("Passed clear() testing");
			toStringTest++;
		}else
			System.out.println("Failed clear() testing");
		for (int i=0; i<input.length; i++)
		{
			list.addBack(input[i]);
		}
		//test remove
		System.out.println("line 124 before remove 2: "+list);
		list.remove(2);
		System.out.println("after remove 2: "+list);
		
		list.remove(4);
		System.out.println("after remove 4: "+list);
		list.remove(2);
		System.out.println("after remove 2: "+list);
		list.remove(3);
		System.out.println("after remove 3: "+list);
	}
}