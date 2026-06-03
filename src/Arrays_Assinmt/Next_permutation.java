package Arrays_Assinmt;

public class Next_permutation {
// https://leetcode.com/problems/next-permutation/description/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2, 3, 1};
		Permutation(arr);
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void Permutation(int []arr) {
//		1st step... p find kar rahe hai
		int p = -1; //p ko -1 pe set kiya taki dusra wala condition track kar paye....3,2,1 ke case m p nahi milega isliye -1 pe set kiya
//		array ki length n hai toh n-2 se start karenge loop 
		for(int i = arr.length-2; i>=0; i--) { //loop chalayenge arr.length-2 se 
			if(arr[i]<arr[i+1]) { //if arr of i se smaller than arr i + 1 se toh...aage wale element se chota nikal gya toh
				p = i; //p m yaad kar liya i ko 
				break; //aur yahi se break kar do
			}
		}
//		now we are checking next permutation possible hai...aise wala array ke liye {3,2,1};
//		is case m na p milega na q milega...toh is case m pura array ko reverser karna hai
		if(p==-1) {
			Reverse(arr, 0, arr.length-1); //o se lekar entire array ko 
			return; //yahi se return kar ja
		}
//		now 2nd step....q ka pta lagayenge
//		piche se p se pehle tak ka loop lagayenge...
//		last index se...check karenge p se just badi value
//		agr hai toh q ko yaad karenge...and yahi se break
		int q = -1; //q ko bhu -1 pe set kiya
		for(int i = arr.length-1; i>p; i--) { //last inde se start karenge...p se pehle tak jana hai
			if(arr[i]>arr[p]) { //abhi wali value age p se badi nikal gayi
//				toh matlab q mil gya 
				q = i;
				break; //aur yahi se break kar do
				
			}
		}

//		toh p & q ko swap kar denge array m se 
		int temp = arr[p];
		arr[p] = arr[q];
		arr[q] = temp;
		
//		reverse karenge p+1 se entire array
//		reverse method ko call kiya p+1 se leke array.length-1 tak pura reverse
		Reverse(arr, p+1, arr.length-1);
	}
	public static void Reverse(int []arr, int i , int j) {
		while(i<j) {
			int temp = arr[i];
			arr [i] = arr[j];
			arr [j] = temp; 
			i++;
			j--;
		}
	}
	
}
