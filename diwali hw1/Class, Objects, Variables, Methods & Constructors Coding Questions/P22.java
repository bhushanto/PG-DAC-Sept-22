/*
Java Program to Check the Accessibility of Static and Non-Static Variable by a Static Method
*/

class P22{
	
	int non_staticVar;
	static int staticVar;
	
	static void staticMethod(){
		
		//System.out.println("Value of non-static variable: "+non_staticVar);
		//cannot access non static instance DIRECTLY in a static method
		System.out.println("Value of static variable: "+staticVar);
	
		//need to create an object of class to access non static variable inside static method
		P22 obj = new P22();
		System.out.println("Value of non-static variable: "+obj.non_staticVar);
	}
	
	public static void main(String args[]){
		
		P22.staticMethod();
	}
}