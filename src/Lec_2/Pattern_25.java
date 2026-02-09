package Lec_2;

public class Pattern_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ek num value le lenge and use badhate rahenge jaise-jaise star inc ho rahe hai
		int n = 5;
		int row = 1;
		int star = 1;
		int space = n-1;
		int val = 1;
		while(row<=n) {
			int i = 1;
			while(i<=space) {
				System.out.print("\t"); //jab number ho toh tab separated space
				i++;
			}
			int j = 1;
			while(j<=star) {
				System.out.print(val + "\t");
				val++;
				j++;
			}
			//next row prep
			System.out.println();
			row++;
			space--;
			star+=2;
		}
	}

}
