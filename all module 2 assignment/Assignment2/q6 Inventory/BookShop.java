import java.util.*;
import java.io.*;
class Book{
	//BookShop bs=new BookShop();
		String title;
		String publisher;
		String author;
		double cost;
		int stock;
	Book(){}
		Book(String title,String publisher,String author,double cost,int stock){
			this.title=title;
			this.publisher=publisher;
			this.author=author;
			this.cost=cost;
			this.stock=stock;
		}
	void Details() {
		System.out.println("Book Details:- ");
		System.out.println("title - " + title);
		System.out.println("authors - " + author);
		System.out.println("publisher - " + publisher);
		System.out.println("cost - " +cost );
		System.out.println("stock - " +stock);
		System.out.println("----------------------------------------------");
	}

}
class BookShop{
	Book[] b;
	public static void main(String[] args){
		BookShop bs=new BookShop();
		Book b1=new Book("a1","a2","a3",10.10,10);
		Book b2=new Book("c1","c2","d3",20.20,20);
		Book b3=new Book("d1","d2","d3",30.30,30);		
		bs.b=new Book[]{b1,b2,b3};
		for(int i=0;i<bs.b.length;i++){
			bs.b[i].Details();
		}
		System.out.println("Enter title and author");
		Scanner ss=new Scanner(System.in);
		String s=ss.nextLine();
		String s1=ss.nextLine();
		bs.search(s,s1);
	}
	
	 void search(String ti, String au){	
	 boolean flag =false;
		for(int i=0;i<b.length;i++){
			
			if(ti.equalsIgnoreCase(b[i].title) && au.equalsIgnoreCase(b[i].author)){
						flag=true;
						b[i].Details();
						Scanner sc=new Scanner(System.in);
						System.out.println("Enter reqired quantity");
						int x=sc.nextInt();
					if(x<b[i].stock){
						System.out.println("total price = "+x*b[i].cost);
					}else {
						System.out.println("reqired copies not available");
					}
		} }	if(!flag)
					System.out.println("book not available");
			
	 }	
		}
	

