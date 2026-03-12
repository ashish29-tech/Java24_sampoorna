package Lec_6;
import java.util.*;
public class Boston_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(IsBostonNum(n));
		
	}
	public static int IsBostonNum(int n) {
		//sum nikal ke yaad kar lete hai...378 ka. Niche function m sum nikala and store kar liya 
//		int sum_digit = Sumofdigit(22) then Sumofdigit(22) executes and return 4. so sum_digit m 4 aa jayega
		int sum_digit = Sumofdigit(n); //yha 4 aa gya toh use sum_digit m dal diya...
		//prime factor nikalne ka logic
		int sum = 0; //this will store sum of prime factors
		int i = 2;
		while(i <= n) { // 2 <= 22
			if(n % i == 0) { //n 22 hai and i 2 toh 22 % 2 = 0....then 11 % 11(2 ke baad 3,4,5....11 pe chalega)
//				first time 2 pass kar denge Sumofdigit(2) m toh sum m 2 ho jayeaga
//				sum = 0 + 2 then 11 % 11 = 0 ke case m...Digit sum:1 + 1 = 2 so sum = 2 + 2 = 4
				//Now program again jumps to:Sumofdigit(2) then function returns 2 so in sum = 0 + 2 toh 2...and for 2nd time i = 11..Again program jumps to: Sumofdigit(11)....Return:2...so 2 + 2 = 4
				sum = sum + Sumofdigit(i); //prime factor ke digit ka sum lena hai toh ye funtion lake dega
				n = n / i;  // 22 / 2 toh number ho jayega 11 then 11 // 11 = 1
			}
			else {
				i++; // i 3,4,5,....11 hoga toh upar chal jayega
			}
		}
		if(sum_digit == sum) { // 4 = 4 hai
			return 1;
		}
		else {
			return 0;
		}
		
	}
	
	
//	sabse pehle sum of digit chahiye
	public static int Sumofdigit(int n) {
		int sum = 0;
		while(n>0) { //22>0 then 2 >0
			int rem = n%10; //22%10 = 2 then 2%10 toh 2 
			sum = sum + rem; // 0 + 2 = 2 then 2 pehle ka and ab wala 2 = 4
			n = n/10; // 22/10 = 2 then 2/10 = 0
		}
		return sum; //4
	}

}
