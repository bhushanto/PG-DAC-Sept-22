class Asp16{
	public static void main(String args[]){
		int i,j;
		int n=5;
			
		for(i=1;i<=n;i++){
			for(j=i+1;j<=n;j++){
				System.out.print(" ");
			}
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

