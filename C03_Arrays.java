package day21;

import java.util.Arrays;

public class C03_Arrays {

	public static void main(String[] args) {
//		
		String arr[] = new String[4];
		arr[0] = "Ali";
		arr[1] = "Veli";
		arr[2] = "Ayse";
		arr[3] = "Fatma";
		
	
		String arr2[] = {"Ali", "Veli", "Ayse", "Fatma"};
	
		arr[0] = "Can";
		arr[2] = "Gul";
//		System.out.println(arr[0]);
//		Son element
//		System.out.println(arr[arr.length-1]);
//		Stringteki lenght arti parantez idi burada ise sadece
//		Length
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
//			Burada lengtihinin bir eksigi index oldugu icin loop oraya kadar gidiyor
//			Sonra orada duruyor
		}
		System.out.println(Arrays.toString(arr));
//	Bu koseli parantezle veriyor. Javanin Arrays classi icin olusturdugu bir
//		metot.
	}
	

}
