package Lec_12;

import java.util.Scanner;

public class Take_Input_Output_2D_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Input Output 2D Matrix
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //row ka size... 3..pehle 3 size ka 1 1D array banega...and iske corresponding 4 size ke 3 1D array bane
		int m = sc.nextInt(); //column ka size...4...
//		create 2D matrix
		int [] [] arr = new int [n][m];
		for(int i = 0; i < arr.length; i++) {
//			input lena hai toh har cell pe jana padega
			for(int j = 0; j < arr[0].length; j++) {
//				sabse pehle i bhi 0 and j bhi 0....input read kiya and  0,0 pe aya...then j increase to 1...use 0,1 pe rakh diya..then j 2 hua toh input liya and rakh diya aise hi 3 ke liye...ye pura chalne baad now i 1 se start hua and j phir se 0 se
				arr[i][j] = sc.nextInt(); //arr of i, j pe user se ek input leke rakh lena hai
			}
		}
		Display(arr); //jab ise call karenge toh jo bhi 2D array ka address hoga(11k) wo niche function m pass hoga and use 1 by 1 display kar denge
	}	
//	ek loop print ke liye lagana padega...but uske liye ham function bna rahe hai taki 2D matrix function m kaise pass hota hai wo seekh lenge ham
	public static void Display(int [] [] arr) { //jaise 1D array pass hota hai waise hi 2D array pass hoga...is arr m 11k address hoga 
		for(int i = 0; i<arr.length; i++) { // arr.length...row ka length...11k wala..(check notes in register)
			for(int j = 0; j < arr[0].length; j++) { //arr[0] se column ka length mila 4...2k ka length(check notes in register)
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(); //line change...pehle 1 row display hpga and then line change
		}
	}
}

// console m input
// 3 4
// 2 3 4 1
// 8 9 11 23
// 5 6 7 8
