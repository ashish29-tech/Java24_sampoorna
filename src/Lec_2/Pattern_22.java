package Lec_2;

public class Pattern_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int star = n;
		int space = -1; //-1 cuz next row m 1 space hai then 3 then 5...so to adjust our logic of reducing 2 space we did -1 
		while(row<=n) {
			//star
			int i = 1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			//space
			int j =1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			//star
			int k = 1;
			if(row == 1) {
				k=2;
			}
			while(k<=star) {
				System.out.print("* ");
				k++;
			}
			System.out.println();
			row++;
			star--;
			space+=2; //space is getting reduced to two
		}
	}

}
