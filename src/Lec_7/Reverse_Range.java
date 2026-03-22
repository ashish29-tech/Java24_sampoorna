package Lec_7;

public class Reverse_Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [] arr = {3, 5, 1, 7, 8, 6, 9, 11, 15, 17, 18, 16, 23, 27}; //7 to 16... i.e 3rd index se 11th index tak range reverse
		int [] arr = {3, 5, 45, 42, 11, 23, 27, 8, 6, 9, 11, 15, 17, 18, 16};
		Reverse(arr, 3, 11); //3rd index se 11th index tak range reverse karna hai
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
			System.out.println(arr[i] + " ");
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void Reverse(int []arr, int i, int j) {
//		i and j pta hai
//		i and j joki 0 and length-1 pe set kar rahe the normal reverse m...wo chiz jo user btayega wha set kar lenge
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

}
