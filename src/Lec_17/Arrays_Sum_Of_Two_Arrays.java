package Lec_17;
import java.util.*;
// 1/4th syllabus khatm hua yha
//	Recursion ke liye function, strings ki videos revise...
public class Arrays_Sum_Of_Two_Arrays {
//	https://codeskiller.codingblocks.com/problems/931
//	Two arrays given hai and add karna hai and comma separated print karna hai.
//	Constraints: Length of Array should be between 1 and 1000.
//	1000 digit ka no. toh nahi bna sakte...java m max 18 digit ka number long m liya jata hai.
//	Array ka size fix nahi hai..toh n size ka banayenge...array ka size input pe depend karega..
//	jab array ka size kitna ho uspe doubt ho toh ArrayList use karte hai...
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 = {1,0,2,9};
		int [] arr2 = {3,4,5,6,7};
		Sum_Of_Two_Arrays(arr1, arr2);
	}
	public static void Sum_Of_Two_Arrays(int [] arr1, int [] arr2) {
//		-1 isliye kiya cuz Index 3 par value 9 hai (last element).
//		.length - 1 kab use karte hain? Jab last index chahiye.
		int i = arr1.length-1, j= arr2.length-1; //dono pointer ko length -1 pe liya
//		ArrayList bna lete hai integer ka..
		ArrayList<Integer> list = new ArrayList<>();
		int carry = 0; //first time m niche sum/10 means 16/10 = 1 ayega toh carry 1 ho jayega
		while(i>=0 && j>=0) {
//			carry, 1st array and 2nd array ko add karna
			int sum = carry + arr1[i] + arr2[j]; //sabse pehle 0 + 9 + 7 = 16 then 1 + 2 + 6 =9
//			now 16 % 10 = 6. 6 ko add kiya list m
			list.add(sum%10); //list m add karenge...jo sum aya use modulo 10 kar ke
			carry = sum/10; //carry update... isme 16/10 = 1 aa gya carry
			i--;
			j--;
		}
		
//		but if array different size ke hue toh jo pehle khtm hue uske liye
		while(i>=0) {
//			carry and 1st array ko add karna
			int sum = carry + arr1[i]; //
			list.add(sum%10); //list m add karenge...jo sum aya use modulo 10 kar ke
			carry = sum/10; //carry update
			i--;
		}
		while(j >= 0) {
			int sum = carry + arr2[j]; //
			list.add(sum % 10); //list m add karenge...jo sum aya use modulo 10 kar ke
			carry = sum/10; //carry update
			j--;
		}
//		8 7 and 5 4 is case m last m carry 1 bach rha toh upar wale i and j sare condition khtm ho jayenge
//		toh is bache hue carry ke liye
		if(carry!=0) { //if 0 ke barabar nahi hai toh
			list.add(carry); //carry bacha hua hai toh list m carry ko add kar denge
		}
//		now reverse order m print karna hai 
//		ya toh ArrayList ko reverse kar lenge library ka use kar ke...
//		Collections.reverse(list); //list pura reverse ho jayega...iske liye loop for(int k = 0; k<list.size(); k--);
//		ya fir jaise ArrayList m array ko reverse karte hai...dono pointer use kar ke ArrayList ko reverse kar lenge
//		ya for backward direction m ulta print kar lenge
		for(int k = list.size() -1; k>=0; k--) { //size-1 se start kiya loop
			System.out.print(list.get(k) +", ");
		}
		System.out.println("END"); //question m diya hai isliye END bhi print kar liya
	}

}
