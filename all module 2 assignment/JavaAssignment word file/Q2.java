//02.Write a program that takes radius of a circle as input. 
//Read the entered radius using Scanner class. 
//Then calculate and print the area and circumference of the circle.
import java.io.*;
import java.util.*;
class Q2{
			public static void main(String [] args){
			System.out.println("Enter radius");
			Scanner sc=new Scanner(System.in);
			int r=sc.nextInt();
			double a=3.1415*r*r;
			double c=2*3.1415*r;
			System.out.println("Area = "+a);
			System.out.println("Circumference = "+c);
			
			
			}
}