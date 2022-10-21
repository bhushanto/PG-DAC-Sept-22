/*
04.	Write a program to find the simple interest. 
Take the principle amount, rate of interest and time from user using Scanner class.
*/
import java.util.*;
class Q4{
		public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		double si, p, r, t;
		System.out.println("Enter principle");
		p=sc.nextDouble();
		System.out.println("Enter rate");
		r=sc.nextDouble();
		System.out.println("Enter time in year");
		t=sc.nextDouble();
		si=p*r*t/100;
		
		System.out.println("SI = "+si);
		
		
		}
}