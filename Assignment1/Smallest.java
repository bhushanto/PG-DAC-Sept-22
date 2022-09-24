import java.util.*;
class Smallest{
	public static void main(String args[]){
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("enter no a");
		a=sc.nextInt();
		System.out.println("enter no b");
		b=sc.nextInt();
		System.out.println("enter no c");
		c=sc.nextInt();
		if(a==b && b==c){
		System.out.println("all no are equal");
		}else if(a<b && a<c ){ 
		System.out.println(" a is smaller");
		}else if(b<a && b<c ){ 
		System.out.println(" b is smaller");
		}else if(c<a && c<b ){ 
		System.out.println(" c is smaller");
		}else if(a==b){
			if( b>c ){System.out.println(" c is smaller");
			}else{System.out.println("a and b are equal & smaller ");}
		}else if(c==b){
			if( a<c ){System.out.println(" a is smaller");
			}else{System.out.println("c and b are equal & smaller ");}
		}else if(a==c){
			if( b<c ){System.out.println(" b is smaller");
			}else{System.out.println("a and c are equal & smaller ");}
		}


	}
}