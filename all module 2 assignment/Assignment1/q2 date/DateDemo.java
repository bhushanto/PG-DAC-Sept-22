
class DateDemo {
	int d, m,y;
	int[] dpm= {0,31,28,31,30,31,30,31,31,30,31,30,31};
	DateDemo(){
		this.d=01;
		this.m=01;
		this.y=1970;
	}
	DateDemo(int d){
		setd(d);
		this.m=01;
		this.y=1970;
	}
	DateDemo(int d, int m){
		setm(m);
		setd(d);
		this.y=1970;
	}
	DateDemo(int d,int m, int y){
		this.d=d;
		this.m=m;
		this.y=y;
	}
	void setd(int d){
		if(d>0 && d<=dpm[m] ){
			this.d=d;
		}
		if(m==2 && d==29 && (y%400==0 || y%100 != 0 && y%4==0)){
			this.d=d;
		}
		else
	throw new IllegalArgumentException("day in not in range");
	}
		void setm(int m){
			if(m>0&&m<13){
				this.m=m;
			}
			else throw new IllegalArgumentException("put value in range 1-12");
		}
			void nextDay(){
				if(m==12 && d==31 ){
					d=m=1;
				}
				if(d==dpm[m]){
					d=1;
					m++;
				}
				else{
					d++;
				}
			}
	void preDay(){
		if(d==1 && m==1){
			d=31;
			m=12;
			y--;
		}
		else if(d==1){
			d=dpm[--m];
		}else d--;
	}
	void print(){
		System.out.println(d+"/"+m+"/"+y);
	}
	
	public static void main(String[] args){
		DateDemo d1=new DateDemo(), d2=new DateDemo();
			System.out.println("date");
			d1.print();
			System.out.println("next date");
			d1.nextDay();
			d1.print();
			System.out.println("pre date");
			d2.preDay();
			d2.print();
	}
}