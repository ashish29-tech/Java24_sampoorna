package Lec_10;

public class Search_in_Rotated_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {4,5,6,7,0,1,2};
		int item = 0;
		System.out.println(Search(arr,item));
	}
	public static int Search(int[] arr, int item) {
		int lo = 0;
		int hi = arr.length - 1;
		while(lo<=hi) {
			int mid = (lo+hi)/2;
//			0+7 / 2 = 3 aya....means 3rd index ka data item jo ki 0 hai uske barabar hai ya nahi
			if(arr[mid] == item) { //mid item ke barabar hai toh
				return mid; // yahi answer hai yahi se return
			}
//			Binary search lagana hai par sorted nahi hai toh...kis sorted line pe hai pta lagayenge
			//pehle line pta karenge kis line pe hai...
//			7 bada hai agr 0th index ke 4 se toh...upper line pe hai....
			else if(arr[mid] >= arr[lo]) { //array of mid greater than or equal to arr of lo hai toh...
//				upper line pe hai toh check karenge no. upper line wale m hai ya lower wale m
//				kya 0 grater than 4 hai ? No toh upper part m data nai hai... && m first condition galat hota hai toh dusra condition check nahi hota
				if(item>=arr[lo] && arr[mid]>item) { //lo se bada and mid se chota hoga item
//					hi ko change kar dete hai
					hi = mid -1;
				}
				else { //
					lo = mid +1; // lo chala gya 4th index pe
				}
			}
			else { //lower line pe hai
				if(item<=arr[hi] && arr[mid]<item) { //right se chota and mid se bada hoga item
					lo = mid+1;
				}
				else {
					hi = mid-1;
				}
				
			}
		}
		return -1;
	}

}
