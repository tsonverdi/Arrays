package day21;

public class C02_LoopVaribales {

	public static void main(String[] args) {
		
		int sayi =10;
		for (int i = 0; i < 6; i++) {
			String isim = "Ali";
			System.out.println(sayi + " " + isim);
				
//			Loopicinde olusanlar loop icinde kalir
//			Bazi durumlar haricinde genelde onceden bir deger atarsin
//			zaten degistirecegimiz icin bir problem olmaz
		}
		
		for (int i = 0; i < 10; i++) {
//			int sayi=20;
//			Main ethodun icindeki bir varibalei tekrardan tanimlaymayiz
//			Cunku scope u looplari kapsar.
			String isim = "Tarik";
			int sayi2 = 20;
		}
		
		

	}

}
