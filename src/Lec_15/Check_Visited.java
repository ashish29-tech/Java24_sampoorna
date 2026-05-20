package Lec_15;

public class Check_Visited {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean [] visited = new boolean[6]; //boolean ka array bna liya
//		boolean array bnate hai toh by default false fill hota hai
//		Question ye hai ki array given hai...usme kahi true fill hai and kahi false...
//		hame check karna hai i se j ke beech m kisi bhi index pe true fill hai kya...
//		agr true hai toh mtlb array kaam ka nahi hai else kaam ka hai...
		visited[3] = true;
		visited[1] = true;
		visited[4] = true;
		System.out.println(isVisited(visited, 2, 5)); //2 se 5 ke beech m check karenge..
	}
//	i se j tak ka loop chala denge kahi true mil gya toh return false nahi mila toh return true
	public static boolean isVisited(boolean [] visited, int i, int j) { //array pass kar diya and sath m 2 index pass
		for(int k = i; k<=j; k++) { //i se start karenge and j tak chalayenge
			if(visited[k] == true) {
				return false;
			}
		}
		return true; // loop se bhr aa gaye toh mtlb safe hai...
	}

}
