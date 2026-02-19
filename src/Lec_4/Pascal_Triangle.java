package Lec_4;

import java.util.Scanner;

public class Pascal_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ncr formula pe karna hai toh row and i dono zero se chalega
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //input n le liya
		int star = 1;
		int row = 0;
		while(row<n) { //row 0 hai and n 6 hai toh 5 tak chalega
			//star
			int i = 1;
			int ncr = 1; //har baar ncr ki value 1 lenge 
			while(i<star) { //i bhi 0 se chalega cuz ncr formula m karna hai... row bhi zero se n tak
				System.out.print(ncr+" "); //first time 1 print karenge
				//agli baar ke liye abhi update kar do...
				ncr = ((row-i)*ncr)/(i+1);// n-r * ncr / r+1 formula
				i++;
			}
			//next line prep
			row++;
			System.out.println();
			star++;
			
		}
	}

}
