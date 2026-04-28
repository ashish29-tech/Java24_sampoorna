package Lec_8;

public class Reverse_Algo_RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1, 2, 3, 4, 5, 6, 7};
		int k = 3;
		Rotate(arr,k);
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void Rotate(int[] arr, int k) {
		int n = arr.length;
		k = k%n;
		//Reverse starting ke n-k element
		Reverse(arr, 0, n-k-1); // n-k-1 = 7-3-1 = 3rd index....toh 0,1,2,3 index reverse ho gaye
		
		//last ke k element reverse
		Reverse(arr, n-k, n-1); //n-k means 7-3 = 4th index se se n-1 means 7-1 = 6th index tak reverse kar diya
		
		//all element reverse
		Reverse(arr, 0, n-1); // n-1 = 7
	}
	
	public static void Reverse(int arr [], int i, int j) {
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

}
