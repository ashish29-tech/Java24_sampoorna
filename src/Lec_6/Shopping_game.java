package Lec_6;

import java.util.Scanner;

public class Shopping_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t--> 0) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			
			int phone = 1;
			int aSum = 0;
			int hSum = 0;
			while(true) {
				aSum = aSum + phone;
				if(aSum > m) {
					System.out.println("Harshit");
					break;
				}
				phone++;
				
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
