public class LabStack<T> implements Stack<T>
{
	private Node<T> top;
	private int count;
	/**
	 Default constructor. Creates an empty Stack.
	*/
	public LabStack()
	{
		top=null;
		count=0;
	}
	
	/**
	 Check if the stack is empty.
	 @return true if the stack is empty, false otherwise.
	*/
	public boolean empty()
	{
		return (top==null);
	}
	
	/**
	 Get the top element of the stack without remove it.
	 @return the top element of the stack.
	 @throws StackEmptyException if the stack is empty
	*/
	public T peek() throws StackEmptyException
	{
		if (top==null)
		{
			throw new StackEmptyException();
		}
		return top.item;
	}
	
	/**
	 Get the top element of the stack and remove it.
	 @return the top element of the stack.
	 @throws StackEmptyException if the stack is empty
	*/
	public T pop() throws StackEmptyException
	{
		if (top==null)
		{
			throw new StackEmptyException();
		}
		Node<T> toBeRemoved=top;
		top=top.next;
		count--;
		return toBeRemoved.item;
	}
	
	/**
	 Push the element onto the stack
	 @param element an object of type T is pushed to the top of the stack.
	*/
	public void push(T element)
	{
		Node<T> newNode=new Node<T>(element, top);
		top=newNode;
		count++;
	}
	
	/**
	 Gets the number of elements in the stack
	 @return the number of elements in the stack
	*/
	public int size()
	{
		return count;
	}
	
	/**
	 Make the stack empty
	*/
	public void makeEmpty()
	{
		top=null;
		count=0;
	}
	/**
	 Gets the elements in the stack
	 @return the string presentation of all the elements in the stack
	*/
	public String toString()
	{
		String output="{";
		Node<T> temp=top;
		while(temp!=null)
		{
			output += temp.item;
			if(temp.next!=null)
			{
				output += ",";
			}
			temp=temp.next;
		}
		return output+"}";
	}
	public static void main(String[] args)
	{
		LabStack<String> s=new LabStack<String>();
		try{
			for(char c='a';c<'f';c++)
			{
				s.push(Character.toString(c));			
			}
			System.out.println(s);
			boolean fail=false;
			for(char c='e';c>='a' && !fail;c--)
			{
				if(!s.pop().equals(Character.toString(c)))
				fail=true;
				System.out.println(s.size());
			}
			System.out.print("Test push/pop: ");
			if(fail)
				System.out.print("Fail.");
			else
				System.out.print("Passed.");
		}catch(StackEmptyException e)
		{
			System.out.println(e.getMessage());
		}
	}
}