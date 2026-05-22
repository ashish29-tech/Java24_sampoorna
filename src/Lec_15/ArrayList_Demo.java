package Lec_15;

import java.util.*;

public class ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Java m array, string, wrapper class...ye sab class hai. ArrayList bhi ek class hai.
//		Static means stationary, not moving....toh jaise integer hai kitne integer ane wale hai,
//		long, char...kitne hai ye pta nahi hai....toh mtlb size fixed nahi hai..age size fixed nahi hai
//		toh array nahi bna sakte...toh scene m aya ArrayList...size nahi bhi pta toh data add kar sakte hai...ArrayList m
//		ArrayList m primitive data allowed nahi hai...
//		ArrayList ek tarike ka generics hai...isme jab marzi integer add kar do, string add kar do, char add kar do...
//		
//		angular bracket ke andar data type rakhna hota hai...kis type ka data iske andar rakhna chahte hai
//		ye java ke andar library hai toh ise import karna padega...
//		ArrayList<int> = new ArrayList<>(); //primitive data allowed nahi hai toh
//		ArrayList<Integer> ll = new ArrayList<>(); //non-primitive rakh diya...Integer
		
		ArrayList<Integer> ll = new ArrayList<>(); //isme address aya hoga par print karenge toh khali ayeag...cuz ll ke andar address aya hoga but print content hoga
		
//		ArrayList<String> str = new ArrayList<>();
//		
//		ArrayList<Character> charac = new ArrayList<>(); //character ka array list bna diya
		
		System.out.println(ll); //print karenge toh khali ayeag
//		jaise array and string m length nikalne ke liye .length hota hai waise hi yha pe size method hota hai
		System.out.println(ll.size()); //abhi ek bhi element nahi hai toh 0 ayega
		
//		Add
//		get
//		update
//		remove
//		size()
//		display
		
//		add. 
		ll.add(10);//add method ka naam hai. piche-piche add hota jata hai...iski TC O(1) cuz piche-piche add ho rha hai toh constant time m hoga...
		ll.add(20); // O(1)
		ll.add(30);
		ll.add(333);
		ll.add(203);
//		Is add function ki complexity ? O(N)..kisi particular index pe add karenge toh data shift hoga..
		ll.add(1,-9);//1st index pe -9 add kar dega...1st hota hai index and 2nd hota hai data
		System.out.println(ll);
		System.out.println(ll.size());
		
//		get. Kisi particular index ka data chahiye use pass kar denge
		System.out.println(ll.get(2));
//		System.out.println(ll.get(5)); //index out of bond ayeag cuz 5th index exist hi nahi karta
		
//		update. 
		ll.set(2, 110); //2nd index ke data ko 110 bnana chahte
		System.out.println(ll);
		
//		delete
		System.out.println(ll.remove(2));; //2nd index ka data delete/remove karna chahte hai
		System.out.println(ll); //yha check karenge toh dikhega 110 remove ho gya hai
		
//		jaise list ko sort karne ke liye Array.sort yha collections.sort() hota hai
		Collections.sort(ll);
		System.out.println(ll);
	}

}
