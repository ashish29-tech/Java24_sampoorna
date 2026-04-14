package Lec_10;

public class Majority_Element {
//	Moore voting algorithm.....
//	We can do this question through Hashmap but we have not read it so far.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2, 2, 1, 1, 1, 2, 2};
		System.out.println(MooreVoting(arr));
	}
	public static int MooreVoting(int[] arr) {
//		sabse pehle majority element 0th index maan lete hai
		int e = arr[0];
		int vote = 1;
//		vote karenge 1 to index length
		for(int i = 1; i<arr.length; i++) {
//			ya toh vote karega ya nahi karega
			if(arr[i] == e) { //if current element majority element ke barabar hai toh
				vote++;
			}
//			if current element majority element ke barabar nahi hai toh
			else {
				vote--; //vote kaat do
				if(vote == 0) { //if vote ki value 0 ho gayi 
					e = arr[i]; // current element ko majority element maan lo
					vote = 1; //vote ki value 1 kar denge cuz khud ko majority maan liya
				}
			}
		}
		return e; //jo e m hai wahi winner hai 
	}

}
