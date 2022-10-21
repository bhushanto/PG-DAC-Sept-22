/*05.	Write a program to read the days (eg. 670 days) as integer value using Scanner class.
 Now convert the entered days into complete years, months and days and print them.
*/
import java.util.*;
class Q5{
		public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter days");
		int d= sc.nextInt();
		int y=d/365;
		int temp=d%365;
		int month = temp/30;
		int temp1=temp%30;		
		System.out.println(y+" years "+month+" months "+temp1+" days");
				
		
		
		}
}