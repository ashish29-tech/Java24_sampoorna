package Lec_10;

public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,3,4,5,7,9,11,13,14,15,18,20,21}; //total 13 elements
		int item = 13;
		System.out.println(Search(arr, item));
	}
	public static int Search(int []arr, int item){ //ek array given hai and sath m element given hai
		int lo = 0;
//		arr.length elements ki total quantity batata hai, last index nahi. 
//		arr.length = 13 but index 0 se 12 hai...last index 13-1 = 12
		int hi = arr.length-1;
		while(lo<hi) {
			int mid = (lo+hi)/2; //0+12/2 = 6
//			arr[mid] = arr[6] = 11
			if(arr[mid]==item) { //mid agr barabar hai item ke
				return mid; //barabar nikal gya toh yahi se return kar denge
			}
			else if(arr[mid] > item) {
				hi = mid-1; //mid bada hai item se toh mid - 1
			}
			else {
//				lo = 6 + 1 = 7
				lo = mid +1; //agr mid chota hai item se toh mid ko aage kar do
			}
		}
		return -1; //agr data nahi mila toh -1 return kar denge...0 return nahi kar sakte cuz 0 is a valid index
	}

}
