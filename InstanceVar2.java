package day21;

public class InstanceVar2 {
	
	String adres = "Ankara";
	String dogumyeri;
	double notort;
	double yasort = 12.3;
	char sembol= '#';
	char cha;
	boolean ogrenciMi = true;
	boolean izinliMi;
	
	public static void main(String[] args) {
		//instance variablelara main methodtan direkt ulasilamaz.
		//object olusturmaliyiz.
		
		InstanceVar2 ali = new InstanceVar2();
		
		System.out.println(ali.adres);
		System.out.println(ali.dogumyeri);
		System.out.println(ali.notort);
		System.out.println(ali.yasort);
		System.out.println(ali.sembol);
		System.out.println(ali.izinliMi);
		System.out.println(ali.cha);
	}
	
	public static void staticMethod() {
//		static bu metot da obje olusturmak lazim
		
	}
	
	public void dynamicMethod() {
		
		
		
	}

}
