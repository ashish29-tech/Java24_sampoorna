package Lec_25;
import java.util.*;

public class OTP_Generate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int si = 0;
//		int ei = 9;
//		Random rn = new Random();
//		for(int i = 0; i<6; i++) { //6 digit ka chahiye isliye i<6
//			int v = rn.nextInt(ei-si+1)+si;
//			System.out.print(v);
//		}
		char [] arr = {'a','b','c','d','e','f','g','h','i','j','k','l',
				'm','n','o','p','q','r','s','t','u','v','w','x','y','z',
				'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		int si = 0;
		int ei = 35; // 26(a to z) + 10(0 to 9) = 36 elements, last index = 35
		Random rn = new Random();
		for(int i = 0; i<6; i++) {
			int v = rn.nextInt(ei-si+1)+si;
			System.out.print(arr[v]);
		}
	}

}
