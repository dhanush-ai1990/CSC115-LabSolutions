public class INode
{
	public int item;     
	public INode next;
	/**
	 Default constructor. Sets the item to 0, next to null.
	*/
	public INode()
	{
		item=0;
		next=null;
	}
	/**
	 Constructor. Assigns the n to item, null to next.
	 @param n an integer assigned to instance variable item.
	*/
	public INode(int n)
	{
		item=n;
		next=null;
	}
	/**
	 Constructor. Assigns the n to item, nextNode to next.
	 @param n        an integer assigned to the instance variable item.
	 @param nextNode an INode object assigned to the instance object next
	*/
	public INode(int n,INode nextNode )
	{
		item=n;
		next=nextNode;
	}
	/**
	 Gets the value of item
	 @return the value of item
	*/
	public int getItem()
	{
		return item;
	}
	/**
	 Assign newItem to instance variable item
	 @param newItem   an integer assigned to the instance variable item.
	*/
	public void setItem(int newItem)
	{
		item=newItem;
	}
	/**
	 Gets the object next.
	 @return instance object next
	*/
	public INode getNext()
	{
		return next;
	}
	/**
	 Assign nextNode to instance variable next
	 @param nextNode   an INode object
	*/
	public void setNext(INode nextNode)
	{
		next=nextNode;
	}
}