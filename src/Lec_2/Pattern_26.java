package Lec_2;

public class Pattern_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int star = 1;
		int space = n - 1;
		while (row <= n) {
			int i = 1;
			while (i <= space) {
				System.out.print("\t");
				i++;
			}
			int j = 1;
			int val = 1; //val ko har row m 1 se start karna hai
			while (j <= star) {
				System.out.print(val + "\t");
				j++;
				val++;
			}
			// next row prep 
			System.out.println();
			row++;
			space--;
			star += 2;
		}
	}

}
