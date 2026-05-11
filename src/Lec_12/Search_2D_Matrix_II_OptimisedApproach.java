package Lec_12;

public class Search_2D_Matrix_II_OptimisedApproach {
//	Staircase search algo
//	https://leetcode.com/problems/search-a-2d-matrix-ii/description/
//	we chose top right or bottom left corner so that ej direction eliminate kar sake
// yha we chose top right corner but why not rest of the three corner ?
//	suppose if we chose top left corner that is 1 in this case then right and down dono 
//	side data increase ho rha hai toh direction eliminiate impossible ho jayega
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {
	            {1, 4, 7, 11, 15},
	            {2, 5, 8, 12, 19},
	            {3, 6, 9, 16, 22},
	            {10, 13, 14, 17, 24},
	            {18, 21, 23, 26, 30}
	        };
	}
	
	public static boolean Search(int [][] arr, int item) {
		//ye co-ordinate nikala...r 0 and column last
		int r = 0;
		int c = arr[0].length-1; 
//		row badte-badte length se bhr na jaye...and column kam hote-hote negative na ho
		while(r<arr.length && c >= 0) {
//			yha 3 case ho sakte hai...ya toh equal hoga, ya bada hoga ya chota hoga
			if(arr[r][c] == item) {
				return true;
			}
			else if(arr[r][c] > item) { //data bada hai jise search kar rahe hai toh...
				c--; // column discard kar rahe hai...
			}
			else {
				r++;
			}
		}
		return false;
	}

}
