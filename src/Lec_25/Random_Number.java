package Lec_25;
import java.util.*;

public class Random_Number {
// 10 Random number generate karne hai b/w 10 and 100
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int si = 10;
		int ei = 100;
//		Java ne hame random class di hai 
//		Random class ka variable banayenge jaise scanner class ka variable bnate hai
		Random rn = new Random(); //
//		hame 10 random number chahiye
		for(int i = 0; i<10; i++) {
//			nextInt function hota hai... 0 se leke 90 tak ka koi bhi no. v m dal ke de dega but hamara question toh 10 to 100 hai na
//			toh agr ham lower end pe 10 add kar de and upper end m bhi 10 toh 10 se 100 ke beech random no. dene lagega
//			sabse pehle range jo given hai usme count nikalenge kitne hai... ei-si+1 
//			jo bhi no. dega usme si means 10 add kar rahe hai toh ab 10 se 100 ke beech m aa jayega..
			int v = rn.nextInt(ei-si+1)+si; //bracket m bound hai mtlb hamare paas kitne no. hai... hamare paas total 91 no. hai
			System.out.println(v);
			
		}
	}


}
