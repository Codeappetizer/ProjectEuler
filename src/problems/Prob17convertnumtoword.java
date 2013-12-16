package problems;

public class Prob17convertnumtoword {
public void converttonums(){
	int[] a=new int[5];
	int t1=0,t2=0,t3=0,t100=0;//t1-sum of 1-99   t2-100,200,......800,900    t100-total of _01 - _99
    a[0]=36;//1-9 addition
    a[1]=70;//10-19 addition
    a[3]=46;//20,30........80,90
    a[4]=11;//1000
    t1=a[0]+a[1]+a[3]*10+8*a[0];
    t2=a[0]+7*9;
    t100=t1+10*99;
    t3=a[0]*99+9*t100;
    int total=t1+t2+t3+a[4];
    System.out.println("sum of letters in one to one thousand numbers is"+total);
    
}
}
