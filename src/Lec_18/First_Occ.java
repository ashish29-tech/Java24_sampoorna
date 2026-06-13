package Lec_18;

public class First_Occ {
//	Array given hai pta karna hai 4 pehli baar kon se index pe aya tha
//	Ek toh linear search...loop laga denge jaise 4 mil gya return kar denge...if pure array m nahi hoga toh -1 return
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1, 2, 5, 4, 3, 4, 7, 4, 3, 6 };
		int item = 4; //
		System.out.println(Index(arr, item, 0));
//		System.out.println(occ(arr, item));
	}
//	Through linear search
//	Linear search loop mein tum kya kar rahe ho? 
//	Har iteration mein:
//	1. Current index check karte ho.
//	2. Nahi mila toh next index par chale jaate ho.
//	public static int occ(int [] arr, int item) {
//		
//		for(int i = 0; i<arr.length; i++) {
//			if(arr[i]==item) {
//				return i;
//			}
//		}
//		return -1;
//	}
	
//	Through recursions
//	check karenge 0th element item ke barabar hai ?
//	index 1 se start karenge...
//	index, element, array ye chahiye honge...
	public static int Index(int [] arr, int item, int idx) {
//		Base case
//		aisa toh nahi ki index ke akhiri tak ja chuka hai...and call lagte ja rha hai
		if(idx==arr.length) {
			return -1; //toh yahi se return
		}
		
		
		if(arr[idx] == item) {
			return idx;
		}
//		wrna recursion bhai ek kaam kar...is array m isi element ko...idx+1 se dhund ke la...Baaki array mein dhoondo
//		aur jo result dega use as it is return kar denge....
//		Ye Tail recursion hai cuz recursion ke baad kuch nahi ho raha...
		return Index(arr, item, idx+1);
		
		
	}

}
