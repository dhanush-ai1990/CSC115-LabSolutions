import java.util.Iterator;
public class Lab9{
	public static void main(String[] args)
		{
			SLL<Integer> list=new SLL<Integer>();
			int[] input={1,2,3,4};
			//test addBack
			for (int i=0; i<input.length; i++)
			{
				list.addBack(input[i]);
			}
			list.addFront(20);
			System.out.println(list);
			//output the same list using an iterator.

			Iterator<Integer> iter=list.iterator();
			System.out.println(iter.hasNext());
			System.out.println(iter.next());
			System.out.println(iter.next());
			System.out.println(iter.next());
	}
}