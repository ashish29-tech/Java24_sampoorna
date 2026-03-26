package Lec_8;

public class Trapping_Rain_Water {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		✔️ Steps:
//	1.	Left max nikalo
//	2.	Right max nikalo
//	3.	Dono me se minimum lo
//	4.	Usme se current height minus karo
//		👉 Result = us index pe water
//		👉 Phir sum mein add karte jao
//		Step 6: Return answer.....return sum;.......👉 Final total trapped water return
//		
		int [] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		System.out.println(Trapping(arr));
		System.out.println(Trapping(arr));
	}
	public static int Trapping(int []arr) { //arr = height array
		//array ki length nikal lete hai
		int n = arr.length; //n = total bars ki count
//		same size ke 2 array bnate hai
		int [] left = new int [n]; //left[i] → i tak ka maximum height from left
		int [] right = new int [n]; //right[i] → i tak ka maximum height from right
		left[0] = arr[0]; //Pehle index pe koi left nahi hota....Isliye direct assign
		for(int i= 1; i < right.length; i++) { //Loop 1 se start hoga...
//			Dono me se max leke store karte hain
			left[i] = Math.max(left[i-1], arr[i]); //Har step pe:left[i-1] = previous max...arr[i] = current height
			
		}
//		right
//		Right se left direction mein loop
		right[n-1] = arr[n-1]; //Last index pe right side kuch nahi hota...Isliye direct assign
		for(int i = n-2; i>=0; i--) { //n-2 se start kiya means..6th index se chalega
//		Har step pe:right[i+1] = right side max....arr[i] = current height...Max store karte hain
			right[i] = Math.max(right[i+1], arr[i]);
		}
//		Total water store karne ke liye variable
		int sum = 0;
//		Har index ke liye water calculate:
		for(int i = 0; i<n; i++) {
//			water = min(left[i], right[i]) - height[i]
			sum = sum + Math.min(left[i], right[i]); //sum m add karenge...left and right of i ka minimum and usme se arr of i - kar denge
		}
		return sum;
			
	}

}
