package Lec_29;

public class Addition {
// Compile time polymorphism....joki method overloading hai. Isme inheritance nahi hota.
// Inheritance ka concept method overriding m ata hai. Overriding ke liye 2 different class hona jaruri hai...Parent and Child class.
	
//	Overloading m function ka name same hoga, return type bhi same hoga...bss function ke andar type of argument
//	ya no. of argument same hoga toh ye method overloading.
//	Same class m same naam ke methods ho...same return type ho...change sird no. of parameter ya type of parameter change honge...toh this is
//	method overloading. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(2, 3)); //2 ko call kiya toh 2 wala automatically chal jayega
		System.out.println(add(2, 3, 9));
		System.out.println(add(2, 3, 9.8));
//		suppose abhi nahi pta kitne add karne hai...jab argument dega user tab pta chalega...
//		user runtime m btayega jab function call karenge toh use kitne integer chahiye...
//		same type ka data hona chahiye mix nahi hona chahiye
//		Iske liye we have a concept called variable no. of argument
		System.out.println(add(2,3,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,2)); //
	}
	public static int add(int a, int b) {
		return a+b;
	}
	public static int add(int a, int b, int c) { //yha extra parameter hai 
		return a+b+c;
	}
	public static int add(int a, int b, double c) {
		return (int) (a+b+c);
	}
//	variable no. of argument....ye right m lagta hai...niche argument m diya hai... int... a
//	sare data ko array m bhar lega..
//	baki jitne bhi integer jaise variable agr isme banane hai toh... ye triple dot wale se pehle banega
	public static int add(int x, int... a) { //int x m upar ka 2 aa gya and baki a 
		int sum = 0;
		for(int i = 0; i<a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}

}
