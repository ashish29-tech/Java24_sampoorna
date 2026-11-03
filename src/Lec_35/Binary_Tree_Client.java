package Lec_35;

public class Binary_Tree_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	User jab yha binary tree ka object bnayega...toh user manega ki binary tree create ho gya..
//		ab constructor chalega
//		//		10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false		
		Binary_Tree bt = new Binary_Tree();
		bt.Display(); //ye error show karega...nn pe. Root private hai. Toh root paas nai kar sakte. Root ko public bhi nai bna sakte cuz koi bhi fir root ko null kar dega toh tree khtm ho jayega
	}

}
