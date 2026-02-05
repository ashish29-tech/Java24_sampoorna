package Lec_2;

public class Pattern_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int star = n;
		while(row<=n) {
			int i = 1;
			while(i<=row) {
				System.out.print("* ");
				i++;
			}
			//next row
			System.out.println();
			row++;
		}
		
	}

}
