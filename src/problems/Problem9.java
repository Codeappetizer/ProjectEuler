package problems;

public class Problem9 {

	public void Pythagorean(){
		int a,b,c;
		
		
		for( a=100;a<1000;a++){
			for(b=100;b<1000;b++){
				for(c=100;c<1000;c++){
					if(a+b+c==1000){
						if((a*a)+(b*b)==(c*c)){
							System.out.println(a*b*c);
							//System.out.println("b is"+b);
							//System.out.println("c is"+c);
						}
					}
				}
			}
		}
	}
}
