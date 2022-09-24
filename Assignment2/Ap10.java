class Ap10{
	public static void main(String args[]){
		int i,j;	
		int n=5;
		char ch=69;
		char z,x;
		for(i=1,z=ch;i<=n;i++,z--){
			x=z;
			for(j=i+1;j<=n;j++){
				System.out.print(" ");
			}
			for(j=1;j<=i;j++){
				System.out.print(x+" ");
				x++;
				
			}
		
		System.out.println();
		
			}
		
		}
		

}