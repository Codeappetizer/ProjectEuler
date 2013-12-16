package problems;

public class Prob15latticegrid {
	
	public void Latticegrid(){
//		 long c,fact=1,value,a=1;
//			for(c=1;c<=n;c++)
//				fact=fact*c;
//	     System.out.println("fact of number is"+fact);
//	     for(c=1;c<=(2*n);c++)
//	    	 a=a*c;
//	     value=(a/(fact*fact));
//		   System.out.println("value of number is"+value);
//		   
		 int gridSize = 20;
		long paths = 1;
		 
		for (int i = 0; i < gridSize; i++) {
		    paths *= (2 * gridSize) - i;
		    paths /= i + 1;
		}
		System.out.println("In a 20*20 grid there are "+paths+" possible paths");		
}
}
