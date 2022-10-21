

class Student{
	String name;
	int mark1;
	int mark2;
	int mark3;
	double avgM;
	int total;
	Student(){}
	void setMark(String name,int mark1, int mark2, int mark3){
		this.name=name;
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
	}
	
	void avg(){
		total=mark1+mark2+mark3;
		avgM=total/3;
	}
	void display(){
		System.out.println("Student name = "+name+"	total marks = "+total+"	avg mark = "+avgM);
	}
	public static void main(String[] args){
		Student s1=new Student();
		s1.setMark("ABC",40,30,70);
		s1.avg();
		s1.display();
	}
}