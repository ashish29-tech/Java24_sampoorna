package Lec_18;

public class Print_Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		n=5 ke liye decreasing pattern print karna hai
//		5 se leke 1 tak ka loop chala ke bhi kar sakte hai but recursion se karna hai
		int n = 5;
		PD(n);
	}
//	hamare control m 5 ko print karna hai baki kaam recursion karega...4,3,2,1
	public static void PD(int n) {
//		base case
		if(n==0) {
			return; //jab return type void ho and function se bahar jana ho toh uske liye sirf return likhte hai.....jaise hi n ki value 0 hogi toh method se bahar kar dega...
		}
		
//	pehle khud ko print kar dete hai...
		System.out.println(n);
//		baki recursion print kar de...
//		Ye tail recursion cuz last statement recursive call hai and iske baad koi kaam nahi ho raha
		PD(n-1);
	}

}
