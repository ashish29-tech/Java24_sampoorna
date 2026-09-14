package Lec_31;
import java.util.Stack;

public class Valid_Parentheses {
//https://leetcode.com/problems/valid-parentheses/description/
//	open bracket mil rha hai toh baad m kahi close bracket mil gya toh baat ban jayega
//	and agr close bracket mil gya toh...uske liye pehle se open ka hona jaruri hai
//	koi bhi open bracket mil gya toh use stack m dal do...iska corresponding close bracket future m dekhenge
//	and close mila toh peeche se dekhenge...last wala open jo hoga usse check karenge
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "()[]{}";
		System.out.println(isValid1(s));
	}
	public static boolean isValid1(String s) {
//		stack bnayenge character ka
		Stack<Character> st = new Stack<>();
		for(int i = 0; i<s.length(); i++) {
			char ch = s.charAt(i); //pehle character nikala
			if(ch=='(' || ch=='[' || ch=='{') { //in teeno m se kisi se bhi match kar gya toh stack m jayega character
				st.push(ch);
			}
			else { //close hai toh else m
//				isme bhi sabse pehle check karenge ki agr stack hi khali hai mtlb open hai hi nahi pehle se toh return
				if(st.isEmpty()) {
					return false;
				}
				else if(ch==')') {
					if(st.peek() !='(') { //agr stack ke peek pe ( ye wala bracket nahi hai toh
						return false; //toh return false
					}
				}
				else if(ch==']') {
					if(st.peek()!='[') { //agr stack ke peek pe [ ye wala bracket nahi hai toh
						return false; //toh return false
					}
				}
				else if(ch=='}') {
					if(st.peek()!='{') { //agr stack ke peek pe { ye wala bracket nahi hai toh
						return false; //toh return false
					}
				}
//				upar verify kar liya agr sab mil gaye toh...pop kar do
				st.pop();
			}
		}
//		loop se bahar nikle and now check agr stack m element bacha hai toh return false...nahi bacha hoga toh true
//		isEmpty btayega true hai ya false...
		return st.isEmpty();
	}
}
