package Lec_34;

import java.util.Queue;
import java.util.LinkedList;

public class LinkedList_Java1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Kai jgah queue aisa bana hota hai
		LinkedList<Integer> q = new LinkedList<>();
//		Queue bna rahe hai toh add...addLast ki trah behave karta hai
		q.add(10); //yha add ka mtlb addLast hai yha pe
		q.add(20);
		q.add(30);
		q.add(40);
//		Agr remove addFirst karna hoga toh...addFirst likhna padega
		System.out.println(q.remove()); //yha remove by default removeFirst hai
//		Queue<Integer> q....ye ek tarike se parent hai 
//		new LinkedList<>();...ye ek tarike se child hai
//		Toh child wala hi function use hoga
		Queue<Integer> q1 = new LinkedList<>();
//		Queue java m interface hota hai....ise new nahi kar sakte
//		Toh jab bhi Queue ka question solve karna hoga toh aise solve karenge...
		q1.add(10);
		q1.add(110);
		q1.add(109);
		q1.add(1);
		q1.add(879);
		System.out.println(q1.remove()); //Ye pop wala nature aa gya
	}

}
