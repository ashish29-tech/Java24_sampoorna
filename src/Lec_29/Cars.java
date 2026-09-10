package Lec_29;

public class Cars {
	String color = "Red";
	int price = 9000000;
	int speed = 25;
	
//	override kiya toh...jo toString method ke andar content likha hoga wo string ke form m lake de dega
//	pehle address de rha tha ab content de rha hai...
//	String, Class, ArrayList in sabme toString likha tha apne hisab se...Array m aisa nahi tha toh array m content 
//	ka address aa rha tha...yha car m bhi nai likha tha toh address aa rha tha but yha hamne likh diya toh content ane lag gya
	@Override
	public String toString() {
		return "C "+color + " P " +price+ " S " + speed;
	}
	
//	yahi pe main method bna liya
//	yha niche toString method object ka chala hai...and agr upar override kar de toh kiska chalega ? Car class ka
	public static void main(String[] args) {
		Cars c = new Cars(); //car class ka object bnaya 
//		ye address kha se aa rha hai ?
//		jab kisi reference variable ko print karte hai toh ek toString naam ka method java ne bna
//		ke diya hai object class ke andar uska apne aap toString chal jata hai...
//		Array m jo address print hota tha wo bhi isi ki wjah se...and string m content print ho rha tha
//	 	toh wo bhi toString naam ke method ki wjah se ho rha tha and ArrayList m bhi content isi ki wjah se	
		System.out.println(c); //Object print kiya toh address print hoga...
	}
}
