import java.util.*;
class Person{
	int age;
	double weight, height;
	Date dateOfBirth;
	String address;
	void setPerson(int age, double weight, double height, Date dateOfBirth,	String address){
		this.age=age;
		this.weight=weight;
		this.height=height;
		this.dateOfBirth=dateOfBirth;
		this.address=address;
	}
	int getAge(){
		return age;
	}
	double getWeight(){
		return weight;
	}
	double getHeight(){
		return height;
	}
	Date getDate(){
		return dateOfBirth;
	}
	String getAddress(){
		return address;
	}
	public static void main(String[] args){
		Person p=new Person();
		Employee e=new Employee();
		Student s=new Student();
		s.calGrade();
		Professor pr=new Professor();
		pr.addCourses("cdac");
		pr.addLao("wealthy");
		Technician t=new Technician();
		
	}
	
}
class Employee extends Person{
	double salary;
	Date doj;
	int Exp;
}
class Technician extends Employee{}
class Professor extends Employee{
	String[] courses=new String[1];
	String[] loa = new String[1];
	void addCourses(String x){
		int i, n=courses.length;
		String[] nc=new String[n+1];
		for(i=0;i<n;i++){
			nc[i]=courses[i];
		}
		nc[n]=x;
		courses=nc;
	}
	void addLao(String x){
		int i,n=loa.length;
		String[] nloa=new String[n+1];
		for(i=0;i<n;i++){
			nloa[i]=loa[i];
		}
		nloa[n]=x;
		loa=nloa;
	}
	void rmCourses(String x){
		int i, k, n=courses.length;
		String[] nc=new String[n-1];
		for(i=0,k=0;i<n;i++){
			if(courses[i].equals(x)){
				continue;
			}
			nc[k++]=courses[i];
		}
		courses=nc;
	}
	void rmLoa(String x){
		int i,k,n=loa.length;
		String[] nloa=new String[n-1];
		for(i=0,k=0;i<n;i++){
			if(loa[i].equals(x)){
				continue;
			}
			nloa[k++]=loa[i];
		}
		loa=nloa;	
	}	
}
class Student extends Person{
	int roll;
	String[] los=new String[1];
	int[] marks=new int[1];
	void calGrade(){
		int i,sum=0;
		for( i=0;i<marks.length;i++){
		sum=sum+marks[i];
		}
	if(sum>=60){
		System.out.println("First Grade");
	}
	else if(sum<60 && sum>=40){
		System.out.println("Second Grade");
	}
	else{
		System.out.println("Third Grade");
	}
	}
}
