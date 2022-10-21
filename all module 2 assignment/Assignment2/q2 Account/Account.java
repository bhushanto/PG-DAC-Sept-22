
class Account{
	int accountNumber;
	String holderName;
	double balance;
	Account(){}
	void print(){
		System.out.println(accountNumber+"	"+holderName+"	"+balance);
	}
	public static void main(String[] args){
		Manager m=new Manager();
		SavingsAccount s1=new SavingsAccount(123,"abc",1000);
		SavingsAccount s2=new SavingsAccount(456,"def",2000);
		CurrentAccount c1=new CurrentAccount(1,"a",3000);
		CurrentAccount c2=new CurrentAccount(2,"b",4000);
		CurrentAccount c3=new CurrentAccount(3,"c",5000);
		m.add(s1);
		m.add(s2);
		m.add(c1);
		m.add(c2);
		m.add(c3);
		m.print();
		s1.calculateYearlyInterest();
		s2.calculateYearlyInterest();
	}
}
class SavingsAccount extends Account{
	double interestRate=3.5;
	SavingsAccount(){}
	SavingsAccount(int accountNumber, String holderName, double balance){
		this.accountNumber=accountNumber;
		this.holderName=holderName;
		this.balance=balance;
	}
	void calculateYearlyInterest(){
		System.out.println("Interest for a/c-"+accountNumber+" is "+interestRate*balance/100);
	}
}
class CurrentAccount extends Account{
	CurrentAccount(){}
	
	CurrentAccount(int accountNumber, String holderName, double balance){
		this.accountNumber=accountNumber;
		this.holderName=holderName;
		this.balance=balance;
	}
}
class Manager{
	Account[] a=new Account[1];
	Manager(){
	a[0]=new Account();
	}
	void add(Account x){
		int i,n=a.length;
		Account[] na=new Account[n+1];
		for(i=0;i<n;i++){
			na[i]=a[i];
		}
		na[i]=x;
		a=na;
	}
	void print(){
		for(int i=1;i<a.length;i++){
		a[i].print();
		}
	}
}