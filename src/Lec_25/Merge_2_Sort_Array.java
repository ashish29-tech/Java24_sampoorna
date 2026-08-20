package Lec_25;

public class Merge_2_Sort_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2 sorted arrays given hai...in dono sorted array ko ek single array m merge karna hai wo bhi sorted hona chahiye
//		new array 12 size ka hoga
		int [] arr1 = {2,3,5,7,8};
		int [] arr2 = {1,3,5,8,9,11,13};
//		1st way hoga 12 size ka array bna lenge...pehle arr1 copy kar ke dal do then arr2 and sort kar do but iski complexity (n+m)*log(n+m)
//		But hame linear time m karna hai....waise karenge jaise arrays m maximum sum path wala kiya tha
//		ek pointer arr1 ke 0th index pe..i rakhenge and arr2 ke 0th index pe j rakhenge...and ek pointer new array ke liye bhi 
		
//		jab bhi array return type hoga toh Syso kar ke call nahi karna cuz isse addresa aa jayega
//		System.out.println(Merge(arr1, arr2)); //❌
		
//		array return ho rha toh kisi variable m capture 
		int []a = Merge(arr1, arr2);
		for(int i = 0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static int  [] Merge(int [] arr1, int [] arr2) { //return type array
		int i = 0, j = 0, k = 0; //3 pointer le liye..i arr1 ke liye, j arr2 ke liye, k new array jisme dal rahe hai dono sorted array
		int n = arr1.length, m = arr2.length; //dono sorted array ki length nikal li
		int [] ans = new int [n+m]; //new array bna lete hai...ans wala array bna lete hai
		while(i<n && j<m) { //dono range m hoga tab tak chalayenge...koi ek range se bahar hoga toh bahar aa jayenge...
			if(arr1[i]<arr2[j]) {
				ans[k]= arr1[i]; //agr i chota hai toh ans ke k pe...i ko rakhenge
				k++;
				i++;
			}
			else {
				ans[k]=arr2[j];//wrna ans ke kth index pe j ko rakhenge
				k++;
				j++;
			}
		}
//		range se bahar gya hoga toh koi ek bacha hoga ya toh i ya toh j
		while(i<n) {
//			i bacha hai toh
			ans[k] = arr1[i];
			k++;
			i++;
		}
		while(j<m) {
			ans[k] = arr2[j];
			k++;
			j++;
		}
		return ans;
	}
}
