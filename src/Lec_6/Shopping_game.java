package Lec_6;

import java.util.Scanner;

public class Shopping_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // User input lene ke liye Scanner object banaya.
		int t = sc.nextInt(); //no. of test cases
		
		while(t--> 0) { //t baar chalega....if t = 3 then 3 > 0 -> true, 2 > 0 -> true, 1 > 0 -> true, 0 > 0 false
			int m = sc.nextInt(); // m = Aayush ki limit
			int n = sc.nextInt(); // n = Harshit ki limit
			
			int phone = 1;
			int aSum = 0;
			int hSum = 0;
			while(true) { //Infinite loop — tab tak chalega jab tak manually break na ho.
				//Aayush phone
				aSum = aSum + phone;
				if(aSum > m) {
					System.out.println("Harshit");
					break;
				}
				//
				phone++;
				
				//Harshit Phone
				hSum = hSum + phone;
				if(hSum > n) {
					System.out.println("Aayush");
					break;
				}
				phone++;
			}
		}
		
	}

}
