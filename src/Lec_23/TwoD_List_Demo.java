package Lec_23;

import java.util.*;

public class TwoD_List_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Hame arrayList bnana hai...
//		arrayList ki jgah left hand side m list likh dete hai...kaam sara arrayList wala hi karna hai..
//		List<Integer> ll = new ArrayList<>();  //isse 1D list bna 
//		Hame 2D list bnana hai. Jaise 2D array collection of 1D array hota tha similarly 2D list will be collection of 1D list
		List<List<Integer>> ll = new ArrayList<>(); //issse ek khali list bna 
//		3 new ArrayList ek ek kar ke add kar diya
		ll.add(new ArrayList<Integer>()); //iska address 2K upar list m dal diya
		ll.add(new ArrayList<Integer>()); //iska address 5K upar list m dal diya
		ll.add(new ArrayList<Integer>()); //iska address 7K upar list m dal diya
//		ll.get(1) se 1st index pe .add(2) kiya toh 2 add ho jayega 
		// get(1) -> 2nd row return karega.
		ll.get(1).add(2); //ll.get(1) kiya toh 1st index mila 
		ll.get(1).add(9); //1st index m 9 bhi add ho jayega
		// Output: [[], [2, 9], []]
		System.out.println(ll);
		// 2nd row ka 1st element
		System.out.println(ll.get(1).get(0)); //1st index ka 0th index
		// Outer list ka size = total rows
		System.out.println(ll.size()); //2D list ka size btayega....row btayega
	}

}
//ArrayList dynamic size ka hota hai.
//Isme manually size declare nahi karna padta.

//2D Array me sab rows ki length fixed hoti hai (agar jagged na ho),
//lekin 2D List me har row ka size alag ho sakta hai.

//ll.get(i) -> i-th row (1D List) return karta hai.
//ll.get(i).get(j) -> i-th row ka j-th element.
//add() se element end me insert hota hai.

//Outer list rows store karti hai.
//Inner lists actual data store karti hain.
