package problems;
import java.util.*;
//import java.lang.*;
public class Problem3{
public static long largestPrimeFactor(long n) {
    // largest composite factor must be smaller than sqrt
    long sqrt = (long)Math.ceil(Math.sqrt((double)n));

    long largest = -1;

    for(long i = 2; i <= sqrt; i++) {
        if(n % i == 0) {
            long test = largestPrimeFactor(n/i);
            if(test > largest) {
                largest = test;
            }
        }
    }

    if(largest != -1) {
        //System.out.print();
    	return largest;
    }

    // number is prime
    return n;
} 
//public class Problem3 {
//		  public void primeFactors(int n) {
//		   List<Integer> factors = new ArrayList<Integer>();
//		    for (int i = 2; i <= Math.sqrt(n); i++) {
//		      while (n % i == 0) {
//		        factors.add(i);
//		        n /= i;
//		        
//		      }
//		      
//		    }
//		   System.out.print("Prime factors are"+factors);
//		   
//		// return Max(factors);
//		  }
		  public void isPalindrome() {
			  int value = 0;
          for(int i=100;i<1000;i++){
        	  for(int j=100;j<1000;j++){
        		  int value1 = i * j;
                  StringBuilder sb1 = new StringBuilder(""+value1);
                  String sb2 = ""+value1;
                  sb1.reverse();
                  if(sb2.equals(sb1.toString()) && value<value1) {
                      value = value1;
                  }
        	  }
        	  }
        	System.out.println(value);
          }
		  }
		

