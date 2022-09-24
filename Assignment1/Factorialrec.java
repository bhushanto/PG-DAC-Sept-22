import java.util.*;
import java.io.*;
class Factorialrec{
	
	public long fac(long x)
			{
			 if (x==0 || x==1)
			 return 1;
			 return x * fac(x-1);
			}
			
			public static void main(String args[]){
			long a;
			Scanner sc = new Scanner(System.in);
			System.out.println("enter no");
			a=sc.nextInt();
			long b;
			Factorialrec f1 = new Factorialrec();
			b=f1.fac(a);			
			System.out.print("Factorial = "+b);
			}
}