package problems;

public class Problem7 {

	public void primenum(){
	
	int[] A=new int[10000000];
	int j=2,count=0;
	for(int i=0;i<105025;i++)
		A[i]=i+1;
	for(int i=1;i<105025;i++){
		for(j=2;j<A[i];j++){
			if(A[i]%j==0){
				break;
			}
		}
			if(A[i]==j || A[i]==1){
			System.out.println("Primes are "+A[i]);
			count++ ;
			
		}
			
		}
	System.out.println(count);
		}
}
