package Lec_32;
import java.util.Stack;
// Ye bhi Monotonic Stack approach hai
// https://codeskiller.codingblocks.com/problems/502
// Stock Span mein hume current price arr[i] ke liye:
// Left side mein kitne consecutive days hain jinka price <= arr[i] hai, including current day?

//Ekdum short mein approach...5 steps mein yaad rakho:
// 1. Stack mein indexes store karo.
// 2. Current element se chhote elements ko pop karo.
// 3. Pop karne ke baad stack ka top = nearest previous greater element.
// 4. Agar stack empty: span = i + 1
// 5. Agar stack empty nahi: span = i - st.peek()

//Stock Span mein: Current element → previous greater dhoondh rahe hain.
// Aur previous greater milte hi: Span = current index - previous greater ka index
// Isi wajah se ye solution O(n) hai.
public class Stock_Span {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {30, 35, 40, 38, 35};
		Cal_Span(arr);
	}
	public static void Cal_Span(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int[] ans = new int[arr.length];
		for(int i = 0; i<arr.length; i++) {
//			Agar current price arr[i], stack ke top wale price se greater hai, toh stack ke top ko hata do.
			while(!st.isEmpty() && arr[i] > arr[st.peek()]) {
				st.pop();
			}
//			span calculation
//			agr stack khali nahi hai toh
			if(!st.isEmpty()) {
//				ans of i pe i - st.peek() rakh denge....
				ans[i] = i-st.peek();
			}
//			Agar stack empty hai, iska matlab:
//			Current price se greater koi previous price nahi hai.
//			Toh current day se lekar day 0 tak sab prices <= current price hain.
//			Isliye span: i + 1
			else {
//				ans of i pe i+1 rakh denge
				ans[i] = i+1;
			}
//	Current element ko stack mein daal do, because future elements ke liye ye previous element ban jayega.
			st.push(i);
		}
//		print kar lete hai
		for(int i = 0; i<ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
	}
}
