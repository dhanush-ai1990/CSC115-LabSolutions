/**
 * Queue.java
 *
 * A specification of the Queue ADT
 *
 */
public interface Queue<T>
{
	//return the number of elements in the queue
	int size();
	
	//return true if the queue is empty, false otherwise
	boolean empty();
	
	//add element to the end of the queue
	void enqueue (T element);
	
	//remove the head element of the queue, throws QueueEmptyException if the queue is empty
	T dequeue() throws QueueEmptyException;
	
	//retrieve, not remove the head element of the queue, throws QueueEmptyException if the queue is empty
	T peek() throws QueueEmptyException;
	
	//make the queue empty
	void makeEmpty();
}