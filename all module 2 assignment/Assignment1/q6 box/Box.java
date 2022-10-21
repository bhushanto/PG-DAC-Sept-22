// Q6 box 
import java.util.*;
class Box{
	int height;
	int width;
	int breadth;
		Box(){}
		Box(int height, int width, int breadth){
			this.height=height;
			this.width=width;
			this.breadth=breadth;
		}
	int getVolume(){
		return height*width*breadth;
	}
	int getArea(){
		return 2*(height*breadth+height*width+breadth*width);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter height");
			int height=sc.nextInt();
		System.out.println("enter width");
			int width=sc.nextInt();
		System.out.println("enter breadth");
			int breadth=sc.nextInt();
	Box b=new Box();
		Box b1=new Box(height,width,breadth);
			System.out.println("Volume of 1st box = "+b1.getVolume());
			System.out.println("Area of 1st box = "+b1.getArea());
		Box b2=new Box(10,20,30);
			System.out.println("Volume of 2nd by pass by value box = "+b2.getVolume());
			System.out.println("Area of 2nd by pass by value box = "+b2.getArea());
	}
}