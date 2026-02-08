package Lec_2;

public class Pattern_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//maan ke chalte hai 1 star jyada hai last row m toh isse dono traf barabar star honge
		//consider this pattern as a rectangle and it has length and height
		//length in terms of n... 2*n-1 and for space 2*n-3
		int n = 5 ;
		int row = 1;
		int star = 1;
		int space = 2*n-3;
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
			if(row == n) {
				k=2;
			}
			while(k<=star) {
				System.out.print("* ");
				k++;
			}
			System.out.println();
			row++;
			star++;
			space-=2; //space is getting reduced to two
		}
	}

}
