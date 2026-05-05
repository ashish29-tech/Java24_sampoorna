package Lec_12;

import java.util.Scanner;

public class Take_Input_Output_2D_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Input Output 2D Matrix
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //row ka size 
		int m = sc.nextInt(); //column ka size
//		create 2D matrix
		int [] [] arr = new int [n][m];
		for(int i = 0; i < arr.length; i++) {
//			input lena hai toh har cell pe jana padega
			for(int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt(); //arr of i, j pe user se ek input leke rakh lena hai
			}
		}
		Display(arr);
	}	
//	ek loop print ke liye lagana padega...but uske liye ham function bna rahe hai taki 2D matrix function m kaise pass hota hai wo seekh lenge ham
	public static void Display(int [] [] arr) { //jaise 1D array pass hota hai waise hi 2D array pass hoga
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(); //line change
		}
	}
}

// console m input
// 3 4
// 2 3 4 1
// 8 9 11 23
// 5 6 7 8
