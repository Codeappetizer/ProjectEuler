package problems;

import java.math.BigInteger;
import java.util.Scanner;

public class Prob16power {
	public void powerof2(){
//		double somenumber = (double)Math.pow(2, 1000);
//		System.out.println(somenumber);
		Scanner keyboard = new Scanner(System.in);
	    System.out.println("Base: ");
	    int base = keyboard.nextInt();
	    System.out.println("Power: ");
	    int power = keyboard.nextInt();
	    BigInteger total = new BigInteger(String.valueOf(base));
	    total = total.pow(power);
	    System.out.println(base + "^" + power + " = " + total.toString() );
	    System.out.println( " and the sum of the digits are " + getSumOfDigits(total.toString()));
	 }
	  private int getSumOfDigits(String numString){
	    if(numString.substring(0,1) == ".")numString = numString.substring(1);
	    if(numString.length()== 1) return Integer.valueOf(numString);
	    return Integer.valueOf(numString.substring(0,1)) + getSumOfDigits(numString.substring(1));
	 }
}
