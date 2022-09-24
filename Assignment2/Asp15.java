class Asp15{
	public static void main(String args[]){
		int i,j;
		int n=5;
			
		for(i=1;i<=n;i++){
		
			for(j=1;j<=i;j++){
				if(j==1||i==n||i==j){
						System.out.print("*");	
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
	}		
}

