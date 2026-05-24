package Lec_15;

//import java.util.ArrayList;
import java.util.*;

public class ArrayList_Demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		ArrayList<Integer> ll = new ArrayList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		ll.add(60);
		ll.add(70);
//		print karne ke liye
		System.out.println(ll.get(0));
		System.out.println(ll.get(1));
//		better way to print
		for(int i = 0; i<ll.size(); i++) { //size tak ka loop laga diya
			System.out.print(ll.get(i)+" ");
		}
		System.out.println(); //line change
		
//		ek hota hai for each loop ye Array and ArrayList dono pe lagta hai
		int [] arr = {2,3,5,1,4,11,40,51,1,15}; //array bna liya
//		ek baar array pe lagayenge loop and ek baar ArrayList pe
		for(int v :arr) { // : kar ke array ka naam...array m data integer ka hai toh integer variable bna liya
			System.out.println(v+" "); //value read karega
		}
		System.out.println();
		for(int v:ll) { //integer variable bna liya
			System.out.println(v+" ");
		}
	}

}
