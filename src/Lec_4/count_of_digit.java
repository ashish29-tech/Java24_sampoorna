package Lec_4;

public class count_of_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n = 123456789;
//		int count = 0;
//		while(n>0) {
//			n = n / 10;
//			count++; //count karne ke liye counter le liya...c
//		}
//		System.out.println(count); 
		
		//better code cuz handles edge cases..cuz n can be 0 but still it
		int n = 0;
		int count = 0;
		if(n == 0) {
			count = 1;
//			count++;
		} 
		else {
			while(n>0) {
				n = n /10;
				count++;
			}
		}
		System.out.println(count);
		
	}

}
