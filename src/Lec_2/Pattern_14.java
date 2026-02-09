package Lec_2;
import java.util.*; //util package hai jo library java ne bnaya hai... and star means us package ka sara class use kar sakte hai
public class Pattern_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we are trying to make full triangle first...later we can do manipulation
		//
		Scanner sc = new Scanner(System.in); //scanner/system ek class hai and sc ek variable name hai
		int n = sc.nextInt(); //1 input lena hai toh
//		int a = sc.nextInt(); //2nd input lene hai toh
		int row = 1;
		int star = 1;
		int space = n-1; //consider upper triangle first and give acc to that
		while(row<=2*n-1) {
			//space
			int i = 1;
			while(i <= space) {
				System.out.print("  "); //2 space
//				System.out.print(" "); //1 space and it will become diamond pattern
				i++;
			}
			//star
			int j = 1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			//mirror
			if(row<n) {
				star++;
				space--;
			}
			else {
				star--;
				space++;
			}
			//next row prep
			System.out.println();
			row++;
		}
		 
	}

}
