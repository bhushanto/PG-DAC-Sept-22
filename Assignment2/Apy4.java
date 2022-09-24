class Apy4{
	public static void main(String args[]){
		int i,j,k;
		int n=9;
		
		for(i=1;i<=n;i++){
		k=1;	
			for(j=i+1;j<=n;j++){
				System.out.print(" ");	
			}
			for(j=1;j<=i;j++){
				System.out.print(k);
				k++;
			
			}
			k--;
			k--;
			for(j=1+1;j<=i;j++){
			
			System.out.print(k--);
			
			}
			System.out.println();
		}
	}		
}

