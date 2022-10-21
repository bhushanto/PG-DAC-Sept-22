
class Book{
	String bname;
	String[] authers = new String[3];
	int page, noauthors;
	float price;
	String publisher;
	
	Book(){}
	void create(String t, String ps, int pg, float pr){
		this.bname=t;
		this.publisher=ps;
		this.page=pg;
		this.price=pr;
	}
	void getAuther(String a){
		this.authers[0]=a;
		noauthors=1;
	}
	void getAuther(String a,String b){
		this.authers[0]=a;
		this.authers[1]=b;
		noauthors=2;
	}
	void getAuther(String a, String b, String c){
		this.authers[0]=a;
		this.authers[1]=b;
		this.authers[2]=c;
		noauthors=3;
	}
	void Display(){
		System.out.println("book*****************************");
		System.out.println("title ----"+bname);
		System.out.println("authors");
		for(int i=0;i<noauthors;i++){
			System.out.println("	"+authers[i]);
		}
		System.out.println("pages "+page);
		System.out.println("price "+price);
		System.out.println("publisher "+publisher);
	}

	
}
class Library{
	Book[] b;
	int totalBooks=0;
	Library(){}
	
	Library(int n){
		b=new Book[n];
		for(int i=0;i<n;i++){
			b[i]=new Book();
		}
	}
	void add(String t, String pb, int pg, float pr, String ...str){
		b[totalBooks].create(t, pb, pg, pr);
		int k=str.length;
		if(k==1){
			String S=str[0];
			b[totalBooks].getAuther(S);
		}
		else if(k==2){
			String S=str[0];
			String S1=str[1];
			b[totalBooks].getAuther(S, S1);
		}
		else if (k==3){
			String S=str[0];
			String S1=str[1];
			String S2=str[2];
			b[totalBooks].getAuther(S,S1,S2);
		}
		totalBooks++;
	}
	void totalPrice(){
		double sum=0;
		for(int i=0;i<totalBooks;i++){
		sum=sum+b[i].price;
		}
		System.out.println("Total price of all books "+sum);
	}
	void add(){
		totalBooks++;
	}
	void remove(){
		totalBooks--;
	}
	void display(){
		System.out.println("books are---------");
		for(int i=0; i<totalBooks;i++){
			b[i].Display();
			System.out.println();
		}
	}
	public static void main(String[] args){
		Library lib=new Library(5);
		lib.add("bookname 1","publisher 1",100,1000.0f, "abc");
		lib.add("bookname 2","publisher 2",200,2000.0f, "abc","def");
		lib.add("bookname 3","publisher 3",300,3000.0f, "abc","ghi","jkl");
		lib.add("bookname 4","publisher 4",400,4000.0f, "abc");
		lib.add("bookname 5","publisher 5",500,5000.0f, "abc");
		
		lib.display();	
		lib.totalPrice();
	}	
}
	

