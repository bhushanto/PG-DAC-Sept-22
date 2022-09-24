import java.util.*;
class Lcmprime{
		public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no ");
		int n = sc.nextInt();
		System.out.println("Enter no2");	
		int m = sc.nextInt();
		int prod=1, pr=1;
		int x,y;
		if (m>n){
			 x=m;
		y=n;}
		else{
			 x=n;
		y=m;}
//		System.out.println("x  "+x);
//			System.out.println("y  "+y);
		for(int i=2;i<=x;i=i+1){
			while(x%i==0 || y%i==0){
			if(x%i==0)
			x=x/i;
			if(y%i==0)
			y=y/i;
				prod = prod *i;
//		System.out.println("prod    "+prod);

				if(y>x){
					x=x+y;
					y=x-y;
				x=x-y;}
		}}
		System.out.println(prod);
		}
	

}
