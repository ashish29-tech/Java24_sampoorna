package Lec_10;

public class Kth_Root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 146;
		int k = 3;
		System.out.println(KthRoot(n, k));
		
	}
	public static int KthRoot(int n, int k) {
		int lo = 1;
		int hi = n;
		int ans = 0;
		while(lo <= hi) {
			int mid = (lo+hi)/2; //146+1 / 2 = 73..... 1+8/2 pe 4 ayega toh....then 5+8/2...6 ayega...then 5+5/2....5
			if(Math.pow(mid, k)<=n) { //73^3 <= 146...aise karte karte 4^3<=146 hoga...6^3<=146 nai hoga...5^3<=146...
				ans = mid; //toh yahi ans ho jayega...4 ko ans manenge...5 ko manenge
//				4 ke case m....4 se pehle wale toh sare hi honge ans na isliye uske aage se dhundenge...5 to 8 ke beech m...
				lo = mid +1; //ans ko maximize karna hai...toh 4 se aage badha denge lo ko...5 ke aage 6 pe le jayenege lo ko toh hi se jyada ho jayega and loop over ho jayega..and ans return ho jayega
				
			}
			else {
				hi = mid - 1; //hi ko kam kiya...6 wale case m hi ko kam kiya toh...lo bhi 5 and hi bhi 5 toh...5 ayega lo+hi/2...
			}
		}
		return ans;
	}

}
