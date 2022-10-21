/*
3. Write a class to represent complex numbers with necessary constructors.
 Write member functions to add, multiply two complex numbers.
 There should be three constructors: (i) to initialize real and imaginary parts to 0; 
 (ii) to initialize imaginary part to 0 but to initialize the real part to user defined value; 
 (iii) to initialize the real part and the imaginary part to user defined values.
 Also, write a main() function to (i) create two complex numbers 3+2i and 4-2i; 
 (ii) to print the sum and product of those numbers.
*/
class ComplexNo{
	double real,imag;
	ComplexNo(){
		real=imag=0;
	}
	ComplexNo(double real){
		this.real=real;
		this.imag=0;
	}
	ComplexNo(double real, double imag){
		this.real=real;
		this.imag=imag;
	}
	ComplexNo add(ComplexNo obj){
		ComplexNo m=new ComplexNo();
		m.real=this.real+obj.real;
		m.imag=this.imag+obj.imag;
		return m;
		}
	ComplexNo mux(ComplexNo obj){
		ComplexNo m= new ComplexNo();
		m.real=(this.real*obj.real-this.imag*obj.imag);
		m.imag=(this.real*obj.imag+obj.real*this.imag);
		return m;
	}
	String print(){
		return real+"+("+imag+")"+"i";
	}
}
class MainCom{
	public static void main(String[] args){
		ComplexNo c1=new ComplexNo(3,2);
		ComplexNo c2=new ComplexNo(4,-2);
		ComplexNo c3;
		c3=c1.add(c2);
		System.out.println("addition = "+c3.print());
		c3=c1.mux(c2);
		System.out.println("multiplication = "+c3.print());
	}
}