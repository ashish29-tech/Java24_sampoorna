package Lec_5;

public class Data_type_demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char ch= 'a'; //characters ko single quotes m likhte hai
		//english language m 256 characters hote hai..26 uppercase letters, 26 lowercase letters, digits (0–9), punctuation symbols
		//har character ke corresponding ek numerical value hoti hai jise we call ASCII value
		//java m use Unicode kehte hai
		//Java me char: 16-bit
		//English language ≠ 256 characters

//		ASCII = 7-bit (128 characters)

//		Extended ASCII = 8-bit (256 characters)

//		Java uses Unicode (16-bit char)
		
		char ch= 'a';
		System.out.println((int)(ch)); //typecase kar ke print karenge toh uske corresponding ASCII value aa jayegi
	}	

}
