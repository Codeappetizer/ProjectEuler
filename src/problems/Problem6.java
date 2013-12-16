package problems;

public class Problem6 {
	
	
	public int diff(int n){
          //n=100;
		int sumofsqrs;
		int sumofnums=(n * (n+1))/2;
		int sqofsums=sumofnums*sumofnums;
		int diff;
		sumofsqrs=(n * (n+1) * ((2*n)+1))/6;
		diff=sqofsums-sumofsqrs;
		System.out.print("Diff is"+diff);
	   return diff;
	}

 
 
}

