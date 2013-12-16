package problems;
import java.util.ArrayList;
public class Prob22namescores {
public static void abundant(){
       int 	s=0;
	 ArrayList<Integer> al = new ArrayList<Integer>();
     for(int i = 1; i <= 28123; i++ ) {
        int a = sum(divisors(i));
        if(i==a){
 		   System.out.println("perfect num is is"+i); 
 	   }
       if(i<a){
    	   System.out.println("num is abundant"+i);
       }
       else
           if(i>a){
        s=s+i;	   
        System.out.println("sum of non abundant nums is: " +s);
           }
       if(a+a==i){
		   System.out.println("sum of abundant is"+i); 
	   }
       
     //System.out.println("Sum: " +a);
     }
}
  public static ArrayList<Integer> divisors(int n) {
     ArrayList<Integer> list = new ArrayList<Integer>();
     list.add(1);
     for(int i = 2; i < (n/2+1); i++){
        if(n % i == 0){
           list.add(i);
        }
     }
     return list;
  }
  public static int sum(ArrayList<Integer> c){
  int sum = 0;
  for(Integer e : c)
     sum += e;
  return sum;
  }	
	
	
	
}

