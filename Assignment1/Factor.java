import java.util.*;
class Factor{
			public static void main(String args[]){
			int a;
			Scanner sc= new Scanner(System.in);
			System.out.println("enter no");
			a=sc.nextInt();
			System.out.println("Factor of "+a+" are ");
			for(int i=1;i<=a;i++){
			if(a%i==0){
			System.out.print(" "+i);
			}
			}
			}
}