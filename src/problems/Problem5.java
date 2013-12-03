package problems;

public class Problem5 {

	public void smallnum(){
		int num;
		for(num=1;num<1000000000;num++){
			if( num%4==0 && num%9==0 && num%16==0
						&& num%5==0 
						&& num%7==0
						&& num%11==0
						&& num%13==0
						&& num%17==0
						&& num%19==0
						){
					
					System.out.println("The result is"+num);
				
			}
}
}
}