package Arrays_Assinmt;

import java.util.Scanner;

public class Help_Ramu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		multiple test case ke liye
		int t = sc.nextInt();
		while(t>0) {
//		According to question input le lenge....
		int c1 = sc.nextInt();
		int c2 = sc.nextInt();
		int c3 = sc.nextInt();
		int c4 = sc.nextInt();
		int n = sc.nextInt(); //no. of Rickshaws....n
		int m = sc.nextInt(); //no. of Cabs.....m
		int [] ride_rickshaws = new int [n];
//		input lete hai har rickshaw ko kitna ride lena hai....2
		for(int i = 0; i < ride_rickshaws.length; i++) {
			ride_rickshaws[i] = sc.nextInt();
		}
//		input lete hai har cab ko kitna ride lena hai.....3
		int [] ride_cab = new int[m];
		for(int i = 0; i < ride_cab.length; i++) {
			ride_cab[i] = sc.nextInt();
		}
//		function nahi bna rahe direct code likh rahe
//		sabse pehle c1 and c2 m compare karna hai
		int Cost_rickshaw = 0;
//		rickshaw ke har ride pe loop
		for(int i = 0; i<ride_rickshaws.length; i++) {
//			add karna tha...kitne ride i th rickshaw pe lena hai...into c1 wala ticket....iska min c2 se check kiya
			Cost_rickshaw+=Math.min(ride_rickshaws[i]*c1, c2); //(2*1, 3) ka min toh 2 ayega toh Cost_rickshaw m add kar liya...then 5*1,3 = 3 lenge...toh 2 + 3 = 5
		}
//		inka minimum c3 ke sath lena tha
		Cost_rickshaw = Math.min(Cost_rickshaw, c3); //c1 and c2 se calculate kiya use...c3 se check kiya
//		same chiz karenge cab ke liye
		int Cost_cab = 0;
		for(int i = 0; i<ride_cab.length; i++) {
			Cost_cab+= Math.min(ride_cab[i]*c1, c2); //4*1,3 ka min...4*1,3 ka min....4*1,3 ka min....total 9 
		}
		Cost_cab = Math.min(Cost_cab, c3); //cab ka cost nikal lene baad c3 se compare...9 ko compare kiya 7 se toh 7 store kar liya 
//		rickhsaw ka total 5 and cab ka total 7....total 12 ho gya ise compare kiya c4 which is 19 toh 12 aya min...ans m store kiya and print
		int ans = Math.min(Cost_rickshaw+Cost_cab, c4); //jo final ans hoga...rickshaw ka cost + cab ka cost...ko compare with c4
		System.out.println(ans);
		t--;
		}
	}

}
