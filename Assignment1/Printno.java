class Printno{
	void print(int n){
	if(n<=10){
	System.out.println(n+" ");
	print(n+1);
	}
	}
		public static void main(String args[]){
		int a=1;
		Printno p1=new Printno();
		p1.print(a);
	
	}
}