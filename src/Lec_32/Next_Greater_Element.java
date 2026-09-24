package Lec_32;
import java.util.Stack;

public class Next_Greater_Element {
//	tumhara stack monotonically decreasing values maintain karta hai (bottom → top), because
//	chhote elements current greater element ke aate hi pop ho jaate hain.
//	while dekh ke O(n²) mat samajhna. Har index maximum ek baar push aur ek baar pop hota hai, 
//	isliye total O(n).
//	Complexity: Time  = O(n) , Space = O(n)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {11, 13, 21, 3};
		NGE(arr);
	}
	public static void NGE(int [] arr) {
//		sabse pehle stack lenge
		Stack<Integer> st = new Stack<>();
//		ek answer wala array bna lete hai...Har index ka NGE yahan store hoga
		int [] ans = new int [arr.length];
//		ek loop chala lete hai array ke upar
		for(int i = 0; i<arr.length; i++) {
//			next greater ka concept
//			stack m element ka hona jaruri hai
//			agr hai toh next greater tab banega....jab arr[i]....stack ke peek se bada hoga
//			Current element ko stack ke top wale element se compare karo.
			while(!st.isEmpty() && arr[i]>arr[st.peek()]) { 
//				toh us element ko peek se hta do
				ans[st.pop()] = arr[i];
				
			}
//			agr nahi hai toh
//			stack ke andar elements nahi, unke indices store ho rahe hain
			st.push(i);
		}
		while(!st.isEmpty()) {
//	Array traversal complete hone ke baad, jo indexes stack mein bach gaye hain, unka koi NGE nahi mila
			ans[st.pop()] = -1;
		}
		for(int i = 0; i<ans.length; i++) {
			System.out.println(arr[i]+" "+ans[i]);
		}
	}
}
