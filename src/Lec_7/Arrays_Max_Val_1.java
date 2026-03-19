package Lec_7;

public class Arrays_Max_Val_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		without considering first element as the max element.
//		In this approach we'll start with - infinity ....as there is no such thing as -infinity in coding
//		so we have Math.Max value....which is -2^31 to 2^31-1...ye integer ki range
		int [] arr = {2, 3, 5, 1, 4, 11, 40, 51, 1, 15};
		System.out.println(max1(arr));
		System.out.println(max2(arr));
	}
	public static int max2 (int [] arr) {
//		- infinity likhna hai but coding m aisa nahi hota toh...integer ki range...-2^31 ko ham -infinity consider karenge
//		and 2^31-1 ko + infinity
//		int m = Integer.MAX_VALUE; // + infinity ko aise likhte hai....yha ham ise 2^31-1 man rahe hai
		int m = Integer.MIN_VALUE; // - infinity ko aise likhte hai....yha ham ise -2^31 man rahe hai
		for(int i = 0; i<arr.length;i++) {
//			if(arr[i] > m) {
//				m = arr[i];
//			}
//			java m ek library hoti hai...Min and Max nikalne ke liye 
//			2 no. ka max nikalne ka ye bhi tarika hota hai....
			m = Math.max(m, arr[i]); //m and arr[i] ka jo bhi max value hoga wo m mai save ho jayega
		}
		return m;
	}
	
	public static int max1 (int [] arr) {
		int m = arr[0];
		for(int i = 1; i<arr.length;i++) {
			if(arr[i] > m) {
				m = arr[i];
			}
		}
		return m;
	}

}
