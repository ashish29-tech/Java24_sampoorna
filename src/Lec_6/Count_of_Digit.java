package Lec_6;

public class Count_of_Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//check karna hai no. kitne digit ka hai
		int n = 3898;
		System.out.println(Count(n)); //return karega toh print kar lenge
	}
	
	//ek method bnayenge. Method name is Count. And n ka count karna hai toh int n
	public static int Count(int n) {
		//count kaise karte the ? 3467 ko by 10 karenge toh count 1 and number 346 then 2nd time  toh count 2 and number 34. Then next time by 10 toh number 3 and count 3. Then again by 10 toh number 0 and count 4.
		//while loop se karte the ki jab tak n>0 tab tak and ek count le lete the... n = n/10 and count++
		int c = 0;
		while(n>0) {
			n = n/10;
			c++;
		} 
		return c; //bhr aye toh return kar diya cuz print toh karna nahi hai and upar jake return ho jayega and print ho jayega
	}

}
