package problems;

public class Prob26recurcycle {
 public void recurring(){
//	 double n=1;
//for(double i=1;i<1000;i++){
//	n=1/i;
//	System.out.println("the nums is "+i+" its floating point is "+n);
//    
//
//}
//	
	 int sequenceLength = 0;
	 for (int i = 1000; i > 1; i--) {
	     if (sequenceLength >= i) {
	         break;
	     }
	  
	     int[] foundRemainders = new int[i];
	     int value = 1;
	     int position = 0;
	  
	     while (foundRemainders[value] == 0 && value != 0) {
	         foundRemainders[value] = position;
	         value *= 10;
	         value %= i;
	         position++;
	     }
	  
	     if (position - foundRemainders[value] > sequenceLength) {
	         sequenceLength = position - foundRemainders[value];
	     }
	     System.out.println("num with long recurring cycle is"+position+"and the position is:"+sequenceLength);
	 }

 
 }
}
