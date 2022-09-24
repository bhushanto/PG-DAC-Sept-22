import java.util.*;

class Swapno{
		public static void main(String args[]){
		int a, b;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a ");
		a=sc.nextInt();
		System.out.println("Enter b");
		b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a = "+a+" & b = "+b);
		}
}