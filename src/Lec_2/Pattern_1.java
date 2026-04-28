package Lec_2;

public class Pattern_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int star = n; //can be any number so take n
		while(row<=n) { //1<=5
			//star
			int i = 1;
			while(i<=star) { //1<=5
				System.out.print("* "); //ln hta diya cuz line change karni hai
				i++; //i value increases
			}
			//next row
			System.out.println();//line change
			row++;
		}
		
	}

}
