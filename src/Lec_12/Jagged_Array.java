package Lec_12;

import java.util.Scanner;

public class Jagged_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //ye hamne row le liya
//		usi row ka array bna denge
		int [] [] arr = new int [n] []; //column ka size likhna jaruri nahi hota. Isse 1 size ka 1D array banega...and har index pe null hoga.
//		System.out.println(arr[0]); //check kar sakte hai input dal ke 3...null hai....
//		System.out.println(arr); // 2D array ka address ayega
//		loop se bhi kar sakte hai ye kaam
//		har row m 1 no. lenge...
		for(int i = 0; i < arr.length; i++) { //code run karenge and 3 input dalenge toh ye loop 3 baar chalega...and jab input lega toh 2 dalenge toh 2 size ka 1D array ban ke address store ho jayega then 4 input toh 4 size ka 1D array and address 
//			har row m column ka size input lenge...har row m 1 no. lenge
			int m = sc.nextInt();
//			utne column ka array bna denge..
			arr[i] = new int[m]; // utne size ka 1D array us index pe rakhte chale jayenge
		}
		
//		same input pe matrix ko print bhi kar sakte hai
		for(int i = 0; i<arr.length; i++) { //row ka loop
//			har column ka length alag hai isliye isliye arr[i]....us i ke corresponding kitne size ka 1D array hai uska length aya
			for(int j = 0; j<arr[i].length; j++) {//column wala loop arr[i] kar ke lagayenge....cuz har column ka length alag-alag hai...jab i ki val 0 hogi toh 0th index ke column ka length alag hai..jab i 1 hoga toh 1st index ke column ka length alag hai...jab i 2 hoga toh 2nd index ke column ka length alag hai...
//				ye dalna hai input m...3 and press enter then 2 then 4 and 3
				System.out.print(arr[i][j]); //print karenge toh 0 0 ayega....
			}
			System.out.println();
		}
	}

}
