package polymorphism;
abstract class AreaCalc
{
	abstract float area();
	void display()
	{
		System.out.println("I am in AreaCalc class");
	}
}
class Circle extends AreaCalc
{
	float rad;
	void setRadius(float r)
	{
		rad=r;
	}
	float area()
	{
		return (float)3.141*rad*rad;
	}
	
}
class Rectangle extends AreaCalc
{
	float b,h;
	void setDim(float base,float height)
	{
		b=base;
		h=height;
	}
	float area()
	{
		return b*h;
	}
}
class Triangle extends AreaCalc
{
	float b,h;
	void setDim(float base,float height)
	{
		b=base;
		h=height;
	}
	float area()
	{
		return (float)0.5*b*h;
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle();
		c.setRadius(2.0f);
		Rectangle r=new Rectangle();
		r.setDim(3,2);
		Triangle t=new Triangle();
		t.setDim(4,5);
		System.out.println("Area of circle "+c.area());
		System.out.println("Area of Rectangle "+r.area());
		System.out.println("Area of Triangle "+t.area());
		c.display();
		r.display();
		t.display();
	}
}
