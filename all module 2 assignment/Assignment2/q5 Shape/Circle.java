interface Shape{
	double area();
	void draw();
	void rotate();
	void move(double a, double b);
}
class Circle implements Shape{
	double x,y,r;
	Circle(){}
	public double area(){
		return 3.14*r*r;
	}
	public void move(double a, double b){
		x=x+a;
		y=y+b;
	}
	
	public void draw(){}
	public void rotate(){}
		
	public void print(){
		System.out.println("center "+x+" "+y);
		System.out.println("radius "+r);
	}
	   public static void main (String[] args) {
    Circle c1 = new Circle();
    c1.print();
	Circle c2 = new Circle();
    c2.print();
    
	Rectangle r1 = new Rectangle();
    r1.print();
    Rectangle r2 = new Rectangle();
    r2.print();
    Rectangle r3 = new Rectangle();
    r3.print();
    
	r1.move(3,3);
    c1.move(4,4);
    c1.print();
    r1.print();
	
	r2.move(1,1);
    c2.move(2,2);
    c2.print();
    r2.print();
	
	r3.move(5,5);
    r3.print();
    }
}

class Rectangle implements Shape{
	
	Rectangle(){}
	public void draw(){}
	public void rotate(){}
	double l,w,x,y;
	public double area(){
		return l*w;
	}
	public void move(double a, double b){
		x=x+a;
		y=y+b;
	}
	void print(){
        System.out.println("Centre : ("+x+","+y+")");
        System.out.println("Length : "+l);
        System.out.println("Width : "+w+"\n");
	}
}