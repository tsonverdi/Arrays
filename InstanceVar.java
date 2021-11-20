package day21;

public class InstanceVar {
	
	int not1 = 50;
	int not2;
	String a;
	boolean hasan;
	
//	instance variablelarin scopeunda main method yoktur.
	
	public static void main(String[] args) {
		
//		System.out.println(not1);  //main method static oldugu icin 
									
		//static olmayan variable direkt kullanilamaz veya goruntulenemez
//		Obje olusturup obje uzerinden static ollmayan variablelari kullaniyoruz.
//		Object orientation yani aslinda.
		
		InstanceVar celil = new InstanceVar();
		System.out.println(celil.not1);
		
		InstanceVar nihal = new InstanceVar();
		nihal.not1=70;
//		instance variablelarda deger atamazsak java instance olarak atanan degeri alir
//		ama istersek deger de atayabiliriz,
//		bu durumda deger atadigimiz obje icin yeni deger gecerli olur.
		
		System.out.println(celil.not1);
		
		celil.method2();//method iki static olmadigi icin static main methoda direkt cagiramiyoruz.
		
		System.out.println(celil.a);
	
	}
	
	public static void staticMethod () {
		
		
	}
	
	public void method2 () {
		System.out.println(not2);
//		null gibi, int icin 0dir default degeri
		
	}

}
