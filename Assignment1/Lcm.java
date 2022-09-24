import java.util.*;
class Lcm{
		public static void main(String args[]){
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a");
		a=sc.nextInt();
		System.out.println("enter b");
		b=sc.nextInt();
		int gcd=0;
		for(int i =1; i<=a && i <=b; i++){
		if(a%i==0 && b%i==0){
		gcd=i;
		}
		}
		int lcm=a*b/gcd;
		System.out.println("lcm = "+lcm);
		}

}