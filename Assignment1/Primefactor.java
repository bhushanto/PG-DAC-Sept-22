import java.util.*;
class Primefactor{
		public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		int n = sc.nextInt();
		for(int i=2;i<n;i=i+1){
			while(n%i==0){
			n=n/i;
			System.out.println(i);
			}
		}
		if(n>1)
		System.out.println(n);
		}
	

}
