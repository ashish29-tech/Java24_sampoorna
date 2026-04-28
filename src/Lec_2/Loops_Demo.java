package Lec_2;

public class Loops_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//in case we forget above public static void main...then main ctrl + space
		
		//print hello 5 times
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		
		//loop flowchart
		//remember how many times loops needs to run
		//we need a counter.... i = 0
		//then condition kab tak loop chalana hai
		//work..like increase value of i... i = i + 1;
		
		//Mainly We have 3 types of loops....while, for, do while..and another extra...for each
		
		int n = 5; //n pta hona chahiye
		int i = 1; //counter
		while(i<=n){ //condition check 1<=5;
//			System.out.println(i); //sirf yahi hoga toh isse infinite loop chal jayega
			System.out.println(i);
//			i=+1; //isse infinite loop...isse value set hoti hai
//			i = i+1; //isse value increment hoti hai
			i+=1; // i = i + 1;
			
		}
	}

}
