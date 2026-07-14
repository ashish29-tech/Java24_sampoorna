package Lec_23;

import java.util.*;
//	https://chatgpt.com/share/6a56159d-b990-83ee-b680-9c80e8a0d835
public class Combination_Sum_Leetcode {
//	https://leetcode.com/problems/combination-sum/description/
//	question m print ki jagah 2D list m manga gya hai 
//	2D list m convert karna hai toh 3 steps follow karna padega
//	agr 1D list m chahiye hota toh sare ans ko 1D list m add kar lete
//	but yha ans ko bhi list m manga gya hai...string nahi manga gya hai
//	3 steps: string ko 1D list se replace kiya...integer ka bnaya
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] coin = {1, 2, 3};
		int amount = 5;
//		integer ka bnaya 
		List<Integer> ll = new ArrayList<Integer>(); //ye right hand side m Integer likhna madatory nahi hai
//		step 2...1 2D list bna ke pass kar do
//		sara ans 2D list m chahiye toh 2D list pass kar do
		List<List<Integer>> ans = new ArrayList<>();
		Combination(coin, amount, ll, 0, ans);//yha string ki jgah 1D list pass karenge
//		jo ham backtrack kar rahe hai..same list add kar rahe hai and usi list m backtrack kar rahe hai wo line problem kar rahi hai
		System.out.println(ans); //2D list print...but ye sara khali print hoga...cuz list ka reference add hota hai and ham same list add kar rahe hai baar baar 
	}
//	yha capture kar liya 1D list ko 
	public static void Combination(int [] coin, int amount, List<Integer> ll, int idx, List<List<Integer>> ans) {
		if(amount == 0) {
//			System.out.println(ll); //arrayList print kar diya
//			1D list ko 2D list m add kar lete hai
//			ans.add(ll);
//			3rd step: jab ans ban raha hai toh ek new list m iska data copy kar ke new list ka address add karo
			ans.add(new ArrayList<>(ll)); //new arrayList m ll pass kar do...isse ek new arrayList create hogi and ll ka sara data isme copy ho jayega and new list ka address ayega
			return;
		}
		for(int i = idx; i<coin.length; i++) {
			if(amount >= coin[i]) {
//				yha 1D list pass karenge...jaise string m add kar lete the toh string + string...string milta tha
//				yha add karenge...add function ka return type boolean hai...but ye error dega cuz return type boolean hai and upar argument m ek list ka address chahiye hoga recursion m...
//				Combination(coin, amount - coin[i], ll.add(coin[i]) + coin[i], i);
//				wo line yha likhenge
				ll.add(coin[i]); //niche call lagane se pehle koi chiz list m add kar rahe hai...recursion undo nahi kar sakta khud se hame karna hoga toh backtracking ka question ho gya 
//				isliye yha sirf ll likhenge
				Combination(coin, amount - coin[i], ll, i, ans);
//				
				ll.remove(ll.size()-1);
			}
		}
	}
}
