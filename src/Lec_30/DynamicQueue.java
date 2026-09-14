package Lec_30;

import Lec_28.Queue;

public class DynamicQueue extends Queue{
//	lec_28 m dequeue, getfront, display wale se dikkat nahi hai
//	sirf element add karne wale method se dikkat hai toh use override karene
	

	@Override
	public void Enqueue(int item) throws Exception { //element pass kar diya
//		isFull wala concept full hai toh double size ka yha bhi banega
		if(isFull()) {
//			ek new array bnate hai
			int [] new_arr = new int[2 * arr.length]; //ye error de rha hai toh Queue(lec-28) wala protected banana padega
//			register m kiya hai...formula nikal ke aya
//			pehle array pe loop
			for(int i = 0; i < arr.length; i++) {
//				Lec_28 m jo front hai usko ko access karne ke liye protected banana padega
//				logic kya bna...new array ke arr[i] pe...array ke andar front+i
//				newarr[i] = arr(f+i)%array length
				int idx = (front+i)%arr.length; //ye formula.... Front + 0 = 0
//				
				new_arr[i] = arr[idx]; //new array of ith pe array of idx
			}
//			bahar aake
			arr = new_arr;
			front = 0;//front ko 0 pe la diya
		}
//		bahar ayenge toh yha bhi super wala mtlb parent wala method chalayenge
		super.Enqueue(item);
	}
//	Dynamic queue pe update bna lete hai 
	public static void main(String[] args) throws Exception { //main isi m bna liya
		DynamicQueue dq = new DynamicQueue();
		dq.Enqueue(10);
		dq.Enqueue(20);
		dq.Enqueue(30);
		dq.Enqueue(40);
		System.out.println(dq.Dequeue());
		System.out.println(dq.Dequeue());
		dq.Enqueue(50);
		dq.Enqueue(60);
		dq.Enqueue(70);
		dq.Enqueue(80);
		dq.Display();
	}
}
