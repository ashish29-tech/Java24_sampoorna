package Lec_25;

public class Partition_in_Array {
//	Lomuto partition
//	Approach: Last element ko pivot/item maan kar usko uski correct position par rakhna, aur usse
//	chhote/equal elements ko left side aur bade elements ko right side mein rakhna.
//	Important: Array sort nahi hota. Sirf pivot/item ki position correct hoti hai.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ye array m...last element kuch bhi ho sakta hai...yha 4 hai. item = 4
//		is 4 ko is tarike se shi karna hai ki 4 se smaller sare elements 4 ke left m aa jaye and 4 se bade elements 4 ke right m aa jaye
//		jaruri nahi ki array sort ho...
//		Iski complexity o(n) chahiye...
//		2 chiz karni hai...4 ki correct position btani hai kon se index pe gya hai...and 4 ko wha dalna bhi hai...
//		array m bhi changes karne hai ki 4 se chote sare data left m chale jaye and 4 se bade right m
//		linear time m karna hai...array ko sort kar de...arrays.sort karenge toh n log n...but ye nahi karna...linear time m karna hai
//		n^2 n square m karenge ham
		
//		is question m toh 4 ko shi karna hai pta hai...but questions aise bhi ho sakta hai ki user input index dega us element ko shi karna hoga.
//		us index ke data ko swap kar ke last pe le jayenge baki code same rahega..
		
//		start index 5 pe and 3 pe end index -1 hai...toh agr 5 se 3 ke beech nahi mila 4 ka correct position toh maan lenge 4 jha hai shi hai.
//		shuru m 5 hai and jisko shi karna hai wo 4 hai...isse problem nahi hai cuz future m 5 ko right side m kar denge and 4 ko left side m...swapping kar denge.
//		now 7 ke liye bhi koi dikkat nahi hai cuz maan ke chal rahe hai ki 5 ki jgah 5 aa gya toh 4 ke right m ab 7 hai...and bade walo ko toh ham right m hi chahte hai...
//		item se bade data se dikkat nahi hai chote se dikkat hai...
//		now 2 pe ate hai...agr future m shuru m 5 ki jgah 4 aa gya and 2 joki 7 ke baad hai toh dikkat hogi
		int [] arr = {5, 7, 2, 1, 8, 3, 4};
		System.out.println(Partition(arr, 0, arr.length - 1)); //array m change bhi karega and index bhi print kar ke dega
//		Array ko print kar ke bhi dekh lete hai
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " "); //ans m 3rd position pe bhi aya and changes bhi ho gaye
		}
	}
//	i = current element ko check karne wala pointer
//	idx = next smaller/equal element ko rakhne ki position
//	idx = 3 ka matlab: Ab tak 3 smaller/equal elements mil chuke hain, isliye pivot/item ko index 3 par rakhna hai.
//	Array ko ek hi baar traverse kar rahe ho: Isliye Time Complexity = O(n)
	public static int Partition(int[] arr, int si, int ei) { //si = 0 and ei = 6
		int item = arr[ei]; //item(4) yaad kar lete hai jo shi karna hai...ei 6 hai and 6th index pe 4 hai toh item m 4 aa jayega
		int idx = si; //aur uska index bhi...start 0 hoga
//		har ek index ke liye try karna hai toh loop lagega
//		maan ke chal rahe hai ki 4 jo ayega wo 0th means start pe ayega  
//		
		for(int i = si; i<ei; i++) { // start se leke end ke pehle tak jana hai end tak nahi jana hai
//			apne se chote data se dikkat hai
			if(arr[i]<=item) { //sabse pehle 5<=4 toh mtlb false toh kuch nahi karna...then i = 1(1st index pe 7 hai) yha bhi kuch nahi karna...then i =2(2nd index pe 2 hai..joki chota hai 4 se) 
//				i and idx ko swap kar rahe the
				int temp = arr[i];
				arr[i] = arr[idx];
				arr [idx] = temp;
				idx++;
			}
		}
//		loop ke bahar bhi yahi karna hai
//		jo final   
		int temp = arr[ei];
		arr[ei] = arr[idx];
		arr[idx]= temp;
		return idx; //3
		
	}
}
