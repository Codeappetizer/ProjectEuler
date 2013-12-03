package problems;

public class Problem10 {
public void primenums(){
	long num,i,total=0;
	//starttime
	long startTime = System.currentTimeMillis();
	
	for(num=1;num<2000;num++){
	
//		System.out.println( n);
//		if(n % 2 == 0 || n % 3 == 0 || n% 5 == 0 || n %7 == 0)
//			continue;
		int count=0;
		for(i=2;i<=num/2;i++){
			if(num%i==0){
				count++;
				break;
			}
		}
		if(count==0 && num!=1)
		{
		System.out.println(" "+num);
		total=total+num;
		
		}
	}
	//endtime
	long endTime   = System.currentTimeMillis();
	//display total time endtime - startTime
	long totalTime = endTime - startTime;
	
	System.out.println("Addition of primes is"+total);
	System.out.println(totalTime);
}
}
