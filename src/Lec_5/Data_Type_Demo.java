package Lec_5;

public class Data_Type_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//coding m byte and short use nahi hote
//		byte b = 7; //b ka data type byte hai 
		//ye range se bhr ja rha hai cuz byte ki range -129 to 127 hoti hai...and store karna hi hai toh 189 ka data ko change karna hoga toh typecast karenge...
//		byte b = 189;
//		byte b = (byte) (189); //typecast kar diya
//		System.out.println(b); // -67 ayega. Kaise ? 189 ka binary(10111101) dekh and usme phir 1's complement kiya and then 1 add kiya and then 2 ki powers lagayenge...2^6 + 2^1 + 2^0 = 64 + 2 + 1 = 67 and 1 tha binary m toh -ve number hai toh - m aa gaya 67.
		
		byte b = (byte) (420);
		System.out.println(b);
		short s = 67; //s ka data type short
		// int and long hi use hote hai
		int i = 89; //i ka data type integer hai
		long l = 79; // l ka data type long hai
		//ye upar m jitne numbers hai sare data type ke samne ise literal kehte hai  
		//and is literal ka type integer
		i = b;
	}

}
