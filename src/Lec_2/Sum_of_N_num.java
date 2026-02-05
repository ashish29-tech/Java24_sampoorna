package Lec_2;

public class Sum_of_N_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int i = 1; // counter → kaunsa number add kar rahe
		int sum = 0; // accumulator → total jama karta
		while(i<=n) { //
			sum = sum + i; //first time 0+1..niche sum m 1 hoga then 
			i+=1; //i = i + 1;
//			System.out.println(sum); wrong
		}
		//loop ke bahar final answer isliye print bhr
		System.out.println(sum);
		
	}

}
