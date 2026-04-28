package Lec_7;

public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Array given hai and element given hai...hame btana hai ye element kis index/position pe hai...agr nahi hai toh -1 btana
		int [] arr = {2, 3, 5, 1, 4, 11, 40, 51, 1, 15};
		int item = 4;
		System.out.println(Search(arr, item));
	}
//	return type hoga 
	public static int Search (int [] arr, int item) { //ek array hoga and element hoga jise search karna hai
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == item) {
				return i;
			}
//			yha else nahi likhenge bcoz pura array m dhundna hai jab tak pura traverse nahi kar lete tab tak -1 nahi karenge
		}
//		for loop se bahar nikal gaye mtlb pura array traverse kar liya and nahi mila toh
		return -1;
	}

}
