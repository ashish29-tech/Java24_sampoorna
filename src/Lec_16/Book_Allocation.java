package Lec_16;

public class Book_Allocation {
//	https://codeskiller.codingblocks.com/problems/1365
//	Is question ke jaisa painter partition, murthal parantha
	
//	Time complexity
//	Binary search array indices par nahi chal rahi, balki answer space par chal rahi hai (0 se sum tak).
//	O(n log s) 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] books = {10, 20, 30, 40};
		int nos = 2;
		System.out.println(Minimum_Page_Limit(books, nos));
	}
	public static int Minimum_Page_Limit(int [] books, int nos) {
		int lo = 0;
		int hi = 0;
		int ans = 0;
//		hi ke liye array ka sum karenge...
//		for each loop.... value pe chalta hai
		for(int v: books) {
			hi +=v; //pure array ka sum aa jayega...100 aa jayega
		}
		while(lo<=hi) {
			int mid = (lo+hi)/2; //mid nikala. First time mid 50 ayega...
			if(isitpossible(books, nos, mid)==true) {//books, nos, mid/page limit iske true ana chahiye
				ans = mid; 
				hi = mid-1;//minimise karna hai ans isliye peech kar ke dekhenge hi
			}
			else {
				lo = mid + 1;
			}
		}
		return ans; //ans m jo tha wo return kar diya and upar print kar liya
	}
	public static boolean isitpossible(int[] books, int nos, int mid) {
		// TODO Auto-generated method stub
		int student = 1; //student count 1 se liya hai
		int readpage = 0; //iska readpage initially 0 hoga...
//		books ke upar loop
		for(int i = 0; i<books.length; ) { //i++ nahi karenge...
//			1st student ne pehle se kitna page read kiya hai + ye wali books ka sum less than equal to mid hoga
//			tabhi ye read karega else nahi karega.... sabse pehle 0 + 10 and mid sabse pehle <=50
//			readpage badha denge....ab aage isse aur read karwana hai
			if(readpage+books[i]<=mid) {
				readpage +=books[i]; //readpage m current page add kar denge
				i++;
			}
			else {
				student++; //wrna student ka count badhayenge...
				readpage = 0; //readpage 0 kar ke reset kar diya
			}
			if(student>nos) { //student hi number of student se jyada nikal jaye toh...
				return false; //
			}
		}
		return true; 
	}
}
