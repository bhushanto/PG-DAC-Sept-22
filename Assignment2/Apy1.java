class Apy1{
	public static void main(String args[]){
		int i,j;
		int n=9;
		for(i=1;i<=n;i++){
			for(j=i+1;j<=n;j++){
				System.out.print(" ");	
			}
			for(j=1;j<=i;j++){
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}		
}

