package Lec_28;

// Stack jo hamne class bnai uska object bnaya yha
public class Stack_Client {
// Ham chahte hai...jab ham apna bna rahe hai Stack toh hamara pop, peek chale
// Stack class banayenge...taki kal ko koi hamari Stack class use kar sake
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Stack st = new Stack(); //jis constructor m int n parameter wha kuch paas karenge toh yha ayega
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st.pop());
		st.Display();
		System.out.println(st.peek());
		st.push(60);
		st.Display();
//		st.push(70);
	}

}
