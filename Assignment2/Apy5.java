class Apy5{
	public static void main(String args[]){
		int i,j,k,p;
		int n=9;
		for(i=1,k=n;i<=n;i++,k--){
		p=k;	
			for(j=i+1;j<=n;j++){
				System.out.print(" ");	
			}
			for(j=1;j<=i;j++){
				System.out.print(k);
				k++;
			
			}
			k--;
			
			for(j=1+1;j<=i;j++){
				--k;
			System.out.print(k--);
			k++;
			}
			System.out.println();
			
		}
	}		
}

