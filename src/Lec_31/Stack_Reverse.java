package Lec_31;
import java.util.*;

public class Stack_Reverse {
// Stack m kuch element given hai hame unhe reverse karna hai...
// Hame reverse karna hai original stack m...original stack ko reverse karna hai
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50); //50 sabse top pe hai
		System.out.println(st);
		Reverse(st);
		System.out.println(st);
	}
	
	public static void Reverse(Stack<Integer> st) {
//		Base case
		if(st.isEmpty()) {
			return;
		}
		int x = st.pop(); //x
		Reverse(st); //stack ke top element ko ek-ek kar ke nikalta hai
//		Jo element nikala tha, usko stack ke bilkul bottom mein insert karta hai.
//		x ko reversed stack ke BOTTOM mein daalo
		Insert(st, x); //x ko insert karna hai
	}
//	Yha insert ka code copy-paste kar diya
	public static void Insert(Stack<Integer> st, int item) {
		if(st.isEmpty()) {
			st.push(item);
			return;
		}
		int x = st.pop(); //top element nikalo 
		Insert(st, item); //item ko recursively bottom mein daalo
		st.push(x); //nikala hua element wapas daal do
	}
}
