package Lec_15;

import java.util.ArrayList;

public class ArayList_Demo_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		capacity and size difference
//		capacity means max kitna size ho sakta hai and size means abhi currently kitna size hai
//		we can increase it's capacity....100 likha toh by default 10 se 100 ho jayegi
		ArrayList<Integer> ll = new ArrayList<>(); //iski default capacity 10 hoti hai...we can't see
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(2);
		ll.add(33);
		ll.add(1, -9);
		ll.add(301);
		ll.add(21);
		ll.add(313);
		ll.add(-91);
		System.out.println(ll.size());
//		current capacity 10 now we'll try to add 7. So multiply by 1.5 so... 10 * 1.5 = 15
//		15 size array will be created...and all data will be copied by java...and 7 will be 
//		added. Now new array will be remembered by java.
//		so remember array ki default capacity hoti hai 10...and 1.5 se grow karta hai..
		ll.add(7);
		System.out.println(ll);
		 
	}

}
