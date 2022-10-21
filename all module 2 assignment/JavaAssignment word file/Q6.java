/*
06.	Write a program to convert temperature from Fahrenheit to Celsius.
 Take Fahrenheit as input using Scanner class. [ formula : C= 5*(f-32)/9 ]
*/

import java.util.*;
class Q6{
			public static void main(String []args){
			Scanner sc=new Scanner(System.in);
			System.out.println("enter temp in c");
			double f=sc.nextDouble();
			double c=(double)Math.round(5*(f-32)/9*100)/100;
			System.out.println("temp in c "+c);
			
			}
}