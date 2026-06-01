package Lec_17;
import java.util.*;

public class Kartik_Bhaiya_And_Strings {
//	https://codeskiller.codingblocks.com/problems/446
//	Hume maximum length ka aisa substring chahiye jise at most 
//	k characters flip karke pura same character bana sake.
//	Is question mein hum Sliding Window + Two Pointer approach use kar rahe hain.
//	Logic : Window ke andar jitne characters flip karne padenge unki count (flip) maintain karo. 
//	Agar count k se zyada ho jaye to left se window shrink karo. Har valid window ka maximum length answer mein store karte jao.
	
//	Time Complexity: Each pointer moves at most n times. si → n moves and ei → n moves


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		String s = sc.next();
//		Maybe making all 'a' gives better answer.
//		Maybe making all 'b' gives better answer.
//		So we compute both.
//		"Mujhe longest window do jisme at most k 'a' ho.".... Kyuki un 'a' ko flip karke pura substring 'b' bana sakte hain.
		int flipa = maximum_length(s,k,'a'); //string bheja, k bheja and character 'a' flip karna hai 
//		"Mujhe longest window do jisme at most k 'b' ho." Kyuki un 'b' ko flip karke pura substring 'a' bana sakte hain.
		int flipb = maximum_length(s,k,'b');
//		dono ka max length
		System.out.println(Math.max(flipa, flipb)); //Phir dono answers ka maximum le lete hain.
	}
	public static int maximum_length(String s, int k, char ch) {
		int si=0, ei=0, flip=0, ans=0; //ye sab 0 pe le liya pehle
		while(ei<s.length()) {
			//window grow
//			Agar current character wahi hai jise flip karna padega (ch) to flip count badha do.
//			ei hi kyu liya? Kyuki ei window ko grow kar raha hai. 
//			Har iteration mein hum ek naya character window ke andar add karte hain:Jab ei aage badhta hai, to naya character window mein enter karta hai.
//			Isliye hume check karna padta hai ki jo naya add hua character hai wo ch hai ya nahi.
			if(s.charAt(ei)== ch) { //end se check karna hai grow m and shrink ko start se
				flip++;
			}
			//shrink
//			Agar jo character remove kar rahe hain woh bhi 
//			flip-count mein contribute kar raha tha to flip count kam kar do.
			while(flip>k && si<=ei) { //flip grater than k hai and si is less than or equal to ei hai toh
				if(s.charAt(si)== ch) { //si == ch hai toh 
					flip--;
				}
				si++;
			}
			//ans calculate
//			Current window ka size nikal ke maximum store kar lo.
			ans = Math.max(ans, ei-si+1);
			ei++;
		}
		return ans;
	}

}
