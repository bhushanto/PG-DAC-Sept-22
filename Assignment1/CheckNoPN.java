import java.util.*;
class CheckNoPN{

	public static void main(String args[]){
	int a;
	Scanner sc=new Scanner(System.in);
	System.out.println();
	System.out.println("Enter no to chect +ve or -ve");
	a=sc.nextInt();
	System.out.println();
	if(a==0){
	System.out.print("number is zero...its neither positive nor negative ");
	}else if(a>0){
	System.out.print("number positive");
	}else{
	System.out.print("number is negative ");
	}
	System.out.println();


}
}