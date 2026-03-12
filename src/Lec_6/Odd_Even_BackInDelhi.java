package Lec_6;

import java.util.Scanner;

public class Odd_Even_BackInDelhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Odd_and_Even(n);
		
	}
//	function ka return type void bna diya yahi return kar denge
	public static void Odd_and_Even(int n) {
		int oddsum = 0;
		int evensum = 0;
//		pehle reminder nikalenge and check karenge ki odd hai ya even hai
		while(n>0) {
			int rem = n%10;
			if(rem%2==0) {
				evensum+=rem; //rem 0 hai toh even sum m add kar do
			}
			else {
				oddsum+=rem; //else odd m add
			}
			n=n/10;
		}
		if(evensum%4==0 || oddsum%3==0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
