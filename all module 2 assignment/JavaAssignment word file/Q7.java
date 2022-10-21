/*
07.	Write a program to swap two numbers without using third variable
*/
import java.util.*;
class Q7{
			public static void main(String []args){
			Scanner sc=new Scanner(System.in);
			int a,b;
			System.out.println("enter a");
			a=sc.nextInt();
			System.out.println("enter b");
			b=sc.nextInt();
			a=a+b;
			b=a-b;
			a=a-b;
			System.out.println(a);
			System.out.println(b);			
			}
}