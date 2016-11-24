public class SLinkedList<T> implements IList<T>
{
	private Node<T> head;
	private int count;
	
	public SLinkedList()
	{
		head=null;
		count=0;
	}
	
	/*
	 * PURPOSE:
	 *	Add the element x to the front of the list.
	 *
	 * PRECONDITIONS:
	 *	None.
	 * 
	 * Examples:
	 * 
	 * If l is {1,2,3} and l.addFront(9) returns, then l is {9,1,2,3}.
	 * If l is {} and l.addFront(3) returns, then l is {3}.
	 */
	public void addFront (T x)
	{
		head=new Node<T>(x,head);
		count++;
	}

	/*
	 * PURPOSE:
	 *	Add the element x to the back of the list.
	 *
	 * PRECONDITIONS:
	 *	None.
	 * 
	 * Examples:
	 * 
	 * If l is {1,2,3} and l.addBack(9) returns, then l is {1,2,3,9}.
	 * If l is {} and l.addBack(9) returns, then l is {9}.
	 */	
	public void addBack (T x)
	{
		Node<T> newNode=new Node<T>(x);
		count++;
		//when it is empty
		if(head==null)
		{
			head=newNode;
			return;
		}
		Node<T> temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=newNode;
	}

	/*
	 * PURPOSE:
	 *	Return the number of elements in the list
	 *
	 * PRECONDITIONS:
	 *	None.
	 *
	 * Examples:
	 *	If l is {7,13,22} l.size() returns 3
	 *	If l is {} l.size() returns 0
	 */
	public int size()
	{
		return count;
	}
	
	/* 
	 * PURPOSE:
	 *	Return the element at position pos in the list.
	 * 
	 * PRECONDITIONS:
	 *	pos >= 0 and pos < l.size()
	 * 
	 * Examples:
	 *	If l is {67,12,13} then l.get(0) returns 67
	 *	If l is	{67,12,13} then l.get(2) returns 13
	 *	If l is {92} then the result of l.get(2) is undefined.
	 *
	 */
	public T  get (int pos)
	{
		if(head==null)
			return null;//throw exception
		Node<T> temp=head;
		for (int i=0; i<pos; i++)
		{
			temp=temp.next;
		}
		return temp.item;
	}
	
	/* 
	 * PURPOSE:
	 *	Remove all elements from the list.  After calling this
	 *	method on a list l, l.size() will return 0
	 * 
	 * PRECONDITIONS:
	 *	None.
	 * 
	 * Examples:
	 *	If l is {67,12,13} then after l.clear(), l is {}
	 *	If l is {} then after l.clear(), l is {}
	 *
	 */
	public void clear()
	{
		head=null;
		count=0;
	}
	
	/**
	 * PURPOSE:
	 *	Remove the first item from the list. 
	 * 
	 * PRECONDITIONS:
	 *	None
	 * 
	 * Examples:
	 *	If l is {67,12,13,12} then after removeFront(), l is {12,13,12}
	 *  67 is returned.
	 */
	public T removeFront()
	{
		if(head==null)
			return null;
		Node<T> toBeRemoved=head;
		head=head.next;
		count--;
		return toBeRemoved.item;
	}

	/* 
	 * PURPOSE:
	 *	Remove all instances of value from the list. 
	 * 
	 * PRECONDITIONS:
	 *	None.
	 * 
	 * Examples:
	 *	If l is {67,12,13,12} then after l.remove(12), l is {67,13}
	 *	If l is {1,2,3} then after l.remove(2), l is {1,3}
	 *	If l is {1,2,3} then after l.remove(99), l is {1,2,3}
	 */
	public void remove (T value)
	{
		if(head==null)
			return;
		Node<T> current=head;
		Node<T> previous=head;
		while(current!=null)
		{
			if (current.item.equals(value))
			{
				if (current==head)
				{
					head=current.next;
					previous=current.next;
				}else{
					previous.next=current.next;
				}
				current=current.next;
				count--;
			
			}else
			{
				previous=current;
				current=current.next;
			}
		}
	}

	/*
	 * PURPOSE:
	 *	Return a string representation of the list
	 * 
	 * PRECONDITIONS:
	 *	None.
	 *
	 * Examples:
	 *	If l is {1,2,3,4} then l.toString() returns "{1,2,3,4}"
	 *	If l is {} then l.toString() returns "{}"
	 *
	 */
	public String toString()
	{
		StringBuilder output=new StringBuilder("{");
		Node<T> temp=head;
		while(temp!=null)
		{
			output.append(temp.item);
			if(temp.next!=null)
				output.append(',');
			temp=temp.next;
			
		}
		output.append('}');
		return output.toString();
	}
}