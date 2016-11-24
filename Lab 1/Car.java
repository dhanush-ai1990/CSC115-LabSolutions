
public class Car
{	
	//declare instance variables, Model of the car, manufacturer and year of manufacture.
	private int year;
	private String model;
	private String make;
	private double cost;
	private double mileage;
	private double distance;
	private double fuel;
	
	//default constructor
	public Car()
	{
		year= 1990;
		model= "default";
		make="default";
		cost= 10000.0;
		mileage= 10.0;
		distance = 0.0;
		fuel = 0.0;
	}
	//main Constructor
	public Car(int ye,String mo ,String ma, double co, double mi, double dist )
	{
		year = ye;
		model = mo;
		make = ma;
		cost = co;
		mileage = mi;
		distance = dist;
		fuel = 0.0;
	}
	
	public int travel(double dist)
	{
		distance = distance + dist;
		double fuel_consumption = dist / mileage;
		int temp;
		if (fuel < fuel_consumption)
		{
			System.out.println("not enough fuel to travel");
			temp = 1;
		}
		else
		{
			fuel = fuel - fuel_consumption;
			temp = 2;
		}
		return temp;
	}
}	