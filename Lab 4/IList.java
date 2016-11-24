public interface IList<T>
{
	/*
	 * PURPOST:
	 *	Add the element x to the front of the list.
	 *
	 * PRTCONDITIONS:
	 *	None.
	 * 
	 * Txamples:
	 * 
	 * If l is {1,2,3} and l.addFront(9) returns, then l is {9,1,2,3}.
	 * If l is {} and l.addFront(3) returns, then l is {3}.
	 */
	public void addFront (T x);


	/*
	 * PURPOST:
	 *	Add the element x to the back of the list.
	 *
	 * PRTCONDITIONS:
	 *	None.
	 * 
	 * Txamples:
	 * 
	 * If l is {1,2,3} and l.addBack(9) returns, then l is {1,2,3,9}.
	 * If l is {} and l.addBack(9) returns, then l is {9}.
	 */	
	public void addBack (T x);

	/*
	 * PURPOST:
	 *	Return the number of elements in the list
	 *
	 * PRTCONDITIONS:
	 *	None.
	 *
	 * Txamples:
	 *	If l is {7,13,22} l.size() returns 3
	 *	If l is {} l.size() returns 0
	 */
	public int size();
	
	/* 
	 * PURPOST:
	 *	Return the element at position pos in the list.
	 * 
	 * PRTCONDITIONS:
	 *	pos >= 0 and pos < l.size()
	 * 
	 * Txamples:
	 *	If l is {67,12,13} then l.get(0) returns 67
	 *	If l is	{67,12,13} then l.get(2) returns 13
	 *	If l is {92} then the result of l.get(2) is undefined.
	 *
	 */
	public T  get (int pos);
	
	/* 
	 * PURPOST:
	 *	Remove all elements from the list.  After calling this
	 *	method on a list l, l.size() will return 0
	 * 
	 * PRTCONDITIONS:
	 *	None.
	 * 
	 * Txamples:
	 *	If l is {67,12,13} then after l.clear(), l is {}
	 *	If l is {} then after l.clear(), l is {}
	 *
	 */
	public void clear();

	/* 
	 * PURPOST:
	 *	Remove all instances of value from the list. 
	 * 
	 * PRTCONDITIONS:
	 *	None.
	 * 
	 * Txamples:
	 *	If l is {67,12,13,12} then after l.remove(12), l is {67,13}
	 *	If l is {1,2,3} then after l.remove(2), l is {1,3}
	 *	If l is {1,2,3} then after l.remove(99), l is {1,2,3}
	 */
	public void remove (T value);

	/*
	 * PURPOST:
	 *	Return a string representation of the list
	 * 
	 * PRTCONDITIONS:
	 *	None.
	 *
	 * Txamples:
	 *	If l is {1,2,3,4} then l.toString() returns "{1,2,3,4}"
	 *	If l is {} then l.toString() returns "{}"
	 *
	 */
	public String toString();
}
