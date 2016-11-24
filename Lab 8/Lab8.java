/**
 Write a program to process an expression in post fix form from the command line. e.g. java 3 5 +
 Note for multiplication, run it like this: java 3 5 "*"
 Stop the program and send an error message if the number of arguments are less than 3.
*/
public class Lab8
{
	public static void main(String[] args)
	{
		if(args.length<3)
		{
			System.out.println("Usage: need at least three command line arguments, e.g. 3 5 +");
			System.exit(1);
		}

		//System.out.println("For multiplication, run the program like this:\nLab8 3 5 \"*\"");
		ExprTree tree=new ExprTree();
		try{
			System.out.println(args);
			tree.build(args);
			System.out.print(tree);
			System.out.println(" = " + tree.evaluate());
		}catch(Exception e)
		{
			System.out.println("Invalid expression");
			e.printStackTrace();
		}
	}
}