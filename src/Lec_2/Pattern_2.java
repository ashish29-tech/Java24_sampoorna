package Lec_2;

public class Pattern_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int star = n;
		while(row<=n) {
			int i = 1;
			while(i<=row) { //counter ko row ke barabar kar diya...
				System.out.print("* "); // i and row dono 1 hai toh first row m 1 star ayega
				i++;
			}
			//next row
			System.out.println();
			System.out.println();
			row++;
		}
		
	}

}
