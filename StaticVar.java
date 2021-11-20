package day21;

public class StaticVar {
	
	static int no = 20;
	static int sayi; 
	static String adres = "leipzig";
	static String keyf;
	static boolean adamlik = true;
	static boolean Subhan;
	
	public static void main(String[] args) {
//	Bu variablelara direkt ulasilir.
		System.out.println(no);
		System.out.println(adres);
		System.out.println(adamlik);
		no++;
		System.out.println(no);
		adamlik= false;
		System.out.println(adamlik);
		staticMethod();
		System.out.println(no);
		StaticVar tarik = new StaticVar();
		tarik.dynamic();
		System.out.println("adamlik: " + no);
	}
	
	public static void staticMethod() {
		no++;
		System.out.println("static icindeki: " + no);
		
	}
	
	public void dynamic() {
//		Static varibalelara heryerden ulasilir bu yuzden 
		no++;
		System.out.println(no);
		
	}
	

}
