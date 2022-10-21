
class Automobile{
	String make;
	String type;
	double maxSpeed;
	double price;
	double mileage;
	int regNumber;
	public void setData(String make, String type, double maxSpeed,	double price,double mileage,int regNumber){
		this.make=make;
		this.type=type;
		this.maxSpeed=maxSpeed;
		this.price=price;
		this.mileage=mileage;
		this.regNumber=regNumber;
	}
	public static void main(String[] args){
		Track t1=new Track();
		t1.setData(5.0,"steel","tata","type1",80.5,10000.00,4.2,123);
		System.out.println(t1.printData());
		Car c1=new Car();
		c1.setData(4,4,"aluminium","tata",120,50000.14,10.7,321);
		System.out.println(c1.printData());
	}
	
//	public String printDataData(){
//		return make+" "+type+" "+maxSpeed" "+price+" "+mileage+" "+regNumber;
//		
//	}
	
}
class Track extends Automobile{
	double capacity;
	String hoodType;
	public void setData(double capacity, String hoodType,String make, String type, double maxSpeed,	double price,double mileage,int regNumber ){
	super.setData(make,type,maxSpeed,price,mileage,regNumber);
	this.capacity=capacity;
	this.hoodType=hoodType;
}
	public String printData(){
		return capacity+" "+hoodType+" "+make+" "+type+" "+maxSpeed+" "+price+" "+mileage+" "+regNumber;
	}
}
class Car extends Automobile{
	int noOfDoors;
	int noOfWheels;
	public void setData(int noOfDoors, int noOfWheels,String make, String type, double maxSpeed ,double price,double mileage,int regNumber ){
	super.setData(make,type,maxSpeed,price,mileage,regNumber );
	this.noOfDoors=noOfDoors;
	this.noOfWheels=noOfWheels;
	}
	public String printData(){
		return noOfDoors+" "+noOfWheels+" "+make+" "+type+" "+maxSpeed+" "+price+" "+mileage+" "+regNumber;
	}
}
