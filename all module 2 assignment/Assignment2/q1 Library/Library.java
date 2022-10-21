
abstract class Publication{
	int noOfPages;
	double price;
	String publisherName;
	Publication(){}
	void print(){
		System.out.println("No. of pages="+noOfPages+"	Price="+price+"	Publisher Name="+publisherName);
	}
}
class Book extends Publication{
	Book(){}
	Book(int noOfPages, double price, String publisherName){
		this.noOfPages=noOfPages;
		this.price=price;
		this.publisherName=publisherName;
	}
}
class Journal extends Publication{
	Journal(){}
	Journal(int noOfPages, double price, String publisherName){
		this.noOfPages=noOfPages;
		this.price=price;
		this.publisherName=publisherName;
	}
}
class Library{
		Publication[] p=new Publication[5];
		
	public static void main(String[] args){
		Library l=new Library();
		l.p[0] =new Book(100,111.1,"abc");
		l.p[1] =new Book(200,222.2,"def");
		l.p[2] =new Book(300,333.3,"ghi");
		l.p[3] =new Journal(400,444.4,"jkl");
		l.p[4] =new Journal(500,555.5,"mno");
		for(int i=0;i<l.p.length;i++){
			l.p[i].print();
		}
	}
}