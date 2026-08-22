package Lec_25;

public class Merge_Sort {
// Merge sort ki tc n log(n) hoti hai and sc O(n)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {7,5,4,3,1};
//	Merge sort m kya original array m changes hue hai ? Np. New array ban ke aya hai.
//	check karenge
//		sort function ko call karenge and arr ko call karenge toh unsorted data hi print hoga
		int [] ans = Sort(arr, 0, arr.length-1);
		for(int i = 0; i<ans.length; i++) {
			System.out.print(arr[i]+" "); //unsorted print hoga cuz original m changes nai aye hai
		}
	}
//	array ko sort karna hai...array ko reduce(2 hisso m divide) karna hai toh index paas karna padega
	public static int [] Sort(int []arr, int si, int ei) {
//		base case
//		Yahan base case ek single element ka sorted array bana ke return bhi kar raha hai, jise baad mein Merge() combine karega.
//		ek hi element bacha hai, aur ek element already sorted hota hai, isliye recursion ko wahi stop kar dete hain.
//		Agar dono same hain, iska matlab range mein sirf 1 element hai.
		if(si == ei) { //jab ek hi element bacha hai
//			ek new array bnate hai 1 size ka cuz 1 hi element hai
			int [] bs = new int [1];//Ab hum 1 size ka naya array bana rahe hain. Kyun? Kyuki hamare paas sirf ek element hai.
//			yha ei bhi likh sakte the...si == ei hai toh koi sa bhi chal jayega
			bs[0] = arr[si]; //Original array ka jo single element hai, usko naye array ke index 0 par daal do.
//			is new array ko return karenge
			return bs; //Ab hum ye sorted single-element array recursion ko wapas de rahe hain.
		}
		
		
//		mid nikal lete hai...0+4/2 = 2
//		start se leke mid tak ka left m gya hai and mid+1 tak ka pura data right m
		int mid = (si+ei)/2;
//		start se leke mid tak...
		int[] fs = Sort(arr, si, mid); // recursion bhai first part of array ko sort kar ke lake dede
//		mid + 1 se leke end tak recursion sort kar ke dede
		int [] ss = Sort(arr, mid+1, ei); //mid+1 
		return Merge(fs, ss); //dono array ko merge kar...sorted form m lake de dega
		
	}
//	merge 2 sorted array ka code as it is copy
	public static int[] Merge(int[] arr1, int[] arr2) { //return type array
		int i = 0, j =0, k=0; //3 pointer bna liye...k new array jisme dal rahe hai dono(i and j) sorted array ko
		int n = arr1.length, m = arr2.length;
		int [] ans = new int[n+m];
		while(i<n && j<m) {
			if(arr1[i]<arr2[j]) {
				ans[k]=arr1[i];
				k++;
				i++;
			}
			else {
				ans[k]=arr2[j];
				k++;
				j++;
			}
		}
		while(i<n) {
			ans[k]=arr1[i];
			k++;
			i++;
		}
		while(j<m) {
			ans[k]= arr2[j];
			k++;
			j++;
		}
		return ans;
	}
}
