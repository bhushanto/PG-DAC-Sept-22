import java.util.*;
class Factorial{
			public static void main(String args[]){
			long a;
			Scanner sc= new Scanner(System.in);
			System.out.println("enter no");
			a=sc.nextLong();
			Long multi=1L;
			if(a==0){
			System.out.print("Factorial = 1");
			}else{
			System.out.print("Factorial = ");
			for(long i=a;i>=1;i--){
			multi=multi*i;
			}
			System.out.print(" "+multi);
			}
			}
}