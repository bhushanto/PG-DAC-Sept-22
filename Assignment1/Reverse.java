import java.util.*;
class Reverse{
		public static void main(String args[]){
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		n=sc.nextInt();
		int remainder=0, reverse=0;
		while(n>0){
		remainder=n%10;
		reverse=reverse*10+remainder;
		n=n/10;
		
		}
		System.out.println(reverse);
		}

}