package Lec_19;

public class Board_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		print(0, n, "");
	}
//	Ek hame chahiye ki ham kaha hai
	public static void print(int curr, int end, String ans) { //curr=0, n=4, ans= ""
//		if hamara curr end ke barabar ho jaye toh
		if(curr==end) {
//			ans print kar do
			System.out.print(ans+" "); //thora gap de dete hai ln hata diya and " " add kar diya
			return;
		}
		if(curr>end) { //curr end se bada ho gya toh
			return; //bahar aa jao
		}
		
//		i ki value 1 se leke jitne faces hai wha tak...
//		recursion ke andar loop...loop 3 baar chalega
		for(int dice = 1; dice<=3; dice++) { //har frame m loop 3 baar chalega...
			print(curr + dice, end, ans + dice); //dice ki value 1 hoti toh apne aap add ho jata...similarly 2 ke liye and 3 ke liye
		}
		
//		Hamare paas agr 10 faces hote dice ke toh 10 baar call dete...isse better for loop laga lete hai
////		Hamare paas 3 choice hai..dice pe 1 bhi aa sakta hai...
//		print(curr+1, end, ans+1); // Agr dice pe 1 aya toh curr wala pointer 1 se aage badhega...and string(ans) m bhi 1 concatinate kar denge..
//		print(curr+2, end, ans+2);
//		print(curr+3, end, ans+3);
		
	}
	
}
