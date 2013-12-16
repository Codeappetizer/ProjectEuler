package problems;

import java.util.ArrayList;

public class Prob21Amicable {

//	public static int fact(){
//		int sum=0,n;
//		for(n=1;n<10000;n++){
//			for(int i=2;i<10000;i++){
//				if(isAmicable(n,i)==true){
//					sum+=i;		
//				}			
//		System.out.println(n+" and "+i+" is checked");
//		}
//		}
//	return n;
//	}
//	public static int n(int a){
//      int sum=1;
//		for(int i=2;i<a;i++){
//			if(a%i==0){
//				sum+=i;
//			}
//			//System.out.println(sum);
//		}
//		return sum;
//	}
//	public static boolean isAmicable(int a,int b){
//		return n(a)==n(b);
//		//System.out.println("output is");
//		}
	public static void generate(){
	      ArrayList<Integer> al = new ArrayList<Integer>();
	      for(int i = 1; i < 10000; i++ ) {
	         int a = sum(divisors(i));
	         int b = sum(divisors(a));
	         if(i == b && i != a){
	            if(!al.contains(i))
	               al.add(i);
	            if(!al.contains(b))
	               al.add(b);
	         }
	      }
	      System.out.println("Pairs: " + al);
	      System.out.println("Sum: " + sum(al));
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
	
