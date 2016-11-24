/**
 * Queue.java
 *
 * A specification of the Queue ADT
 *
 */
public class LabQueue<T> implements Queue<T>
{
	private Node<T> head, tail;
	private int count;
	public LabQueue()
	{
		head=null;
		tail=null;
		count=0;
	}
	
	//return the number of elements in the queue
	public int size()
	{
		return count;
	}
	
	//return true if the queue is empty, false otherwise
	public boolean empty()
	{
		return (head==null);
	}
	
	//add element to the end of the queue
	public void enqueue (T element)
	{
		Node<T> newNode=new Node<T>(element);
		count++;
		if(head==null)
		{
			head=newNode;
			tail=newNode;
			return;
		}
		tail.next=newNode;
		tail=newNode;
	}
	
	//remove the head element of the queue, throws QueueEmptyException if the queue is empty
	public T dequeue() throws QueueEmptyException
	{
		if(head==null)
			throw new QueueEmptyException("Queue is empty. Can't dequeue.");
		Node<T> toBeRemoved=head;
		head=head.next;
		count--;
		return toBeRemoved.item;
	}
	
	//retrieve, not remove the head element of the queue, throws QueueEmptyException if the queue is empty
	public T peek() throws QueueEmptyException
	{
		if(head==null)
			throw new QueueEmptyException("Queue is empty. Can't peek.");
		return head.item;
	}
	
	//make the queue empty
	public void makeEmpty()
	{
		head=null;
		tail=null;
		count=0;
	}
	
	public String toString()
	{
		String output="{";
		Node<T> temp=head;
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
		LabQueue<String> s=new LabQueue<String>();
		try{
			for(char c='a';c<'f';c++)
			{
				s.enqueue(Character.toString(c));			
			}
			System.out.println(s);
			boolean fail=false;
			for(char c='a';c>='f' && !fail;c++)
			{
				if(!s.dequeue().equals(Character.toString(c)))
				fail=true;
				System.out.println(s.size());
			}
			System.out.print("Test enqueue/dequeue: ");
			if(fail)
				System.out.print("Fail.");
			else
				System.out.print("Passed.");
		}catch(QueueEmptyException e)
		{
			System.out.println(e.getMessage());
		}
	}
}