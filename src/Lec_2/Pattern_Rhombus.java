package Lec_2;

import java.util.*;

public class Pattern_Rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//isme sabse pehle lagega horizontal mirroring
		//
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		int space = n-1;
		int val =1; //har row ke start point ke liye
		while(row<=2*n-1) {
			//space
			int i = 1;
			while(i<=space) {
				System.out.print("\t");
				i++;
			}
			//star
			int j = 1;
			while(j<=star) {
				System.out.print(val+"\t");
				j++; 
			}
			//mirror
			if(row<n) {
				star+=2;
				space--;
				val++; //mirror se pehle val badhe
			}
			else {
				star-=2;
				space++;
				val--; //mirror ke baad val kam ho
			}
			
			//next row prep
			System.out.println();
			row++;
		}
	}

}
