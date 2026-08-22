package Lec_25;

public class Quick_Sort {
// Quick sort new array nahi deta...original array m changes kar ke dta hai
// Quick sort m kisi ek element ko pakad lo it could be 1st, mid, last....in teeno m se ek
//and jisko bhi pakdo usko array m is tarike se shi karo ki usse sare chote data left m and sare bade data right m 
//Quick sort m space complexity constant hota hai cuz we are not using extra space jo bhi changes kar rahe hai wo same array m kar rahe hai
//Quick sort ki Best case and average case n log n hota hai and worst case n^2 hota hai ans isko overcome karne ke liye randomized quick sort karenge...toh phit n log n ayega
//Space complexity quick sort ka O(1) hota hai
//Partition se ham ek element ko shi kar kar ke...array ko 2 hisso m divide kar rahe hai and un dono m dobara se saric chize kar rahe hai
//	Quick Sort: Partition ko baar-baar smaller subarrays par apply karta hai.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {5, 7, 2, 1, 8, 3, 4}; //arr.length = 7
		Sort(arr, 0, arr.length-1);//Index 0 se 6 tak poora array sort karo.
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
//	return type void rakhenge cuz same hi array m changes kar ke de rha hai
	public static void Sort(int [] arr, int si, int ei) { //array ko reduce karne ke liye index paas karenge
//		base case
//		ya toh array m ek element bach jaye ya na bache cuz dono side se pointer chal rha hai...ek element bach jaye toh sorted hi hoga ya pointer cross kar jaye
		if(si>=ei) {
			return;
		}
//		partition ko btayenge last element ko kis index pe lekar aye hai
//		Partition ke baad:
//		2  1  3  4  8  5  7
//         		 ↑
//      	   idx=3
		int idx = Partition(arr, si, ei); //partition ko call kiya 
//		quick sort bhai start se leke partition wale index se pehle tak ka data sort kar de
		Sort(arr, si, idx-1); //si = 0 and idx = 3.... Sort(arr, 0, 2); ye partition ke paas jayega
//		idx = 3, ei = 6....Sort(arr, 4, 6);
		Sort(arr, idx+1, ei); //quick sort bhai partiton wale baad se leke entire data ko sort kar de
	}
	
//	partition wala code copy paste karenge
	public static int Partition(int[] arr, int si, int ei) {
		int item = arr[ei];
		int idx = si;
		for(int i = si; i<ei; i++) {
			if(arr[i] <= item) {
				int temp = arr[i];
				arr[i] = arr[idx];
				arr[idx]= temp;
				idx++;
			}
		}
//		last index ko idx ke sath swap kar rahe hai
		int temp = arr[ei];
		arr[ei] = arr[idx];
		arr[idx]= temp;
		return idx;
	}
}
