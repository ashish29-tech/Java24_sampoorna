package Lec_7;

public class Arrays_Max_Val {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2, 3, 5, 1, 4, 11, 40, 51, 1, 15};
		System.out.println(max(arr));
	}
	public static int max(int [] arr) {
		int curr = arr[0]; //assume first element is max
		for(int i = 1; i<arr.length; i++) { //Start loop from 1 (since 0 already used):
			
			if(arr[i] > curr ) { //agr arr of i bada hai curr se
				curr = arr[i]; // toh arr of i ko curr m dal do
			}
		}
		return curr;
	}
	

}
