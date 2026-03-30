package Lec_9;

public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {4,5,3,2,1};
		sort(arr);
//		array display
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void sort(int [] arr) {
//		ek var le lete hai jo ki n-1 times chalega
		for(int turn =1; turn < arr.length ; turn++) {
//			har turn m kya kaam karna hai
			for(int i= 0; i< arr.length-turn ; i++) { //array length 5 hai toh 3 baar chal rha first time..0 se 3 tak
				if(arr[i]>arr[i+1]) { //current element aage wale element se bada ho toh swap
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
	}

}
