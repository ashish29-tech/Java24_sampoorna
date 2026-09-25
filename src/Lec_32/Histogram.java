package Lec_32;
import java.util.Stack;

public class Histogram {
// https://leetcode.com/problems/largest-rectangle-in-histogram/
//	Time complexity...O(n). Because every index is: pushed into stack once, popped from stack at most once
//	For n elements: n pushes + n pops ...... ≈ 2n

//	Humein histogram ke andar largest possible rectangle ka area find karna hai.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2, 1, 5, 6, 2, 3};
		System.out.println(Largest_Rectangle(arr));
	}
	public static int Largest_Rectangle(int [] arr) {
		Stack<Integer> st = new Stack<>();
		int area = 0; //area naam ka variable 0 bna diya
		for(int i = 0; i<arr.length; i++) {
//			Current bar stack ke top wale bar se chhoti hai, toh top wale 
//			bar ka rectangle ab aur right nahi ja sakta.
			while(!st.isEmpty() && arr[i] < arr[st.peek()]) {
//				height nikal lete hai
				int h = arr[st.pop()];
				int r = i; //right boundary 
//				2 tarike se formula niklega....
//				stack khali nahi hai toh
//				left boundary
				if(!st.isEmpty()) {
					int l = st.peek();
					area = Math.max(area, h*(r-l-1));
				}
//				jab khali hai stacks toh
				else {
//					Why h*r? Because if stack is empty after popping, there is no smaller element on the left.
//					So this bar can extend all the way from index 0.
					area = Math.max(area, h*r);
				}
			}
			st.push(i);
		}
//		jo data bach gya stack m uski calculation....un sabke liye r....arr.length maan lenge
//		r ko fix kiya...
		int r = arr.length;
		while(!st.isEmpty()) {
			int h = arr[st.pop()];
			
			if(!st.isEmpty()) {
				int l = st.peek();
				area = Math.max(area, h*(r-l-1));
			}
			else {
				area = Math.max(area, h*r);
			}
		}
		return area;
	}
}
