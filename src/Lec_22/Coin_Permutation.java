package Lec_22;

public class Coin_Permutation {
//Approach: Coin wale array pe loop laga dena hai...jaise boardpath m ham loop laga rahe the. 
//condition aa jayega...call tabhi jayega amount >= coin(i) 
//call m array wahi rahega...amount utne se kam kar denge...jo coin pick kar rahe hai...string m add kar lenge ans ko
//isse related 4-5 question leetcode ke...denge bhaiya
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] coin = {1, 2, 3};
		int amount = 5;
		Permutation(coin, amount, "");
	}
//	isme backtracking nahi lagega cuz hamne aisa koi kaam nahi kiya jise recursion undo nahi kar payega...
//	jo bhi change hamne kiya hai wo argument m kiya hai ans argument m kiye hue change apne aap undo hota hai...
	public static void Permutation(int [] coin, int amount, String ans) {
		if(amount == 0) {
			System.out.println(ans);
			return;
		}
		
		for(int i = 0; i<coin.length; i++) {
//			condition laga denge call tabhi lagega jab
			if(amount>=coin[i]) {
//				coin pick kiya, jis coin pe call lagayenge utne se amount - kar denge means jo coin pick kiya utn se amount kam kar denge and usi chiz ko string m add kar denge...
				Permutation(coin, amount-coin[i], ans+coin[i]);
			}
		}
	}
}
