package Lec_11;

public class Gas_Station {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [] gas = {1,2,3,4,5}, cost = {3,4,5,1,2}; //ham 2 variable aise define kar sakte hai...
		int[] gas = { 1, 2, 3, 4, 5 };
		int[] cost = { 3, 4, 5, 1, 2 };
		System.out.println(canCompleteCircuit(gas, cost));
	}

	public static int canCompleteCircuit(int[] gas, int[] cost) {
		int total = 0;
//		Yha we are handling answer exist nai kar rha toh...
		for (int i = 0; i < cost.length; i++) {
//			hame gas - cost karna hai
			total += gas[i] - cost[i];
		}
//		total is less than 0 ho gya toh ans kabhi exist nahi karega
		if (total < 0) {
			return -1;
		}
//		answer hoga uske liye handle
		int sum = 0, idx = 0; // kon se index se start karna hai journey 0th index se
		for (int i = 0; i < cost.length; i++) {
			sum += gas[i] - cost[i]; //
//			agr ye sum negative nahi hai toh jisko start mana hai wahi start hoga
			if (sum < 0) {
//				agr hai 0 se kam toh 
				idx = i + 1; // idx m yaad kar liya i+1
				sum = 0; // sum ko o kar do
//			question gives us unique answer isliye ham 4 and 5 ko try bhi nahi kar rahe
			}
		}
		return idx;

	}

}
