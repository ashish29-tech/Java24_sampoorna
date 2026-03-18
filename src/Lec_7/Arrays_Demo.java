package Lec_7;
import java.util.Arrays;
public class Arrays_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ye 1D array ka ek variable bna hai..jiska name a hai...and kis type ka integer ka 1D array.
//		int []a; //1D array mtlb access karne ke liye 1 coordinate chahiye...
//		int [] arr; //ek arr naam ka var bna hai jiska type integer ka 1D array.
//		int [][]arra;//2D array
//		int [][][]arrayy;//3D array
//		
//		long [] arrraayy;
//		char [] arrrayy;
		
		int [] arr = new int[5]; //integer ka array hai and 5 bucket wala chahiye
		System.out.println(arr); //ek address print hua....[I@4617c264...I means integer ka array..bracket means 1D array...@ ye separator hai..baki hexadecimal hash code hai
		System.out.println(Arrays.toString(arr)); //actual values....[0, 0, 0, 0, 0]
		
		
		//value set
		arr[0] = 5;
		arr[1] = 7;
		arr[2] = 9;
		arr[3] = 11;
		arr[4] = 5;
		
		//print
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		int [] other = arr; //isse new array banega ? no. Earlier arr was pointing to 2k location now other will also be pointing.
		System.out.println(other.length); //array ka length pta chalta hai...
	}

}
