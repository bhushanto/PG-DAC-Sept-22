import java.util.*;
class Digit{
	public static void main(String args[]){
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("enter no");
		n=sc.nextInt();
		int a=n;
		
		while(a>0){
		int b = a%10;
		System.out.println(b);
		a=a/10;	
		}
	}
}