package problems;
import java.util.*;
//import java.lang.*;
public class Problem3 {
		  public void primeFactors(int n) {
		   List<Integer> factors = new ArrayList<Integer>();
		    for (int i = 2; i <= Math.sqrt(n); i++) {
		      while (n % i == 0) {
		        factors.add(i);
		        n /= i;
		        
		      }
		    }
		   System.out.print("Prime factors are"+factors);
		   
		// return Max(factors);
		  }
//		  public static boolean isPalindrome(int number) {
//		        int palindrome = number; // copied number into variable
//		        int reverse = 0;
//
//		        while (palindrome != 0) {
//		            int remainder = palindrome % 10;
//		            reverse = reverse * 10 + remainder;
//		            palindrome = palindrome / 10;
//		        }
//
//		        // if original and reverse of number is equal means
//		        // number is palindrome in Java
//		        if (number == reverse) {
//		            return true;
//		        }
//		        return false;
//		    }
		  

		
}
