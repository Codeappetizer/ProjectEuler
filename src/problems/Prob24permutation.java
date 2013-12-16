package problems;
public class Prob24permutation {
	public void permute( String input)
	{
	  int inputLength = input.length();
	  int count=1;  
	  boolean[ ] used = new boolean[inputLength];
	  StringBuffer outputString = new StringBuffer();
	  char[ ] in = input.toCharArray( );
      doPermute ( in, outputString, used, inputLength, 0 );
      count=count++;
      if(count==4)
	  System.out.println("millionth num is"+used);     

	
	}
	 public  void doPermute ( char[ ] in, StringBuffer outputString, 
	                    boolean[ ] used, int length, int level)
	  {
		 if( level == length) {
	     System.out.println ( outputString.toString()); 	     
	     }
	    for( int i = 0; i < length; ++i )
	    {       
	       if( used[i] ) continue;
	       outputString.append( in[i] );      
	       used[i] = true;       
	       doPermute( in,   outputString, used, length, level + 1 );       
	       used[i] = false;       
	         outputString.setLength(outputString.length() - 1 ); 
	   	}
	    
	 }
	}	    

