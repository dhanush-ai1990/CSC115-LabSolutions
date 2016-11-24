/**
  Learn recursion through examples
  
*/
public class Lab6
{
	/**
	 calculate the sum from 1 to n
	 @param n a positive number
	 @return the sum from 1 to n
	*/
	public static int sum(int n)
	{
		if (n==1)
		{
			return 1;
		}
		return n+sum(n-1);
	}
	
	/**
	 calculate the nth Fibonacci number
	 @param n a positive number
	 @return the nth Fibonacci number
	*/
	public static int fibonacci(int n)
	{
		if (n<=2)
		{
			return 1;
		}else{
			return fibonacci(n-1)+fibonacci(n-2);
		}
	}
	
	public static void main(String[] args)
	{
		int total=sum(5);
		System.out.println("The sum of 1 to 5 is: "+total);
		System.out.print("The first 8 Fibonacci numbers are: ");
		for(int i=1; i<8; i++)
		{
			System.out.print(fibonacci(i)+",");
		}
		System.out.println(fibonacci(8));
	}
}
