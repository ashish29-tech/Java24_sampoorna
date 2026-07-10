package Lec_21;

public class Coin_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] coin = {1, 2, 3};
		int amount = 5;
		Combination(coin, amount, "", 0); //yha se 0 pass kiya
	}
	public static void Combination(int [] coin, int amount, String ans, int idx) { //int idx 0 hoga upar pass kiya 
		if(amount == 0) {
			System.out.println(ans);
			return; 
		}
//		loop idx se chalega...means i = 0 se chalega. coin[0]=1, coin[1]=2, coin[2]=3
		for(int i = idx; i<coin.length; i++) {
//			condition laga denge call tabhi lagega jab
			if(amount>=coin[i]) {
//				coin pick kiya, jis coin pe call lagayenge utne se amount - kar denge means jo coin pick kiya utn se amount kam kar denge and usi chiz ko string m add kar denge...
//				Last m i pass karne ka reason same coin ko dobara use karna aur duplicate combinations ko avoid karna hai.
				Combination(coin, amount-coin[i], ans+coin[i], i); //is coin ko dobara pick kar rahe hai isliye i+1 ki jagah i
			}
		}
	}
}
//Rule yaad rakho
//i pass karo → same coin ko unlimited baar use kar sakte ho (Coin Combination / Unbounded Coin Change).
//i + 1 pass karo → ek coin sirf ek baar use hoga.
//0 pass karo → har recursive call me sabhi coins dobara available honge, jis se permutations (jaise 23 aur 32 dono) bhi aa sakte hain.
//
//Is code me i isliye pass kiya gaya hai taaki:
//
//Ek hi coin ko multiple times use kar sake.
//Duplicate combinations (23 aur 32) na aaye.