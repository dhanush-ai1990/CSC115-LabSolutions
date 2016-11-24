public class Circle
{	
	//declare instance variables, (x,y) coordinate of the upper left corner of the bounding square
	private double x;
	private double y;
	//radius of the circle
	private double r;
	
	//default constructor
	public Circle()
	{
		x=0;
		y=0;
		r=1;
	}
	//assume radius >0
	public Circle(double a,double b,double radius)
	{
		x=a;
		y=b;
		r=radius;
	}
	
	public double getX()
	{
		return x;
	}
	
	public double getY()
	{
		return y;
	}
	
	public double getR()
	{
		return r;
	}
	public void setX(double a)
	{
		x=a;
	}
	
	public void setY(double b)
	{
		y=b;
	}
	
	public void setR(double radius)
	{
		r=radius;
	}
	
	
	public boolean equals(Circle c)
	{
		return r==c.r && x==c.x && y==c.y;
	}
	
	public double area()
	{
		return Math.PI * r * r;
	}
	
	public double circumference()
	{
		return 2 *  Math.PI * r;
	}
}