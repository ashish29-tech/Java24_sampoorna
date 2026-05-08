package Lec_12;

public class Transpose_Array {
// Original array ko change karna hai transpose ke form m
// Original array m change karna hai...new nai bnana and na hi column wise print karna hai
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2D matrix given hai...4 X 4 ka hai...square matrix
//		Is square matrix ka transpose nikalna hai...
		int [] [] arr = { {2, 3, 1, 4}, 
						  {5, 6, 7, 9}, 
						  {8, 12, 11, 10}, 
						  {16, 15, 14, 13} };
		Transpose(arr); //transpose ko calll karenge
//		array ko display karenge toh array transpose hote hue dikhna chahihye
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j<arr[0].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println(); 
		}
	}
	public static void Transpose(int[][] arr) {
		for(int i = 0; i<arr.length; i++) { //row ka loop 0 start ho rha toh 
			for(int j = i+1; j<arr[0].length; j++) { //column ka loop uske just 1 aage se start hoga
//				i,j ko swap karna hai...j,i se
				int temp = arr[i][j];
				arr[i][j] = arr[j][i]; 
				arr[j][i] = temp; //arr of j,i pe temp rakh denge
			}
		}
	}

}
