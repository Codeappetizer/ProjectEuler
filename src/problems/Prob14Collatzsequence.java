package problems;

public class Prob14Collatzsequence {
	public void seq(){
	long i,n,longest=0;
	int terms=0;
	
	for (i = 1; i <= 1000000; i++)
	  {
	    n = i;
	    int this_terms = 1;

	    while (n != 1)
	    {
	      this_terms++;

	      if (this_terms > terms)
	      {
	        terms = this_terms;
	        longest = i;
	      }
	      if(n%2==0){
	    	  n=n/2;
	      }
	      else
	      {
	    	  n=3*n+1;
	      }
	    }
	  }
	    System.out.println(longest);
	    System.out.println(terms);

	  }
	}

