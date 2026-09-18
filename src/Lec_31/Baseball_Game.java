package Lec_31;
import java.util.Stack;

public class Baseball_Game {
//	https://leetcode.com/problems/baseball-game/description/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] arr = {"5", "-2", "4", "C", "D", "9", "+", "+"};
		System.out.println(callPoints(arr));
	}
	public static int callPoints(String [] arr) {
//		leetcode pe string ka array hai but yha ham integer ka stack bna rahe hai
// 		LeetCode par operations string array ke form me diye gaye hain,
// 		lekin record ke scores ko store karne ke liye integer stack use kar rahe hain.
		Stack<Integer> st = new Stack<>();
//		sabse pehle string pe loop
		for(int i = 0; i<arr.length; i++) {
//			a.equals(b) ye check karta hai ki dono strings ke andar same characters hain ya nahi.
//			string hai toh number m convert kar rahe hai
//			== double equal to check nahi laga sakte...cuz .equals se string ka content compare karna hai
//			arr[i] ke andar jo text hai, kya woh "D" ke same hai?
			if(arr[i].equals("D")) { //agr hai toh
//				purane record ko double karna tha
//				toh pehle view karenge purana record kya hai
				int x = st.peek();
//				and stack m push kar diya 2*x kar ke
				st.push(2*x);
			}
//			ya kya ye record C hai
			else if(arr[i].equals("C")){
//				agr C hai toh pop karenge cuz ye invalid data tha
				st.pop();
			}
//			ya kya ye record + sign hai
			else if(arr[i].equals("+")) {
//				a nikalo
				int a = st.pop();
//				phir b nikalo
				int b = st.pop();
//				phir c nikalo
				int c = a+b;
//				stack m pehle b dalenge then a then c
				st.push(b);
				st.push(a);
				st.push(c);
			}
//			// Agar numeric value hai, toh String ko int mein convert karke stack mein push karenge.
//			last m agr numeric value hai toh stack m push karenge integer m typecast kar ke push karenge...
			else {
				st.push(Integer.parseInt(arr[i]));
			}
		}
//		ab sum karna hoga
		int sum = 0; //starting se total sum 0 rakha
//		stack m for each loop lag jata hai
//		Stack ke andar jo bhi elements hain, unko ek-ek karke x mein le aao.
		for(int x:st) {
			sum += x;
		}
		return sum;
	}
}
