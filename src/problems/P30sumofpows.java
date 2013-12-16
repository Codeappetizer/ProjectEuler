package problems;

public class P30sumofpows {
public static void sumofpowers(){
	
	
	int result=0;
	for(int i=2;i<355000;i++){
		int sum=0;
		int num=i;
			while(num>0){
			int d=num%10;
			num/=10;
			int temp=d;
			for(int j=1;j<5;j++){
				temp*=d;
			}
			sum+=temp;
			
		}
			
		if(sum==i){
			result+=i;
		}		
	}
	System.out.print("result is:"+result);
}

}
