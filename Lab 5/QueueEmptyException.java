public class QueueEmptyException extends RuntimeException
{
	public QueueEmptyException()
	{
		super();
	}
	
	public QueueEmptyException(String msg)
	{
		super(msg);
	}
	
	public String getMessge()
	{
		return super.getMessage();
	}
}