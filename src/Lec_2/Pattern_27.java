package Lec_2;

public class Pattern_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//number pattern m vertical mirroring lagta hai
		//vertical mirroring hai isliye star wale pe loop lagega
		//vertically dekhe toh mirror 5th line pe hai
		//1st line m 1 star, 2nd m 3, 3rd m 5....
		//mirror wali line pe ate hi val kam ho
		int n = 5;
		int row = 1;
		int star = 1;
		int space = n-1;
		
		while(row<=n) {
			int i = 1;
			while(i<=space) {
				System.out.print("\t"); //jab number ho toh \(slash) t....tab separated space
				i++;
			}
			int j = 1;
			int val = 1;
			while(j<=star) {
				System.out.print(val + "\t");
				//mirror kab tak increase karega...star wali line se pehle tak increase karenge else kam karenge
				if(j<=star/2) { //star/2+1 pe
					val++;
				}
				else{
					val--;
				}
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
