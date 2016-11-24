public class CircleTester{
	public static void main(String [] args) 
	{
		Circle c1=new Circle(1, 1, 2);
		Circle c2=new Circle();
		Circle c3=new Circle(1, 1, 2);
		
		System.out.println("c1:\n " + c1);
		System.out.println(" area = " + c1.area());
		System.out.println(" circumference = " + c1.circumference()+"\n");
		
		System.out.println("c2:\n " + c2);
		System.out.println(" area = " + c2.area());
		System.out.println(" circumference = " + c2.circumference()+"\n");
		
		System.out.println("c3:\n " + c3);
		System.out.println(" area = " + c3.area());
		System.out.println(" circumference = " + c3.circumference()+"\n");
		
		if(c1.equals(c2))
		{
			System.out.println("The circle c1 equals to circle c2.");
		}else
		{
			System.out.println("The circle c1 does not equal to circle c2."+"\n");
		}
		
		if(c1.equals(c3))
		{
			System.out.println("The circle c1 equals to circle c3.");
		}else
		{
			System.out.println("The circle c1 does not equal to circle c3.");
		}
	}//main
}