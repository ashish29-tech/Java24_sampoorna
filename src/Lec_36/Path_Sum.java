package Lec_36;

//https://leetcode.com/problems/path-sum/description/
public class Path_Sum {
	 public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode() {}
		      TreeNode(int val) { this.val = val; }
		      TreeNode(int val, TreeNode left, TreeNode right) {
		          this.val = val;
		          this.left = left;
		          this.right = right;
		      }
		  }
		 
//		  kaise pta chelga ki leaf node hai ? left and right dono null hai honge...
//		 5 leaf node toh nahi hai...toh 5 collect kar lenge...
//		 ab baki ka 17 ka path left side se ban ke aa jaye ya right side se...
//		 2 path hai toh 2 call lagega... 1 leaf node ka 1 null ka
//	 	 2 call hai toh dono ka or le lenge
		class Solution {
		    public boolean hasPathSum(TreeNode root, int targetSum) {
//		        agr hamara root hi null pe ho gya toh target achieve nai ho sakta
		    	if(root==null) {
		    		return false;
		    	}
//		    	ya to ye leaf node hai...wo kaise pta chalega ? left and right dono null hai toh
		    	if(root.left == null && root.right == null) {
//		    		jo bhi target hai us target m se 7/root ka data ko minus check kar ke karenge ki 0 ho gya hai ?
//		    		0 ke barabar hai toh return true
		    		return targetSum-root.val==0;
		    	}
//		    	agr 0 ke barabar nahi hai toh...2 alag alag call lagayenge
//		    	pehla ka left m se minus root ka data
		    	boolean left = hasPathSum(root.left, targetSum-root.val);
//		    	aur yha se minus karenge dusre ka right
		    	boolean right = hasPathSum(root.right, targetSum-root.val);
//		    	in dono ka or le lenge
		    	return left || right;
		    }
		}
}















