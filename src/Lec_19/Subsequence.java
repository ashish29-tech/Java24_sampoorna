package Lec_19;

public class Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		Print(s, ""); //quest and ans pass kar diya....s m abc hai so abc , -(blank)...
	}
//	koi bhi question wali string hai...abc and ans wali string hai -(blank)
//	sabse pehle koi bhi string hogi uska 0th character pta karna....ch = ques.charAt(0)... abc ki index 012
//	function m pass kya karna ek baar toh jo ans tha wo as it is...and ek baar ans m char ko add kar denge...
//	mtlb f( ans) f( ans+ch) 
//	question m kya bhejna hai 0th index ke alawa entire string....0th means a ke alawa b c 
//	jo bhi string hogi uske susbstring 1
//	ans kab print karenge jab question ka length hi 
	
	//	ques = "abc"
	//	ans = ""
	//	ch = 'a'
	public static void Print(String ques, String ans) { //2 choice 2 calls...quest m abc save hoga and ans  m blank
		if(ques.length()==0) {
			System.out.println(ans); //ans ko print
			return; //yha se return
		}
		
		char ch = ques.charAt(0); //	sabse pehle koi bhi string hogi uska 0th character pta karna....ch = ques.charAt(0)... abc ki index 012
//		Har recursive call me hum pehla character process kar lete hain aur baaki string ko next call me bhej dete hain.
//		"abc".substring(1)....means "bc"...Kyuki index 1 se lekar end tak ki string return karta hai.
//		dono calls ko upar niche kar ke likh sakte hai...
//		Print("abc".substring(1), ""); and "abc".substring(1) will return "bc" so actual call ban jayegi...Print("bc", "");
//		ques.substring(1) se "bc" aya.
		Print(ques.substring(1), ans); //question ka substring 1...abc m a ko chor ke baki chahiye...toh substring karenge..toh bc milega..bc pass kiya hamne
		Print(ques.substring(1), ans+ch);
	}
	
} 
