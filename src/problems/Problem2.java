package problems;

public class Problem2 {

	int total=0;
	int f0=0,f1=1,f2;
	public void fibinocci(){
		
		for(int i=0;i<33;i++){
			if(i<=1){
				f2=1;
			}
			f2=f1+f0;
			f1=f0;
			f0=f2;
			System.out.println(f2+",");
		if(f2%2==0){
			total=f2+total;
			
			}
			}
		System.out.println("The sum of evens is"+total);
	}
}
