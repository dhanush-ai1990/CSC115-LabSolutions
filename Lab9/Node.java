public class Node<T>
	{
		public T item;
		public Node<T> next;
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
		/**
		 Gets the value of item
		 @return the value of item
		*/
		public T getItem()
		{
			return item;
		}
		/**
		 Assign newItem to instance variable item
		 @param newItem   an object of type T is assigned to the instance variable item.
		*/
		public void setItem(T newItem)
		{
			item=newItem;
		}
		/**
		 Gets the object next.
		 @return instance object next
		*/
		public Node<T> getNext()
		{
			return next;
		}
		/**
		 Assign nextNode to instance variable next
		 @param nextNode   an Node object
		*/
		public void setNext(Node<T> nextNode)
		{
			next=nextNode;
		}
}