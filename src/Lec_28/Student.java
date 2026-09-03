package Lec_28;

public class Student {
//	student class ke data member
//	yha data member ke sath kuch bhi nahi likha hai mtlb access modifier default hai 
//	private likh diya toh is Student class se bahar accessible nahi hoga
	protected String name = "kaju"; //protected kar diya ya default rehne diya toh is lec-28 m accessible hai isse bahar nahi
	private int roll = 16;
	private int age = 21;
//	constructor ka naam wahi rakha jata hai jo class ka naam hota hai...iska koi return type nahi hota
//	Student ka constructor non-parameterised
//	ek constructor m se dusre constructor ko call kar sakte hai ? Yess. Function m toh hota hai...constructor bhi ek tarike ka function hai.
	public Student() {
//	ek constructor ko dusre constructor m call karna hota hai toh this keyword se karate hai...ye third use case hai this ka 
//	ek class ka comstructor apne hi class ke dusre constructor ko call karna chahta hai toh this ke through karta hai
		this("rajesh",  17, 18); //ye rajesh, 17, 18 niche wale constructor ke parameter m chale jayenge
	}
//	Student ka constructor parameterised
	public Student(String name, int age, int roll_no) { //parameterised
		this.name = name;
		this.age = age;
		this.roll = roll_no;
	}
////	getter and setter bnaya...encapsulation ye method provide kar raha hai
//	public String getName() {
//		return this.name; //ye name lake de dega
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
	
//	Development m jab bhot jyada method honge toh itne sare methods banane padenge isse better shortcut...click above source, getter and setter....sare chahiye toh select all pe click
//	har kisi ka 2 bna hai ek get ka and ek set ka...
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
//	throws Exception mtlb...isme maybe exception aa sakta hai...jo call karega wo ready rahe bear karne ke liye 
	public void setRoll(int roll) throws Exception{ //jab exception generate hoga toh aage badha dega...apne paas nahi rakhega. 
//		set kar denge ki roll no. -ve na dal sake
		if(roll<0) {
//			return;
//			Roll no. agr -ve ho gya toh kya karna hai...
//			We want program se exception ko generate karna
//			exception class ka object bnana padega....isse address ayega...toh kahi capture karna padega but nahi karenge capture but throw likh denge
//			throw likh denge toh exception generate ho gya but ise resolve karna hoga....
//			Exception class ka object bnao isme string m jo bhi message print karana chahte hai wo karayenge...and throw keyword laga denge...toh Exception generate ho jayega..
			throw new Exception("bhai roll no -ve nahi hoga");//message jo bhi show karana chahte hai wo yha likhenge
		}
		this.roll = roll;
	}
	public int getAge() {
		return age;
	}
//	yha bhi Exception generate kara. Ye 2nd tarika hai jisme khud hi pareshan honge toh khud hi handle karenge
//	Is 2nd approach m try catch ka concept ata hai...and try catch hoga toh finally block padna hoga...

	public void setAge(int age) { //yha throws Exception nahi likh rahe cuz ye phir 1st tarika ho jayega...jo call karega wo jhele pareshani.
		try { //jo bhi danger code hoga use try block m likhenge
		if(age < 0) {
			throw new Exception("beta age -ve nahi hogi"); //jo exception generate ho rha hai wo exception class ka object hi toh hai...
		}
		this.age = age;
		}
//		problem with the 2nd approach is program toh exception ke baad bhi chal rha hai..1st wale m exception problem aya toh program apne aap deestablish ho rha tha but 2nd m nai ho rha..-9 dala tab bhi chal rha hai...
//		catch likh diya toh e naam ke variable m capture ho gya and ab is pure setAge ke bahar nahi jayega...yahi handle hoga exception
		catch(Exception e){ //catch block likha...jo bhi exception generate kiya toh object aya toh e naam ke variable m capture kar liya...isse hua kya
//			print kara toh Student client m -9 nahi aya...ham chahte hai abnormal behaviour aye
//			exception class m bhot sare methods bane hote hai...usme ek hota hai 
//			ye program ko terminate nahi karega...aage execute kiya but galat kha hai wo bta diya
			e.printStackTrace(); //ye btata hai kon se line se error aya and kis message ke sath
		}
//		2nd way m problem ke baad bhi data execute ho ja rha tha....toh uske liye finally
//		finally block m wo code likhna hota hai jo chalana hi chalana hota hai...
		finally { //excption aye ya na aye finally block chalega hi chalga...system ke failure hone pe bhi
			System.out.println("I am in finally");
		}
		System.out.println("Set_age_me hu");
	}
	
}
