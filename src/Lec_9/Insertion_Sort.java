package Lec_9;

public class Insertion_Sort {

	public static void main(String[] args) {
	    int[] arr = {1, 2, 7, 8, 9, 11, 4};
	    sort(arr);
//	    int idx = InsertLastElement(arr, arr.length - 1);
	    for (int i = 0; i < arr.length; i++) {
	        System.out.print(arr[i] + " ");
	        System.out.print(arr[i] + " ");
	    }
//	    System.out.println(idx);
	}
	public static void sort(int[] arr) {
//		start karna hai index 1 se....
		for(int i = 1; i<arr.length; i++) {
			InsertLastElement(arr, i); //shi kar ke dega ek ek kar ke
		}
	}
//	Agr array m 1 element hai toh automatically sorted hua
// 0th index ko manenge sorted hai...and then 1st index bhejenge toh 0th and 1st index m shi kar ke de dega
	public static void InsertLastElement(int[] arr, int i) {
	    int j = i - 1;
	    int item = arr[i];
	    while (j >= 0 && arr[j] > item) {
	        arr[j + 1] = arr[j];
	        arr[j] = item;
	        j--;
	    }
//	    return j + 1;
	}

}
