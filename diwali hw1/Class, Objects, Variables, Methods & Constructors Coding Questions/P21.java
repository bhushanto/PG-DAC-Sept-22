/*
Java Program to Allocate and Initialize Super Class Members using Constructor
*/

class Parent{
	
	int id;
	String name;
	
	Parent(){
		
	}
	
	Parent(int id, String name){
		this.id = id;
		this.name = name;
	}
}

class P21 extends Parent{
	
	int programNumber;
	
	P21(){
		
	}
	
	P21(int id, String name, int programNumber){
		super(id,name);
		this.programNumber = programNumber;
	}
	
	public static void main(String args[]){
		
		P21 obj = new P21(1001, "Parent-Child", 21);
		
		System.out.println("ID: "+obj.id);
		System.out.println("Name: "+obj.name);
		System.out.println("Program Number: "+obj.programNumber);
	}
}