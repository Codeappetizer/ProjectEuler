package problems;
public class Problem1 {
	public void multiples(){
		int total=0,i;
		for(i=0;i<1000;i++){
			if(i%3==0 || i%5==0){
				
				total+=i;
			}
					}
		System.out.println("The sum is "+total);

	}
}
