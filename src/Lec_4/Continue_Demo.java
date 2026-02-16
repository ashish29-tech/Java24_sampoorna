package Lec_4;

public class Continue_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we want 2 na print ho baki sab print ho
		for(int i = 1; i<=5; i++) {
			if(i==2) {
				continue;
			}
//			if(i==2) {
//				break;
//			}
			System.out.println(i);
		}
	}

}
