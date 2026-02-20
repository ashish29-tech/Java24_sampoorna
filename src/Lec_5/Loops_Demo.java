package Lec_5;

public class Loops_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(byte b = 0; b < 128; b++) {
//			System.out.println(b); //this is infinite loop
//			//-ve hote hi wapis se 0 se start ho gya
//			//0 se leke 127 tak toh thik hai uske baad...
//			//aise chal rha hai b = byte(b+1)...127+1 ke time pe 128 ko byte m rakhenge toh typecast hoke -128 ban jayega
//			//then b -128 ban jayega and then phir condition aage check hogi -128 < 128... then -127<128...and so on isliye infinite loop chalta rahega
//			
//		}
			//abhi bhi infinite loop chalega...
		//jaise hi 127 ke baad b++ hoga toh -128 ban jayeag then condition check..-128 < -128
//			for(byte b = 0; b <= 127; b++) {
//				System.out.println(b);
//			}
		
		//ab 126 tak chalega
		for(byte b = 0; b < 127; b++) {
			System.out.println(b);
		}
		
	}

}
