import java.util.*;
class Sumdigit{
	public static void main(String args[]){
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("enter no");
		n=sc.nextInt();
		int a=n, temp, sum = 0;
		
		while(a>0){
		int b = a%10;
		sum = sum + b;
		a=a/10;	
		}
		System.out.println("sum = "+sum);
	}
}