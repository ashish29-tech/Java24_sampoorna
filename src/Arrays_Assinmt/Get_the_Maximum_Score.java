package Arrays_Assinmt;

public class Get_the_Maximum_Score {
//	https://leetcode.com/problems/get-the-maximum-score/description/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 = {2,4,5,8,10};
		int [] arr2 = {4,6,8,9};
		System.out.println(Maximum_Score(arr1, arr2));
	}
	public static int Maximum_Score(int arr1 [], int arr2 []) {
//		pure sum ko long le liya...cuz mod wale ke liye int nahi chal rha
//		sare variable ko long bna lenge integer ke badle...and last m typecast kar ke integer m return kar do
		long sum1 = 0, sum2 = 0, ans = 0;
//		approach
//		ek pointer arr1 pe and ek pointer arr2
//		sabse pehle kisko badhana chahiye ? i ya j ? j ko. Why ? cuz chote se bade ko compare karna hoga na wrna same no. milega hi nahi
//		pehle toh j chota hai toh badha denge then j 5 pe and i 3 pe...toh i ko badhayenge..
//		pehla same no. dhundne ki koshish kar rahe hai...
//		2,3,7,10,12,15,30,34 
//		1,5,7,8,10,15,16,19
//		i se 7 tak ka sum and j se lekar 7 tak ka sum...
//		arr1 ka start point p=0 and arr2 ka start point q=0...
//		Toh p se leke i tak ka sum and q se leke j tak ka sum... nikal lenge and jo max hoga use add kar lenge
//		now p and q ko set kar denge...i+1 and j+1 pe respectively. i and j toh badhega hi par p and q ko bhi set kar diya
//		
		int i = 0, j=0, p=0, q=0;
		int mod = 1000000007; //10*9 + 7
		while(i<arr1.length && j<arr2.length) { //i arr1 and j arr2 pe kaam kar rha hau
			if(arr1[i]<arr2[j]) {
//				jo chota hai use aage badhayenge
				i++;			
			}
			else if(arr1[i]>arr2[j]) {
				j++;			
			}
			else { //jab equal hoga i and j toh us case ke liye
				sum1 = sum_array(arr1, p, i); //p se leke i tak ka sum....pehle array ka sum
				sum2 = sum_array(arr2, q, j); //q se leke j tak ka sum
//				ans m use add karenge jo maximum hoga
//				mod le lenge. Jab kuch add kare toh ho sakta hai long se bahar chala jaye isliye overall pe bhi mod 
				ans = (ans + (Math.max(sum2, sum1))%mod)%mod; //ans m plus ho jayega
				i++; j++; //i ko aage badhayenge, j ko aage badhayenge
				p = i; //i ko p pe rakh denge
				q = j; //j ko q pe rakh denge
			}
		}
//		again sum1 and sum2 nikaleenge
		sum1 = sum_array(arr1, p, arr1.length-1);
		sum2 = sum_array(arr2, q, arr2.length-1);
//		jo bhi max ayega use ans m add kar lenge
		ans = (ans + (Math.max(sum2, sum1))%mod)%mod;
//		yha mod lene ke jarurat nahi hai
		return (int)(ans); //integer m typecast kar diya...cuz return type toh integer hi hai
	}
//	range m sum nikalne ke liye code...toh ye i se j tak ka sum nikal ke de dega
	public static long sum_array(int[] arr, int i, int j) { //ek array bhejenge and sath m 2 index...wha tak ka sum btayega ye
		long sum = 0;
		for(int k = i; k<=j; k++) { //i se leke j tak ka loop
			sum+=arr[k];
		}
		return sum; 
	}
}
