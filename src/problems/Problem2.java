package problems;

public class Problem2 {

	public int fibinocci(int n) {
		int total = 0;
		int f0 = 0, f1 = 1;
		for (int i = 0; i < n; i++) {
			int temp = f1;
			f1 = f1 + f0;
			f0 = temp;
			
			if (f1 % 2 == 0) {
				total = f1 + total;
			}
		}
		return total;
	}
	
		
		//System.out.println("The result is"+num);
	}

