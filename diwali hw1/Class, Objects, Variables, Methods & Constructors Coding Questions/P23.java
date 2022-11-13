/*
Java Program to Demonstrate Usage of an Instance Variable in the Test Class
*/
class Test{
	
	int instanceVar;
	
	public static void main(String args[]){
		
		//Test.instanceVar; //cannot access non static variables in a static method
		
		Test obj = new Test();
		System.out.println("Value of instance variable before changing: "+obj.instanceVar);
		obj.instanceVar = 101;
		System.out.println("Value of instance variable after changing : "+obj.instanceVar);
	}
}