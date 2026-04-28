package Lec_10;

public class First_Bad_Version {
//	Ye nahi chalega cuz hamare paas is bad version nahi hai...toh leetcode pe run karna hoga
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	    public int firstBadVersion(int n) { //hame sirf n pta hai...example m input m bad =4 leetcode ne apne reference ke liye liya hai...so 1 hi input accessible hai...
	    	int lo = 1;
	    	int hi = n;
	    	int ans = 0;
	    	while(lo<=hi) {
	    		int mid = lo + (hi-lo)/2;
	    		if(isBadVersion(mid)==true) { //agr ye true hai toh...
	    			ans = mid;
//	    			but hame apne ans ko minimize karna hai...agr mid bad hai toh uske aage ke sare bad honge toh...
//	    			usse pehle ka bad chahiye hame
	    			hi = mid-1; //hi ko mid - 1 pe le ayenge
	    			
	    		}
	    		else {
	    			lo = mid+1;
	    		}
	    	}
	    	return ans;
	    }
//	    ye error na de islye ye function bna diya
	    public static boolean isBadVersion(int mid) {
	    	return false;
	    }
	
}
