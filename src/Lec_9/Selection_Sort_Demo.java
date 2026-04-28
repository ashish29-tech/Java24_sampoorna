package Lec_9;

public class Selection_Sort_Demo {
//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		is array m 2nd index se entire array m minimum value kya hai ye dhundna hai
		int [] arr = {4, -1, 5, 3, 2, 1, 7};
		
		System.out.println(min_form_ith_index(arr, 2)); //array liya hai and index pass kiya hai
	}
	public static int min_form_ith_index(int [] arr, int i) {
		int mini = i;//beginning wale ko minimum index maan lete hai...jha se i start ho raha hai
		for(int j = i+1; j<arr.length; j++) { //i+1 se start hoga cux i ko toh sabse chota maan ke chal rahe hai
			if(arr[j] < arr[mini]) { //current wale m value choti hai toh jo pehle se minimum maan rakha tha use change kar do...
				mini = j; 
			}
		}
		return mini;
	}

}

// answer 5 ayega cuz 2nd index se check karna tha and 2nd index se leke 6th index tak m 5th
// index pe 1 hai jo ki sbse chota hai 