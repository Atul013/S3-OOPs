import java.util.*;
import java.lang.*;
abstract class Shape
{
	void numberOfSides()
	{
	}
	void area(int a, int b)
	{
		System.out.println("Area of rectangle is " +a*b);
	}
	void area(float h, float b)
	{
		System.out.println("Area of triangle is " +.5*b*h);
	}
	void area(float a)
	{
		System.out.println("Area of Hexagon is " + (3*1.732050807578*a*a)/2);
	}
}
class Rectangle extends Shape
{
	void numberOfSides()
	{
		System.out.println("The number sides of a Rectangle is 4");
	}	
}
class Triangle extends Shape
{
	void numberOfSides()
	{
		System.out.println("The number of sides of a Triangle is 3");
	}	
}
class Hexagon extends Shape
{
	void numberOfSides()
	{
		System.out.println("The number of sides of Hexagon is 6");
	}	
}
class main
{
	public static void main(String[] args)
	{
		Rectangle R=new Rectangle();
		Triangle T=new Triangle();
		Hexagon H=new Hexagon();
		R.numberOfSides();
		T.numberOfSides();
		H.numberOfSides();
	}
	System.out.println("
}
