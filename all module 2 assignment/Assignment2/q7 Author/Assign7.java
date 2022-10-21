class Author{
	private String name;
	private String email;
	private char ch;
	Author(){}
	Author(String name, String email, char ch){
		this.name=name;
		this.email=email;
		this.ch=ch;
	}
	
	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public char getGender() {
		return ch;
	}

	public String toString() {
		return "Author [name=" + name + ", email=" + email + ", gender=" + ch + "]";
	}
}
class Book{
	private String name; 
	private Author author;
	private double price;
	private int qtyInStock;
	Book(){}
	Book(String name, Author author, double price, int qtyInStock){
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	public String getName(){
		return name;
	}
	public Author getAuthor() {
		return author;
	}
	public double getPrice(){
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQtyInStock() {
		return qtyInStock;
	}

	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", price=" + price + ", qtyInStock=" + qtyInStock + "]";
	}
	
}
class Assign7{
	
	public static void main(String agrs[]){
		
		Author aObj = new Author("abc", "abc@mail.com", 'm');
		Book bObj = new Book("mybook", aObj,350.0, 1000);
		System.out.println(bObj);
		
	}
}