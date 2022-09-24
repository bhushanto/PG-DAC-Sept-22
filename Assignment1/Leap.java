import java.util.*;
class Leap{
	public static void main(String args[]){
	int a;
	Scanner sc= new Scanner(System.in);
	System.out.println();
	System.out.println("Enter year to check leap or not");
	System.out.println();
	a=sc.nextInt();
	if(a%400==0 || a%100!=0 && a%4==0){
	
	System.out.println("this is leap year");
	}else
	{
	System.out.println("not leap year");
	}
	}

}