package Lec_28;
import java.util.Stack;

public class Stack_Java {
//	Stack java wala use karne ja rahe hai
//	LIFO use hota hai...last m jo aya hai pehle wo hi show hoga
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		jaise ArrayList bnate hai waise hi bnayenge
		Stack<Integer> st = new Stack<>(); //new se object banega Stack class ka...and st naam ke reference variable m aa jayega
//		jaise ArrayList m add karte the waise hi yha push method
//		stack m data niche nahi add kar sakte...data top se hi add hoga top se hi delete hoga
//		ArrayList ki trah dynamic hota hai
//		add karne ke liye push method
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60);
		System.out.println(st.peek());//data view/get karna hai toh peek...sabse last m jo aya hai wo view hoga
//		delete ke liye pop
		System.out.println(st.pop());
//		ab dobara view karenge toh 60 jo top pe tha wo delete ho gya hoga
		System.out.println(st.peek());
		System.out.println(st.size()); //60 delete ho gya toh size 5 bacha
//		stack m indexing nahi hoti
//		forEach loop lagayenge
		for(int v : st) { //st naam ke variable pe lagana hai loop...isme int type ka data hai..v variable ka naam hai
			System.out.println(v +" ");
		}
	}

}
