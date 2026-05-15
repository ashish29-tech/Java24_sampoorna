package Lec_14;

public class Substring_Method {
//	jaise subarray kya tha ? continuous part of array
//	waise hi continuous part of string is substring..
//	abcd string ki substring...a, ab, abc, abcd, b, bc, bcd, c, cd, d....
//	continuous part of string and forward moving character hona chahiye subsstring ke liye.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "codingblocks";
		
//		"ingbloc" ye string nikal ke dena ho toh....3rd index se 9th index tak ka...
//		toh iske liye java m substring method hota hai...iska return type string hota hai..
//		chahe toh var m store kar sakte hai ya fir print kar sakte hai
		System.out.println(s.substring(3, 10)); //beginning index pe 3 bhej diya and ending index pe 9 + 1 ek aage ka index bheja..cuz last wala index include nai karta ye substring method
		System.out.println(s.substring(3)); //3rd index se leke sab print kar deta...
		
		
	}

}
