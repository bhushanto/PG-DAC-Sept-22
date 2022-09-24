import java.util.*;
class Addwo{
	public static void main(String args[]){
	int a,b;
	Scanner sc=new Scanner(System.in);
	System.out.println();
	System.out.println("enter a");
	a=sc.nextInt();
	System.out.println("enter b");
	b=sc.nextInt();
	while(b!=0){
	int carry = a & b;
	a=a^b;
	b=carry<<1;
	}
	System.out.println("sum = "+a);
	
	}
}