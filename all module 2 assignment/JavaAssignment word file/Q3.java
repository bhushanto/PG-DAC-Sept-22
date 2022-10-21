//03.	Write a program to calculate sum of 5 subject’s marks & find percentage. 
//Take the obtained marks from user using Scanner class. 
//Output should be in this format [ percentage marks = 99 % ]. 
//Use concatenation operator here.

import java.util.*;
import java.io.*;
class Q3{
			public static void main(String [] args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter no. of sub");
			int n=sc.nextInt();
				int arr[] =new int[n];
			int sum=0;
			for(int i=0;i<arr.length;i++){
				System.out.println("enter "+(i+1)+" sub marks");
				arr[i]=sc.nextInt();
				sum=sum+arr[i];
			}	
			double p=sum/n;
			System.out.println("sum = "+sum);
			System.out.println("percentage marks = "+p+" %");
			
			
			}
}