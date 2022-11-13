/*
Java Program to Illustrate Use of Final Keyword
*/

final class Parent1{

}

//class Child1 extends Parent1{}	// error -> as final classes cannot be inherited

class Parent2{
	
	final int num;
	
	Parent2(){
		this.num = 11;
	}
	
	Parent2(int num){
		this.num = num;
	}
	
	final void fun(){
		
		System.out.println("fun() method of Parent2 class");
	}
}

class Child2 extends Parent2{
	
	Child2(int num){
		super(num);
	}
	
	//void fun(){}			// error -> final methods cannot be overriden
}

class P16{
	
	public static void main(String args[]){
		
		Parent2 pObj = new Parent2(222);	
		Child2  cObj = new Child2(99);
		//Parent2 obj = new Child2(); //final class references can be used
		
		pObj.fun();
		System.out.println("Instance variable value is: "+pObj.num);
		
		//pObj.num = 101;	//cannot reassign value to final data member once initialized
		
		cObj.fun();
		System.out.println("Instance variable value is: "+cObj.num);
	}
}
