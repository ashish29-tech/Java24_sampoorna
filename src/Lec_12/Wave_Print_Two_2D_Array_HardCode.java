package Lec_12;

public class Wave_Print_Two_2D_Array_HardCode {

	public static void main(String[] args) {
//		ctrl + shift + f to align...
		// TODO Auto-generated method stub
//		jaise 1D array m hard code kar ke array bnate the waise hi 2D array m karenge
		int[][] arr = { { 2, 3, 4, 6 }, { 1, 5, 3, 4 }, { 11, 12, 13, 16 } };
//		int[][] arr = { { 2, 3, 4, 6 }, { 1, 5 }, { 11, 12, 16 } }; //yha har row m column ka size alag-alag hota hai use jagged array kehte hai..
		
		print(arr);
	}
	
	public static void print(int [][] arr) {
		for(int col = 0; col < arr[0].length; col++) {
//			if column even hai
			if(col%2 == 0) {
				for(int row = 0; row<arr.length; row++) {
					System.out.print(arr[row][col] + " ");
				}
			}
			else { // agr odd hai column toh niche se start hoga
				for(int row = arr.length-1; row>=0; row--) {
					System.out.print(arr[row][col] + " ");
				}
				
			}
		}
	}
}
