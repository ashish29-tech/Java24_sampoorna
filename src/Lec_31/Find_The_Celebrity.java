package Lec_31;

import java.util.Stack;

public class Find_The_Celebrity {
//	https://leetcode.ca/all/277.html   leetcode premium question. Asked in big techs
//	But we are doing this in a different way
//	Definition of celebrity....Everyone knows celebrity and he don't know anyone. 
//	1 approach hai hamare paas n^2 ka...1-1 bande ko check karenge ki wo celebrity hai ya nahi...toh aise worst case m n^2 ja sakta hai
//	2D matrix pe loop laga ke check kar lenge...isse worst case m n^2 ja sakta hai
//	but hame order of n m karna hai
//	Like Indian Idol m pehle check karte hai...then Mumbai...then eliminate karte hai. This is called Elimination method.
//	Same aise hi karenge...
//	Ye ArrayList se bhi kar sakte hai...Array se bhi. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = { {0, 1, 1, 1},
						 {1, 0, 1, 1},
						 {0, 0, 0, 0},
						 {1, 1, 1, 0} };
		System.out.println(Celebrity(arr));	
	}
	public static int Celebrity(int[][] arr) {
//		stack lete hai
		Stack<Integer> st = new Stack<>();
//		is array pe loop 
		for(int i = 0; i<arr.length; i++) {
//		   har ek bande ko add kar do iske andar...
			st.push(i); //ye celebrity add kar do
		}
//		jab tak stack m ek element na bach jaye tab tak kuch kaam karna tha
		while(st.size()>1) {
//			2 bande nikalo
			int a = st.pop();
			int b = st.pop();
			if(arr[a][b]==1) { // array of a, b agr 1 ke equal hai toh mtlb a b ko janta hai...
//				Mtlb a toh celebrity nahi hi hoga 
//				Toh a ko eliminate karenge and b ko rakh lenge
				st.push(b);
			}
			else { //arr of a,b pe agr 0 aya toh...a b ko nahi janta...toh b celebrity nahi ho sakta and a ho sakta hai
				st.push(a);
			}
		}
//		bahar ayenge toh 1 candidate bachega...
		int candidate = st.pop(); //candidate ko stack se nikala
//		check karenge ki 2 agr kisi ko janta hoga toh wo celebrity nahi banega....
//		2 ke celebrity na banne ka condition check karenge
//		Hum candidate 2 ko har doosre person ke against check karenge.
		for(int i =0; i<arr.length; i++) {
//			agr i ki value candidate ke barabar hai toh kaam nai karna hai continue karna hai
			if(i == candidate) { //Candidate khud ho toh skip
				continue;
			}
//			check karenge ki 2 kahi kisi ko janta toh nahi hai
//			now check karenge 0,2 ki aisa toh nahi 0 nahi janta 2 ko...1 2 ko na janta ho toh 2 celebrity nahi banega...3 2 ko nahi janta ho toh 2 celebrity nahi banega
			if(arr[candidate][i]==1 || arr[i][candidate]==0){ //2nd condition m...i, candidate mtlb i us candidate ko nahi janta hai toh bhi niche -1 return
				return -1; //janta hai toh -1
			}
		}
//	agr upar check kiya ki kahi se aisa possible nahi hai ki candidate celebrity nahi ban sakta toh mtlb yahi candidate celebrity hai
	return candidate;
	}
}
