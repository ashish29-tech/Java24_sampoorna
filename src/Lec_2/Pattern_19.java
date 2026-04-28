package Lec_2;
import java.util.*;
public class Pattern_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//consider extra star in first and last row
		//loop of...star, space, star, mirror, next row prep
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = n/2+1;
		int space = -1; //so that it fits into formula... -1, 1, 3,5
		while(row<=n) {
			//star
			int i = 1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			//space
			int j = 1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
					
			//star
			int k = 1;
			if(row== 1 || row==n) {
				k=2;
			}
			while(k<=star) {
				System.out.print("* ");
				k++;
			}
					
			//Mirror...hamara n/2+1 line pe hai
			//row ki value 4 se kam hai toh
			if(row<n/2+1) { // <=n/2 mtlab 3 tak
				star--;
				space+=2;
			}
			else {
				star++;
				space-=2;
			}
			
			//next row prep
			System.out.println();
			row++;
		}
	}

}
