package interfacedemo;
import java.io.*;
interface MouseInterface
{
	void RightButtonPressed();
	void LeftButtonPressed();
	void MiddleButtonPressed();
}
public class InterfaceExample implements MouseInterface  {

	@Override
	public void RightButtonPressed() {
		// TODO Auto-generated method stub
		
		System.out.println("Right M B Pressed");
		
	}

	@Override
	public void LeftButtonPressed() {
		// TODO Auto-generated method stub
		System.out.println("Left M B Pressed");
	}

	@Override
	public void MiddleButtonPressed() {
		// TODO Auto-generated method stub
		System.out.println("Middle M B Pressed");
	}
	public static void main(String args[])
	{
		InterfaceExample ie=new InterfaceExample();
		ie.RightButtonPressed();
		ie.LeftButtonPressed();
		ie.MiddleButtonPressed();
	}
}