package Lec_14;

public class Unique_Char_String {
//	Pta karna hai string ke andar unique character...kya sare character ek-ek baar aya hai
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "vansh"; //
		System.out.println(Unique(s));
	}
	public static boolean Unique(String s) {
//		kom sa character kitni baar aya hai uske liye frequency array....
//		suppose small abcd hai...upto z tak...
		int [] freq = new int [26]; //26 size ka bna liya
//		har string ki frequency chahiye
//		"abcda" string hai... character "a" ayeag toh ise 0 m convert karna hai...character "b" ko 1 m..."c" ko 2 m..."d" ko 3 m...and "a" ko 0 m..
//		small abcd ki ASCII value 97 hoti hai...toh "a" character - 97 = 0, "b"(98) - 97 = 1, "c"(99) - 97 = 2, "d"(100) - 97 = 3
//		string pe loop laga diya
		for(int i = 0; i<s.length(); i++) { //ek-ek character string ka lenge...
			char ch = s.charAt(i);
//			ch-97 index ka frequency bnana hai...toh ispe jayenge...aur purani wali frequency m add kar denge...
//			freq[ch - 97] = freq[ch - 97] + 1;  explain this line... suppose "abcad" string hai toh pehle 0th index pe khali hoga toh 0 hoga by default...
//			toh a ka 97 hua toh 97-97...0 aya and ye index hai ispe +1 kiya toh 1 rakh diya and then b ke liye 98-97 kiya toh 1 aya means 1st index pe +1 kar diya toh 1 aya
//			and then c ke liye 99-97 kiya toh 2 aya means 2nd index pe +1 kar diya and then a ke liye 97-97 0th index pe +1 kiya toh 2 ho gya cuz pehle se 1 hai and then d ke liye 100-97 3 aya toh 3rd index pe +1 kiya...
//			Jo bhi character mila hai, uske corresponding index pe frequency count 1 se badha do
			freq[ch-97] = freq[ch-97] +1; //isse pta chal jayega...ki har string m kon se character kitni baar aye hai...
		}
//		kisi bhi index pe value ek se jyada baar repeat hai...
		for(int i = 0; i<freq.length; i++) {
			if(freq[i]>1) { //1 se jyada baar hai toh
				return false; //toh yahi se false
			}
		}
		return true; //pura loop chal gya kahi se nai mila false toh mtlb 1 se jyada baar koi character repeat nahi hai...
	}
	
}
