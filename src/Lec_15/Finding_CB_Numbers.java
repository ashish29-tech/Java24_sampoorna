package Lec_15;
//	Time complexity of this code: O(n2)×O(n)=O(n3) 
//	“Nested loops give O(n²), but string operations inside push it to O(n³)” 
public class Finding_CB_Numbers {
//	https://codeskiller.codingblocks.com/problems/165
//	we'll be given numeric string...number wala string given hoga...number wale string ki length 17 digit tak ho sakti hai
//	Toh ham jo bhi code karenge long mante hue karenge...input jo milega long ki range m milega 17 digit ka...
	
	
//	is question ko karne ke liye kai chize seekh rahe hai ham
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = "81615"; //2 cb no. banne chahiye
		String str = "127";
		System.out.println(CountCBnumber(str));
	}
	public static int CountCBnumber(String s) {
//		pehle ke character like 127 m 2 and 7 ban gya toh 127 nahi banega cuz 2 and 7 involve hai pehle se....
//		toh check karne ke liye ek boolean ka array banayenge...koi cb number ayega toh check karenge loop lagakar ki kisi index pe true rakha hai toh cb no. nahi hai
//		aur cb no. nahi hai toh mark kar dete ki nahi hai...ex: 8161 agr ban gya cb no. toh 161 ya 61 na bane cb no. iske liye karenge ye sab
//		appraoch ye rakhenge ham...jitni string ki length hai..utni length ka ek boolean array bnayenge jo har character ka visited ka track rakhega...
		boolean [] visited = new boolean[s.length()]; //This tracks: “ye index already kisi CB number me use ho chuka hai kya?”
		
//		length wise Substring kar rahe hai cuz isse maximum cb number ayega
		int c = 0;
		for(int len = 1; len<=s.length(); len++) {
			for(int j = len; j<=s.length(); j++) {
				int i = j - len;
//				i,j ka mtlb i se leke j-1 tak ke character ka cuz java m last 
				String str = s.substring(i,j); //store kar liya....number m convert...aur wo bhi number kaisa...long cuz string ki length hogi 17 digit ki
				long num = Long.parseLong(str); //Convert substring → number
//				check karenge kya ye cb number hai...
//				agr koi bhi character visited hai...
				if(IscbNumber(num) && isVisited(visited, i, j-1)) { // == kar ke true bhi likh sakte hai but this is optional
//					ek loop chalayenge i se leke j-1 tak ka..use mark karenge ki cb no. na banaye..
//					If valid → mark visited....mtlb ye substring select ho gaya...ab iske characters future me use nahi honge
					for(int k = i; k<= j-1; k++) {
						visited[k]= true; //mark kar denge true taki kisi aur ke sath cb no. na banaye...
					}
					c++;
				}
			}
		}
		return c;
	}
//	check karne wala code...i se leke j m check karenge kisi index pe true fill hai kya ?
	public static boolean isVisited(boolean [] visited, int i, int j) {
		for(int k = i; k<=j; k++) {
			if(visited[k] == true) { //agr true hai
				return false; //toh wahi se return
			}
		}
		return true; //true aa gya last m toh mtlb true fill nahi hai i se leke j tak ke index m...
	}
//	CB number check means: 0 and 1 reject...if divisible by {2,3,5,7,11,13,17,19,23,29} → reject...otherwise accept
	public static boolean IscbNumber(long num) { //num pass kiya
//		check ye tha ki agr ye number 0 ya 1 hai toh cb number nahi hoga
		if(num == 0 || num ==1) {
			return false; 
		}
		int [] arr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29}; //array m store kar liya
		for(int i = 0; i<arr.length; i++) { //arr pe loop laga diya. size 10 hai array ka toh 0-9 jayega isliye = nahi lagaya condition m
//			agr inme se kisi ke bhi barabar nikal gya toh cb number hai
			if(arr[i]==num) {
				return true; 
			}
		}
		for(int i = 0; i<arr.length; i++) {
			if(num%arr[i]==0) { //agr list m ke no. m se divide ho gya and renainder 0 aa gya toh cb no. nahi hai
				return false;
			}
		}
//		and kuch bhi nai pta chala toh mtlb cb number 
		return true;
	}
}
