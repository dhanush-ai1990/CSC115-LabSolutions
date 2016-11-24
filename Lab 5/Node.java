/**
  Node is a singly linked node class. It stores an object of type T
  and an Node object which points to the next Node object.
  <p>
*/
public class Node<T>
{
	T item;
	Node<T> next;
	/**
	 Default constructor. Sets the item and next to null.
	*/
	public Node()
	{
		item=null;
		next=null;
	}
	/**
	 Constructor. Assigns the n to item, null to next.
	 @param n an object of type T is assigned to the instance variable item.
	*/
	public Node(T n)
	{
		item=n;
		next=null;
	}
	/**
	 Constructor. Assigns the n to item, nextNode to next.
	 @param n        an object of type T is assigned to the instance variable item.
	 @param nextNode an Node object assigned to the instance object next
	*/
	public Node(T n, Node<T> nextNode )
	{
		item=n;
		next=nextNode;
	}
}