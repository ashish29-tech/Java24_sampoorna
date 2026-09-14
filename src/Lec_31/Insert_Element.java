package Lec_31;
import java.util.Stack;

public class Insert_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ek stack bna hua hai pehle se...here we are using java wala stack
//		stack ke bottom m 7 insert karna chahte hai...bottom m. 
//		Push method toh top m add kar dega 
//		Extra stack use nahi karna hai
//		Stack m sirf hamare paas top ka access hota hai baki koi aur access hota hi nahi hai...
//		Stack m indexing bhi nahi hoti toh mid kaise niklega ? without using any other data structure
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		Insert(st, 7);
		System.out.println(st);
	}
	
//	ham jo stack khali karenge so that 7 aa sake bottom m...wo khali recursion se karenge
//	stack se data nikal kar recursive call laga rahe hai...wapis ate waqt jo data nikale the usi ko add 
//	karte chale gaye stacks m...
//	Agr mid nikalna hota toh...aise hi mid nikal lenge...count ki value stack by 2 ho gayi toh ruk jayenge...mid element mil gya.
//	Java ne diya hai top pe add karne ka push method
//	ye stack ke bottom m add karne ka insert method hamne banaya 
	public static void Insert(Stack<Integer> st, int item) {
//		Base case
		if(st.isEmpty()) {
			st.push(item); //stack m element ko push kiya
			return; //and return kar denge
		}
		
		int x = st.pop(); //ek element pehle nikal liya
//		phir insert ka call lagaya
		Insert(st, item);
		st.push(x); //wapis ate waqt add kar diya..
	}

}
