package Lec_9;

public class Selection_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {4, -1, 5, 3, 2, 1, 7};
		sort(arr);
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println(min_form_ith_index(arr, 2)); //array liya hai and index pass kiya hai
	}
	public static void sort(int[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			int idx = min_form_ith_index(arr, i);//har baar ek index leke aa....
//			ek baar i =0 ke liye layega...toh swap kar denge
			int temp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = temp;
		}
	}
	
	public static int min_form_ith_index(int [] arr, int i) {
		int mini = i;
		for(int j = i+1; j<arr.length-1; j++) { //i+1 se start hoga cux i ko toh sabse chota maan ke chal rahe hai
			if(arr[j] < arr[mini]) { //current wale m value choti hai toh jo pehle se minimum maan rakha tha use change kar do...
				mini = j; 
			}
		}
		return mini;
	}
}
