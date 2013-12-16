package problems;
import java.util.*;
public class Prob28Spiralnum {
	
	public void NumberSpiral(){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter any integer: ");
			int n=input.nextInt();
	int i, s = n,x=0, y=0;
	int arr [][]= new int [n][n];
	i=n*n;
	while(i>=1){for(int j=0; j<s; j++)
	arr[x][y++] = i--;
	x++;
	y--;
	if(i>=1){for(int j=0; j<s-1; j++)
	arr[x++][y] = i--;
	x--;
	y--;
	}
	if(i>=1){for(int j=0; j<s-1; j++)
	arr[x][y--] = i--;
	x--;
	y++;
	}
	if(i>=1){for(int j=0; j<s-2; j++)
	arr[x--][y] = i--;
	y++;
	x++;
	s=s-2;
	}
	}
	for(i=0; i<n; i++){
	for(int j=0; j<n; j++)
	System.out.print(arr[i][j] + " ");
	System.out.println();
	}
	}
	}

