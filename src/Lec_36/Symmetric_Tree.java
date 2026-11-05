package Lec_36;
// https://leetcode.com/problems/symmetric-tree/description/
//	Example 1
public class Symmetric_Tree {
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
		 
		class Solution {
		    public boolean isSymmetric(TreeNode root) {
//		        root1 and root2 kaise nikalenge ? root1 hoga root ka left and root2 hoga root ka right
		    	return isMirror(root.left, root.right);
		    }
//		    ek aur function bna lete hai
//		    root1 m original root ka left ka address yaad kar lenge and root2 m original root ka right ka address yaad kar lenge
//		    original root toh dono root1 and root2 ka part hoga toh...
//		    2 tree ka mirror image ka code and 1 tree self mirror hai ya nahi....in dono ka code same hoga cuz self mirror ko bhi yha 2 alag-alag tree m divide kar diya
		    public boolean isMirror(TreeNode root1, TreeNode root2) { //isme 2 root pass karenge
//		    	dono root1 and root2 ek sath null hai toh mtlb mirror hai
		    	if(root1==null && root2 == null) {
		    		return true;
		    	}
//		    	ye upar wala m ham ensure kar rahe hai ki dono root1 and root2 null nai tha
//		    	ya dono m se koi ek null nai hoga ya dono hi null nai hai
//		    	And is wale if chalne ka mtlb hai ki koi toh ek pakka null hai
		    	if(root1 == null || root2 == null) {
		    		return false;
		    	}
//		    	upar wale dono if ke neeche yha a gaye mtlb dono hi null nai tha
//		    	Toh data check karenge...data mismatch hua tab bhi nai hoga mirror
		    	if(root1.val!=root2.val) {
		    		return false;
		    	}
//		    	Ab recursion check karega...now root1 ka left and root2 ka right match kar gya and
//		    	root1 ka right and root2 ka left match kar gya...toh mirror
		    	boolean left = isMirror(root1.left, root2.right); //root1 ka left and root2 ka right ka comparison
		    	boolean right = isMirror(root1.right, root2.left);
		    	return left && right; //left and right mirror hoga toh return
		    	
		    	
//		    	2 tree exactly same hai ya nai uska logic/code....
//		    	Upar ke teeno if wali condition same rahegi
//		    	boolean left = isMirror(root1.left, root2.left); //left ko left sa compare karenge
//		    	boolean right = isMirror(root1.right, root2.roght); //right ko right se compare karenge
//		    	return left && right;
		    	
//		    	And 2 tree ka structure same hai ya nai uske liye
//		    	Structure m value compare nai karenge
//		    	Equal ka code hi rahegs bss usme niche jo if condition likhi hai wo nai hogi
//		    	upar ke dono if toh honge hi but 3rd if jisme data compare ho rha hai ye nai hoga
//		    	if(root1.val!=root2.val) {
//		    		return false;
//		    	}
		    }
		}
}
