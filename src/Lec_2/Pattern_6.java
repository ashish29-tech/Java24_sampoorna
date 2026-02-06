package Lec_2;

public class Pattern_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int star = n;
		int space = 0;
		while(row<=n) {
			//space loop
			int i = 1;
			while(i<=space) {
				System.out.print("  "); //ek space balance ko gap karne ke liye..cuz star m ek space diya hai
				i++;
			}
			int j = 1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			//next line
			System.out.println();
			row++;
			star--;
			space+=2; //space ko 2 se increase kar diya
		}
	}

}
