package Week4;
class Box{
	double width;
	double height;
	double depth;
	Box(){
		System.out.println("Constructing Box");
		width = 10;
		height = 10;
		depth = 10;
	}
	double volume() {
		return width*height*depth;
	}
}
public class BoxDemo {
	public static void main(String args[]) {
		Box myBox1 = new Box();
		Box myBox2 = new Box();
		double vol;
		vol = myBox1.volume();
		System.out.println("Volume of box1="+vol);
		vol = myBox2.volume();
		System.out.println("Volume of box2="+vol);
	}
}
